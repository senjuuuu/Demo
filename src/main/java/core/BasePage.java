package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
    // Khai báo biến driver mặc định dùng chung cho page
}
