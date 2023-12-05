package pageobjects;

import core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    //Bắt xpath và khai báo biến chứa xpath
    @FindBy(xpath = "//input[@class='ip-search ui-autocomplete-input']")
    private WebElement btnSearch;
    @FindBy(xpath = "//tbody/tr/td[@class='info']/h3[@class='rv-home-a-title']/a[1]")
    private WebElement truyen;
    public void searchTest(String search) throws InterruptedException {
        btnSearch.sendKeys(search);
    }
    public void searchreturnTest() throws InterruptedException {
        sleep(1000);
        String ActualTitle= truyen.getText();
        String ExpectedTitle = "Linh Vũ Thiên Hạ";
        sleep(1000);
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Test Search Successfully" );
    }
    public void searchreturnTest1() throws InterruptedException {
        sleep(1000);
        String ActualTitle= truyen.getText();
        String ExpectedTitle = "Độc Tôn Tam Giới";
        sleep(1000);
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Test Search Successfully" );
    }
    public void searchreturnTest2() throws InterruptedException {
        sleep(1000);
        System.out.println("truyen khong ton tai" );
    }

}

