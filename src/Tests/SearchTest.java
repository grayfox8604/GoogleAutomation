package Tests;

import Pages.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SearchTest {
  private static WebDriver driver = null;

  @Before
    public void setup() {
      driver = new ChromeDriver();
      System.setProperty("webdriver.chrome.driver", "/Users/bserrato/ChromeDriver/chromedriver");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("https://www.google.com/");
  }

  @After
    public void close(){
      driver.close();
  }

  @Test
  public void TestSearchPage(){
      SearchPage search = new SearchPage(driver);
      search.searchBar(driver).sendKeys("French Bulldog");
      search.searchButton(driver).click();
  }
}
