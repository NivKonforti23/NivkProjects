package driver;

import movielist.MovieList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverObject {
    public WebDriver initDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\automation\\libs\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        enterIMDB(driver);
        return driver;
    }


    public void enterIMDB(WebDriver driver) {
        driver.get("https://imdb.com");
    }


}

//לולאה שרצה עד המספר של הגודל של המערך כל פעם כותבת את שם הסרט מוסיפה 1 לקאונטר ועוצרת






//a[@data-testid='search-result--const'])[1] //click on first option