package pageobjects;

import core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class StoryPage extends BasePage {
    public StoryPage(WebDriver driver) {
        super(driver);
    }

    //Bắt xpath và khai báo biến chứa xpath
    @FindBy(xpath = "//div[@class='content1']//p[contains(text(),'Tác giả:')]")
    private WebElement textAuthor;
    @FindBy(xpath = "//div[@class='row wrap-detail pc']//p[2]")
    private WebElement textGenre;
    @FindBy(xpath = "//div[@class='col-md-8']//p[contains(text(),'Nguồn:')]")
    private WebElement textSource;
    @FindBy(xpath = "//div[@class='col-md-8']//p[contains(text(),'Trạng thái:')]")
    private WebElement textStatus;
    @FindBy(xpath = "//div[@class='col-md-8']//p[contains(text(),'Số chương:')]")
    private WebElement textChapter ;
    @FindBy(xpath = "//div[@class='col-md-8']//p[contains(text(),'Ngày đăng:')]")
    private WebElement textDatePosted;
    @FindBy(xpath = "//div[@class='col-md-8']//p[contains(text(),'Cập nhật:')]")
    private WebElement textUpdated;

    @FindBy(xpath = "//div[@class='col-md-8']//p[contains(text(),'Cải biên: Nhóm Gia Đình Quý Tộc, Nhóm Túy Nguyệt C')]")
    private WebElement textArrangement ;
    @FindBy(xpath = "//h3[contains(text(),'Chương Mới Nhất')]")
    private WebElement textChapterNew ;
    @FindBy(xpath = "//h3[contains(text(),'Danh sách chương')]")
    private WebElement textListChapter ;
    @FindBy(xpath = "//a[contains(text(),'Chương 1: Thân phận bị hoán đổi')]")
    private WebElement btnChapter1 ;
    @FindBy(xpath = "//a[contains(text(),'Chương 2: Trở thành người mang thai hộ')]")
    private WebElement btnChapter2 ;
    @FindBy(xpath = "//a[contains(text(),'Chương 3: Bóng đêm vô nghĩa')]")
    private WebElement btnChapter3 ;
    @FindBy(xpath = "//a[contains(text(),'Chương 4: Không thể phục vụ cho người này')]")
    private WebElement btnChapter4 ;
    @FindBy(xpath = "//div[@class='pagination pc']//a[contains(text(),'2')]")
    private WebElement btnNext2 ;
    @FindBy(xpath = "//a[contains(text(),'Chương 33: Đổi chỗ vận mệnh')]")
    private WebElement btnChapter33 ;
    @FindBy(xpath = "//h2[contains(text(),'Gợi ý truyện')]")
    private WebElement btnStorySuggestions;
    @FindBy(xpath = "//div[@id='fbcomment']")
    private WebElement textComment;
    public void introducStoryTest() throws InterruptedException {
    sleep(1000);
    String ActualAuthor= textAuthor.getText();
    String ExpectedAuthor = "Tác giả: Hoa Dung Nguyệt Hạ";
    Assert.assertEquals(ExpectedAuthor, ActualAuthor);
    System.out.println("Test Author Successfully" );
    sleep(1000);
    String ActualGenre= textGenre.getText();
    String ExpectedGenre = "Thể loại: Ngôn Tình, Truyện Sủng";
    Assert.assertEquals(ExpectedGenre, ActualGenre);
    System.out.println("Test Category Successfully " );
    sleep(1000);
    String ActualSource= textSource.getText();
    String ExpectedSource = "Nguồn: Thích Đọc Truyện, iRead";
    Assert.assertEquals(ExpectedSource, ActualSource);
    System.out.println("Test Source Successfully" );
    sleep(1000);
    String ActualtextStatus= textStatus.getText();
    String ExpectedtextStatus = "Trạng thái: Đang ra";
    Assert.assertEquals(ExpectedtextStatus, ActualtextStatus);
    System.out.println("Test Status Successfully" );
    sleep(1000);
    String ActualtextChapter= textChapter.getText();
    String ExpectedtextChapter = "Số chương: 3662";
    Assert.assertEquals(ExpectedtextChapter, ActualtextChapter);
    System.out.println("Test Chapter Successfully" );
    sleep(1000);
    String ActualtextDatePosted= textDatePosted.getText();
    String ExpectedtextDatePosted = "Ngày đăng: 4 năm trước";
    Assert.assertEquals(ExpectedtextDatePosted, ActualtextDatePosted);
    System.out.println("Test Date Posted Successfully" );
    sleep(1000);
    String ActualtextUpdated= textUpdated.getText();
    String ExpectedtextUpdated = "Cập nhật: 4 tháng trước";
    Assert.assertEquals(ExpectedtextUpdated, ActualtextUpdated);
    System.out.println("Test Updated Successfully" );
    sleep(1000);
    String ActualtextArrangement= textArrangement.getText();
    String ExpectedtextArrangement = "Cải biên: Nhóm Gia Đình Quý Tộc, Nhóm Túy Nguyệt Các\n" +
            "Anh là người dẫn đầu trong lĩnh vực kinh tế của Đế quốc, còn cô là một cô gái được nuôi dưỡng trong một gia đình đang gặp khó khăn. Để giúp cha nuôi cô, cô đã đồng ý ký kết hợp đồng trị giá 100 nghìn đô la với nội dung: \"Sinh cho tôi một đứa bé\".\n" +
            "\n" +
            "Tuy nhiên, điều bất ngờ đã xảy ra khi cô mang thai đôi. Trong khi đứa trẻ thứ nhất khỏe mạnh, đứa thứ hai lại qua đời ngay sau khi chào đời.\n" +
            "\n" +
            "Sau khi hoàn tất hợp đồng và nhận tiền, cô đã biến mất khỏi tầm mắt của anh.\n" +
            "Sau 6 năm, anh vẫn là người dẫn đầu của tập đoàn lớn, trong khi đó cô bị nuôi như một con chim trong một chiếc lồng vàng. Anh từng bước áp đặt và nói: \"Cô tưởng rằng mình có thể trốn thoát khỏi tôi sao?\", nhưng anh chưa hề biết rằng, một đứa trẻ đang ngăn cản anh, đó là đứa con trai của cô. Cậu bé tuy nhỏ nhưng liền lạc vẻ cái tài của một người già, con trỏ chỉ vào anh và nói: \"Mộ Nhã Triết, hãy giữ khoảng cách với cô ấy, bởi vì cô ấy là người phụ nữ của tôi.\"";
    Assert.assertEquals(ExpectedtextArrangement, ActualtextArrangement);
    System.out.println("Test Adaptation Successfully" );
}
    public void scroll() throws InterruptedException {
        sleep(1000);
        //sử dụng JavascriptExecutor, tạo một tham chiếu cho giao diện và gán nó cho cá thể WebDriver
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //executeScript Để cuộn trang theo chiều dọc 660px
        js.executeScript("window.scrollBy(0,1200)", "");
        sleep(2000);
    }
    public void chapterTest() throws InterruptedException {
        sleep(1000);
        String ActualtextChapterNew= textChapterNew.getText();
        String ExpectedtextChapterNew = "Chương Mới Nhất";
        Assert.assertEquals(ExpectedtextChapterNew, ActualtextChapterNew);
        System.out.println("Test Chapter New Successfully" );
        sleep(1000);
        String ActualtextListChapter= textListChapter.getText();
        String ExpectedtextListChapter = "Danh sách chương";
        Assert.assertEquals(ExpectedtextListChapter, ActualtextListChapter);
        System.out.println("Test List Chapter Successfully " );
        sleep(1000);
        String ActualChapter1= btnChapter1.getText();
        String ExpectedChapter1 = "Chương 1: Thân phận bị hoán đổi";
        Assert.assertEquals(ExpectedChapter1, ActualChapter1);
        System.out.println("Test Chapter Successfully :" + ActualChapter1 );
        sleep(1000);
        String ActualChapter2= btnChapter2.getText();
        String ExpectedChapter2 = "Chương 2: Trở thành người mang thai hộ";
        Assert.assertEquals(ExpectedChapter2, ActualChapter2);
        System.out.println("Test Chapter Successfully"  + ActualChapter2 );
        sleep(1000);
        String ActualChapter3= btnChapter3.getText();
        String ExpectedChapter3 = "Chương 3: Bóng đêm vô nghĩa";
        Assert.assertEquals(ExpectedChapter3, ActualChapter3);
        System.out.println("Test Chapter Successfully"  + ActualChapter3);
        sleep(1000);
        String ActualChapter4= btnChapter4.getText();
        String ExpectedChapter4 = "Chương 4: Không thể phục vụ cho người này";
        Assert.assertEquals(ExpectedChapter4, ActualChapter4);
        System.out.println("Test Chapter Successfully"  + ActualChapter4);
        sleep(1000);
        btnNext2.click();
        sleep(1000);
        String ActualChapter33= btnChapter33.getText();
        String ExpectedChapter33 = "Chương 33: Đổi chỗ vận mệnh";
        Assert.assertEquals(ExpectedChapter33, ActualChapter33);
        System.out.println("Test Chapter Successfully"  + ActualChapter33);
    }
    public void buttonStorySuggestions() throws InterruptedException {
        sleep(1000);
        String ActualtextChapterNew= btnStorySuggestions.getText();
        String ExpectedtextChapterNew = "Gợi ý truyện";
        Assert.assertEquals(ExpectedtextChapterNew, ActualtextChapterNew);
        System.out.println("Test Story Suggestions Successfully" );
    }
    public void storyComment() throws InterruptedException {
        sleep(1000);
        String ActualtextComment= textComment.getText();
        String ExpectedtextComment = "BÌNH LUẬN TRUYỆN";
        Assert.assertEquals(ExpectedtextComment, ActualtextComment);
        System.out.println("Test Comment Successfully" );
    }
}

