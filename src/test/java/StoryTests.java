import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageobjects.ChapterPage;
import pageobjects.HomePage;
import pageobjects.StoryPage;

import java.time.Duration;

public class 98989StoryTests extends BaseTest {
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
    //nền để thực thiện các bước test tiếp theo
    public void BackgroudPageTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        //Test khi bấm vào truyện đầu tiên và kiểm tra tiêu đề của nó
        homePage.storyTest();
        homePage.titleStoryTest();
    }
    @Test(priority=2)
    public void IntroduceTest() throws InterruptedException {
        StoryPage storyPage = new StoryPage(driver);
        //Test phần giới thiệu của truyện
        storyPage.introducStoryTest();
        //lăn chuột
        storyPage.scroll();
        //Test phần gợi ý truyện
        storyPage.buttonStorySuggestions();
        //Test phần bình luận
        storyPage.storyComment();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
