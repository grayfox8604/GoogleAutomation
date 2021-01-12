package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver;
    private static WebElement element = null;
    private static By searchBarPath = By.name("q");
    private static By searchButtonPath = By.name("btnK");

    public SearchPage (WebDriver driver){
        this.driver=driver;
    }

    public static WebElement searchBar (WebDriver driver){
        element = driver.findElement(searchBarPath);
        return element;
    }

    public static WebElement searchButton (WebDriver driver){
        element = driver.findElement(searchButtonPath);
        return element;
    }
}
