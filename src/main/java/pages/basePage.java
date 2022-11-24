package pages;
import driver.DriverObject;
import movielist.MovieList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class basePage extends MovieList {

    MovieList movieListClass = new MovieList();

    public void clickSearchBox(WebDriver driver) {
        driver.findElement(By.id("suggestion-search")).click();
    }
    public void typeKeyText(WebDriver driver){
        movieListClass.movieArrayList();
     driver.findElement(By.id("suggestion-search")).sendKeys(movieArrayList().get(getListCounter()));
     counter++;

    }
    public void clickOnFirstOption(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("react-autowhatever-1--item-0")).click();
    }

    public void clearInput(WebDriver driver) {
        driver.findElement(By.id("suggestion-search")).clear();

    }
}