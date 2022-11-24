package movielist;

import driver.DriverObject;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;
import java.util.ArrayList;

public class MovieList extends DriverObject {
    private String listName;
    public int counter;


    public ArrayList<String> movieArrayList(){
        ArrayList<String> movieList= new ArrayList<String>();
        movieList.add("The Sopranos");
        movieList.add("The Avengers");
        movieList.add("Vikings");
        return movieList;
    }
    public void setListName(String listName){
        this.listName=listName;

    }
    public String getMovieListName(){
        String movieListName=this.listName;
        return this.listName;
    }
    public void setListCounter(int counter){
        this.counter=counter;

    }
    public int getListCounter(){
        int counter=this.counter;
        return this.counter;
    }
    public void setListCounterToZero(){
        this.counter=0;

    }
}
//for every name
//execute a loop that typing it, clicking it, getting rating