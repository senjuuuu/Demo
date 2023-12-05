package pageobjects;

import core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class ChapterPage extends BasePage {
    public ChapterPage(WebDriver driver) {
        super(driver);
    }

    //Bắt xpath và khai báo biến chứa xpath
    @FindBy(xpath = "//body/div[@id='chapt-content']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='row wrap-single']/div[@id='j_content']/div[@class='pagination']/ul/span[1]")
    private WebElement btnMenuBurger;
    @FindBy(xpath = "//body/div[@id='chapt-content']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='row wrap-single']/div[@id='j_content']/div[@class='pagination']/ul/select[@onchange='if (this.value) window.location.href=this.value']/option[1]")
    private WebElement btnMenuBurgerOption1;
    @FindBy(xpath = "//body/div[@id='chapt-content']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='row wrap-single']/div[@id='j_content']/div[@class='pagination']/ul/select[@onchange='if (this.value) window.location.href=this.value']/option[2]")
    private WebElement btnMenuBurgerOption2;
    @FindBy(xpath = "//body/div[@id='chapt-content']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='row wrap-single']/div[@id='j_content']/div[@class='pagination']/ul/select[@onchange='if (this.value) window.location.href=this.value']/option[3]")
    private WebElement btnMenuBurgerOption3;
    @FindBy(xpath = "//body/div[@id='chapt-content']/div[@class='container']/div[@class='row']/div[@class='col-md-12']/div[@class='row wrap-single']/div[@id='j_content']/div[@class='pagination']/ul/li[1]")
    private WebElement btnNext;
    @FindBy(xpath = "//div[@class='col-md-6']//li[@class='prev']//a")
    private WebElement btnBack;

    public void titleChapterStoryTest() throws InterruptedException {
        sleep(1000);
        String ActualTitle= driver.getTitle();
        String ExpectedTitle = "Một Thai Hai Bảo: Giám Đốc Hàng Tỉ Yêu Vợ Tận Xương - Chương 1: Thân phận bị hoán đổi | SSTruyen";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Test Title Successfully" );
        sleep(1000);
    }
    public void buttonMenuBurger() throws InterruptedException {
        sleep(1000);
        btnMenuBurger.click();
        sleep(5000);
        String ActualOption1= btnMenuBurgerOption1.getText();
        String ExpectedOption1 = "Chương 1";
        Assert.assertEquals(ExpectedOption1, ActualOption1);
        System.out.println("Test Successfully : You are in chapter 1" );
        sleep(1000);
        btnMenuBurgerOption1.click();
        sleep(3000);
        String ActualOption2= btnMenuBurgerOption2.getText();
        String ExpectedOption2 = "Chương 2";
        Assert.assertEquals(ExpectedOption2, ActualOption2);
        System.out.println("Test Chapter 2 Successfully" );
        sleep(1000);
        String ActualOption3= btnMenuBurgerOption3.getText();
        String ExpectedOption3 = "Chương 3";
        Assert.assertEquals(ExpectedOption3, ActualOption3);
        System.out.println("Test Chapter 3 Successfully" );

}
    public void buttonNext() throws InterruptedException {
        sleep(1000);
        btnNext.click();
        sleep(3000);
        String ActualTitle= driver.getTitle();
        String ExpectedTitle = "Một Thai Hai Bảo: Giám Đốc Hàng Tỉ Yêu Vợ Tận Xương - Chương 2: Trở thành người mang thai hộ | SSTruyen";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Test Title Chapter 2 Successfully" );


}
    public void scroll() throws InterruptedException {
        sleep(1000);
        //sử dụng JavascriptExecutor, tạo một tham chiếu cho giao diện và gán nó cho cá thể WebDriver
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //executeScript Để cuộn trang theo chiều dọc 660px
        js.executeScript("window.scrollBy(0,2500)", "");
        sleep(2000);
    }
    public void buttonBack() throws InterruptedException {
        sleep(1000);
        btnNext.click();
        sleep(3000);
        String ActualTitle= driver.getTitle();
        String ExpectedTitle = "Một Thai Hai Bảo: Giám Đốc Hàng Tỉ Yêu Vợ Tận Xương - Chương 1: Thân phận bị hoán đổi | SSTruyen";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Test Title Chapter 1 Successfully" );
    }
}

