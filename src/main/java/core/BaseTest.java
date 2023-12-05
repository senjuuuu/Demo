package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;


    public static String downloadPath =  System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
    //dòng 14 dùng để đi tới thư mục gọi driver của các trình duyệt
    @BeforeTest
    // lệnh test đầu tiên
    public void init(){
        System.setProperty("webdriver.chrome.driver",downloadPath);
        //gọi driver vào page

        WebDriver driver = new ChromeDriver();
        //Khai báo biến

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        //hàm đợi 10s
    }

    public WebDriver getDriver() {
        return driver;
    }
    // hàm mặc định của từ page test

    @AfterTest
    //Lệnh test cuối cùng
    public void tearDown(){
        driver.close();
    }
}
