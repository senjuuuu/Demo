import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class HomePageTests extends BaseTest {
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
    // Test Thanh Bar trên cùng
    public void TheMenuBarTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //Test nút logo
        homePage.buttonLogo();
        //Test title
        homePage.checkTheTitle();
        sleep(2000);
        //Test nút danh sách
        homePage.hoverCat();
        sleep(2000);
        homePage.checkCat();
        //Test nút thể loại
        sleep(2000);
        homePage.hoverList();
        sleep(2000);
        homePage.checkList();
        sleep(2000);
        //Test nút lọc truyện
        homePage.buttonSearchAdvance();
        //bấm vào nút  lọc truyện
        homePage.clickButtonSearchAdvance();
        //Trả về trang ban đầu
        homePage.navigateSearchAdvance();
    }
    @Test(priority=2)
        public void StoryHotTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //Test nút truyện hot
        homePage.buttonStoryHot();
        //nhấn vào nút truyện hot
        homePage.clickButtonStoryHot();
        //Trả về trang ban đầu
        homePage.navigateSearchAdvance();
    }
    @Test(priority=3)
        public void  CategoryTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //Test nút sổ xuống
        homePage.buttonCategory();
        homePage.checkCategory();
    }
    @Test(priority=3)
    public void LoadMoreTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //lăn chuột
        homePage.scroll();
        //Test nút xem thêm
        homePage.buttonLoadMore();
    }
    @Test(priority=4)
    public void StoryNewTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //Test nút truyện mới
        homePage.buttonStoryNew();
        homePage.clickButtonStoryNew();
        //Trả về trang ban đầu
        homePage.navigateSearchAdvance();
    }
    @Test(priority=5)
    public void MenuRightTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //lăn chuột
        homePage.scroll();
        //Test truyện đánh dấu
        homePage.storyBookMark();
        //Test truyện đang đọc
        homePage.storyBeingRead();
        //lăn chuột
        homePage.scroll();
        //Test thể loại
        homePage.storyGenre();
    }
    @Test(priority=6)
    public void StoryCompleteTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
//        homePage.scroll();
//        homePage.scroll();
        homePage.scroll();
        //Test  truyện đã hoàn thành
        homePage.storyComplete();
    }
    @Test(priority=7)
    public void StoryIntroduceTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.scroll();
        //Test phần giới thiệu
        homePage.storyIntroduce();
        //Test phần liên hệ
        homePage.storyContact();
    }
    @Test(priority=8)
    public void BackToFrontPage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //Test phần về đầu trang
        homePage.backToFrontPage();
        //Test đầu trang truyện hot
        homePage.buttonStoryHot();
    }


    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
