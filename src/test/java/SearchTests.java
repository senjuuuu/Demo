import core.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.ChapterPage;
import pageobjects.SearchPage;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SearchTests extends BaseTest {
    WebDriver driver;

    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", downloadPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://sstruyen.vn/");

    }

    @Test(priority=1)
    public void SearchTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        //tìm kiếm với "Linh vu thien ha"
        searchPage.searchTest("Linh vu thien ha" + Keys.ENTER);
        sleep(1000);
        searchPage.searchreturnTest();
    }
    @Test(priority=2)
    public void SearchTest1() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        //tìm kiếm với "Linh vu thien ha"
        searchPage.searchTest("Linh vu thien" + Keys.ENTER);
        sleep(1000);
        searchPage.searchreturnTest();
    }
    @Test(priority=3)
    public void SearchTest2() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchTest("Độc tôn tam giới" + Keys.ENTER);
        sleep(1000);
        searchPage.searchreturnTest1();
    }
    @Test(priority=4)
    public void SearchTest3() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchTest("onepice" + Keys.ENTER);
        sleep(1000);
        searchPage.searchreturnTest2();
    }

    @AfterTest
    public void tearDown(){
      driver.close();
    }
}
