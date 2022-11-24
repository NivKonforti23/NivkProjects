import createtextfile.writetextfile;
import movielist.MovieList;
import pages.basePage;
import showinfo.results;
import showinfo.showInfo;
import pages.searchPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;



public class Testing extends MovieList {
    MovieList movieList = new MovieList();
    searchPage SearchPage = new searchPage();
    WebDriver driver = initDriver();
    basePage BasePage = new basePage();
    showInfo ShowInfo = new showInfo();
    public ArrayList<String> filteredList;

    @Test
    public void imdbsearch() throws InterruptedException, IOException {
        getShowsWithMinRating();
        createMovieTxtFile();

    }

    public void setFilteredList(ArrayList<String> filteredList) {
        this.filteredList = filteredList;
    }

    public ArrayList<String> getFilteredList() {
        return filteredList;

    }

    public void getShowsWithMinRating() throws InterruptedException, IOException {
        ArrayList<String> filteredList = new ArrayList<String>();
        MovieList movieList = new MovieList();
        double minRating = 5.0;
        movieList.setListCounterToZero();

        for (String str : movieArrayList()) {
            SearchPage.searchTvshow(driver);
            SearchPage.getShowInfo(driver);
            if (ShowInfo.getShowGrade() >= minRating) {
                filteredList.add("Name:" + " " + ShowInfo.getShowName() + "    " + "Rating:" + "  " + ShowInfo.getShowGrade());

            }
        }
        for (int i = 0; i < filteredList.size(); i++) {

            System.out.println(filteredList.get(i));
        }

        driver.quit();
        setFilteredList(filteredList);

    }




    public void createMovieTxtFile() throws IOException, InterruptedException {
        writetextfile textFile=new writetextfile();
        ArrayList<String> resultList=getFilteredList();
        textFile.createNewFile();
        textFile.writeIntoFile(resultList);



    }
}




