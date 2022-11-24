package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import showinfo.showInfo;

public class searchPage extends basePage {
    basePage BasePage = new basePage();
    showInfo ShowInfo=new showInfo();


    public void searchTvshow(WebDriver driver) throws InterruptedException {
        BasePage.clickSearchBox(driver);
        BasePage.typeKeyText(driver);
        BasePage.clickOnFirstOption(driver);
        getShowInfo(driver);

    }
        public void getShowInfo(WebDriver driver) {
            ShowInfo.setShowName(driver.findElement(By.xpath("//h1[@class='sc-b73cd867-0 eKrKux']")).getText());
            ShowInfo.setShowGrade(Double.parseDouble(driver.findElement(By.xpath("(//span[@class='sc-7ab21ed2-1 jGRxWM'])[1]")).getText()));

        }
}
