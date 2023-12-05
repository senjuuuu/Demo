import core.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.ChapterPage;
import pageobjects.HomePage;


import java.time.Duration;

import static java.lang.Thread.sleep;
public class ChapterTests extends BaseTest {
    WebDriver driver;
    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", downloadPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.get("https://sstruyen.vn/mot-thai-hai-bao-giam-doc-hang-ti-yeu-vo-tan-xuong/chuong-1/");

    }

    @Test(priority=1)
    public void Chapter1Test() throws InterruptedException {
        ChapterPage chapterPage = new ChapterPage(driver);
        //Test phần tiêu đề
        chapterPage.titleChapterStoryTest();
        //Test phần chương
        chapterPage.buttonMenuBurger();
        //bấm next chuong và kiểm tra tiêu đề
        chapterPage.buttonNext();
    }
    @Test(priority=2)
    public void Chapter2Test() throws InterruptedException {
        ChapterPage chapterPage = new ChapterPage(driver);
        //lăn chuột
        chapterPage.scroll();
        //bấm trở lại chuong và kiểm tra tiêu đề
        chapterPage.buttonBack();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
