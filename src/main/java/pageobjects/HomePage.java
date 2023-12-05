package pageobjects;

import core.BasePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static java.lang.Thread.onSpinWait;
import static java.lang.Thread.sleep;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Bắt xpath và khai báo biến chứa xpath
    @FindBy(xpath = "//div[@class='col-xs-12 col-md-2']//img[@alt='doc truyen']")
    private WebElement btnLogo;
    @FindBy(xpath = "//li[@class='cat']")
    private WebElement btnCat;
    @FindBy(xpath = "//li[@class='cat']//a[@href='#'][normalize-space()='Danh sách']")
    private WebElement textCat;
    @FindBy(xpath = "//li[@class='list']")
    private WebElement btnList;
    @FindBy(xpath = "//li[@class='list']//a[@href='#'][contains(text(),'Thể loại')]")
    private WebElement textList;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Truyện Teen Hay'][contains(text(),'Truyện Teen Hay')]")
    private WebElement textGoodTeenStories;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Ngôn Tình Ngược'][contains(text(),'Ngôn Tình Ngược')]")
    private WebElement textReverseRomance;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Ngôn Tình Hài'][normalize-space()='Ngôn Tình Hài']")
    private WebElement textComedyRomance;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Đam Mỹ Hài'][contains(text(),'Đam Mỹ Hài')]")
    private WebElement textDamMyHai;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Đam Mỹ Hay'][contains(text(),'Đam Mỹ Hay')]")
    private WebElement textDamMyHay;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Đam Mỹ H Văn'][contains(text(),'Đam Mỹ H Văn')]")
    private WebElement textDamMyHVan;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Ngôn Tình Hay'][normalize-space()='Ngôn Tình Hay']")
    private WebElement textGoodLoveQuotes;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Truyện Full'][contains(text(),'Truyện Full')]")
    private WebElement textFullStory;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Tiên Hiệp Hay'][contains(text(),'Tiên Hiệp Hay')]")
    private WebElement textTienHiepHay;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Ngôn Tình Sắc'][contains(text(),'Ngôn Tình Sắc')]")
    private WebElement textLoveLanguage;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Truyện Hot'][contains(text(),'Truyện Hot')]")
    private WebElement textHotStories;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Kiếm Hiệp Hay'][contains(text(),'Kiếm Hiệp Hay')]")
    private WebElement textGoodSwordplay;
    @FindBy(xpath = "//li[@class='cat']//ul[@class='sub-menu sub-menu-cat']//li//a[@title='Truyện mới cập nhật'][contains(text(),'Truyện mới cập nhật')]")
    private WebElement textNewlyUpdatedStory;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Tiên Hiệp'][contains(text(),'Tiên Hiệp')]")
    private WebElement textFirstHalf;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Kiếm Hiệp'][contains(text(),'Kiếm Hiệp')]")
    private WebElement textSwordHero;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Ngôn Tình'][normalize-space()='Ngôn Tình']")
    private WebElement textLanguageLove;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Đô Thị'][contains(text(),'Đô Thị')]")
    private WebElement textUrban;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Quan Trường'][contains(text(),'Quan Trường')]")
    private WebElement textQuanTruong;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Võng Du'][normalize-space()='Võng Du']")
    private WebElement textVongDu;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Khoa Huyễn'][contains(text(),'Khoa Huyễn')]")
    private WebElement textScienceOfIllusion;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Huyền huyễn'][contains(text(),'Huyền huyễn')]")
    private WebElement textHuyenHuyen;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Dị Giới'][contains(text(),'Dị Giới')]")
    private WebElement textDiGioi;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Dị Năng'][contains(text(),'Dị Năng')]")
    private WebElement textDiNang;
    @FindBy(xpath = "//ul[@class='sub-menu-maga']//a[@title='Quân Sự'][contains(text(),'Quân Sự')]")
    private WebElement textMilitary;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Lịch Sử'][contains(text(),'Lịch Sử')]")
    private WebElement textHistory;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Xuyên Không'][normalize-space()='Xuyên Không']")
    private WebElement textTranscendence;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Trọng Sinh'][contains(text(),'Trọng Sinh')]")
    private WebElement textTrongSinh;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Trinh Thám'][normalize-space()='Trinh Thám']")
    private WebElement textTrinhTham;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Thám Hiểm'][contains(text(),'Thám Hiểm')]")
    private WebElement textExplore;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Linh Dị'][contains(text(),'Linh Dị')]")
    private WebElement textLinhDi;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Sắc'][contains(text(),'Truyện Sắc')]")
    private WebElement textSacStory;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Ngược'][contains(text(),'Truyện Ngược')]")
    private WebElement textBackstory;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Sủng'][contains(text(),'Truyện Sủng')]")
    private WebElement textSung;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Cung Đấu'][contains(text(),'Truyện Cung Đấu')]")
    private WebElement textPalaceFightingStory;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Nữ Cường'][contains(text(),'Truyện Nữ Cường')]")
    private WebElement textFemaleCuongStory;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Gia Đấu'][contains(text(),'Truyện Gia Đấu')]")
    private WebElement textGiaDauStory;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Đông Phương'][contains(text(),'Đông Phương')]")
    private WebElement textDongPhuong;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Đam Mỹ'][contains(text(),'Đam Mỹ')]")
    private WebElement textDamMy;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Bách Hợp'][contains(text(),'Bách Hợp')]")
    private WebElement textBachHop;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Hài Hước'][contains(text(),'Hài Hước')]")
    private WebElement textHumorous;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Điền Văn'][contains(text(),'Điền Văn')]")
    private WebElement textDienVan;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Cổ Đại'][contains(text(),'Cổ Đại')]")
    private WebElement textAncient;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Mạt Thế'][contains(text(),'Mạt Thế')]")
    private WebElement textMatThe;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Teen'][contains(text(),'Truyện Teen')]")
    private WebElement textTeen;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Phương Tây'][contains(text(),'Phương Tây')]")
    private WebElement textPhuongTay;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Nữ Phụ'][contains(text(),'Nữ Phụ')]")
    private WebElement textFemaleAssistant;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Light Novel'][normalize-space()='Light Novel']")
    private WebElement textLightNovels;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Việt Nam'][contains(text(),'Việt Nam')]")
    private WebElement textVietNam;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Đoản Văn'][contains(text(),'Đoản Văn')]")
    private WebElement textDoanVan;
    @FindBy(xpath = "//li[@class='list']//div[@class='sub-menu sub-menu-list']//ul[@class='sub-menu-maga']//li//a[@title='Truyện Khác'][contains(text(),'Truyện Khác')]")
    private WebElement textOther;

    @FindBy(xpath = "//a[@class='search-advance']")
    private WebElement btnSearchAdvance;
    @FindBy(xpath = "//p[contains(text(),'Lọc truyện - Chúc bạn tìm được truyện ưng ý để đọc')]")
    private WebElement textSearchAdvance;
    @FindBy(xpath = "//input[@class='ip-search ui-autocomplete-input']")
    private WebElement btnSearch;
    @FindBy(xpath = "//select[@name='ss_category']")
    private WebElement btnCategory;
    @FindBy(xpath = "//select[@name='ss_category']//option[contains(text(),'Tất cả')]")
    private WebElement textCategory;
    @FindBy(xpath = "//option[@value='K8']")
    private WebElement btnOptionK8;
    @FindBy(xpath = "//option[@value='K9']")
    private WebElement btnOptionK9;
    @FindBy(xpath = "//option[@value='G1']")
    private WebElement btnOptionG1;
    @FindBy(xpath = "//option[@value='G2']")
    private WebElement btnOptionG2;
    @FindBy(xpath = "//option[@value='G3']")
    private WebElement btnOptionG3;
    @FindBy(xpath = "//option[@value='G4']")
    private WebElement btnOptionG4;
    @FindBy(xpath = "//option[@value='K4']")
    private WebElement btnOptionK4;
    @FindBy(xpath = "//option[@value='K2']")
    private WebElement btnOptionK2;
    @FindBy(xpath = "//option[@value='K5']")
    private WebElement btnOptionK5;

    @FindBy(xpath = "//option[@value='K6']")
    private WebElement btnOptionK6;
    @FindBy(xpath = "//option[@value='K3']")
    private WebElement btnOptionK3;
    @FindBy(xpath = "//option[@value='K7']")
    private WebElement btnOptionK7;
    @FindBy(xpath = "//a[contains(text(),'Truyện hot')]")
    private WebElement btnStoryHot;
    @FindBy(xpath = "//div[@class='section-hot-book']//div[@class='load-more']")
    private WebElement btnLoadMore;
    @FindBy(xpath = "//a[@class='rv-sr-a'][contains(text(),'Truyện mới cập nhật')]")
    private WebElement btnStoryNew;
    @FindBy(xpath = "//select[@name='ss_category_newest']")
    private WebElement btnCategoryNewest;
    @FindBy(xpath = "//h3[contains(text(),'Truyện đánh dấu')]")
    private WebElement textStoryBookMark;
    @FindBy(xpath = "//h3[contains(text(),'Truyện đang đọc')]")
    private WebElement textStoryBeingRead;
    @FindBy(xpath = "//h3[contains(text(),'Thể loại truyện')]")
    private WebElement textStoryGenre;
    @FindBy(xpath = "//a[contains(text(),'Truyện đã hoàn thành')]")
    private WebElement btnStoryComplete;
    @FindBy(xpath = "//li[@class='ve-dau-trang']")
    private WebElement btnBackToFrontPage;
    @FindBy(xpath = "//p[contains(text(),'Sstruyen.vn là nơi cập nhật những truyện hay và mớ')]")
    private WebElement textIntroduce;
    @FindBy(xpath = "//p[3]")
    private WebElement textContact;
    @FindBy(xpath = "//a[@class='book-name'][normalize-space()='Lâm Nam']")
    private WebElement textBookName;
    @FindBy(xpath = "//a[@title='Lâm Nam - Chương 74']")
    private WebElement textChap;
    @FindBy(xpath = "//td[contains(text(),'14 phút trước')]")
    private WebElement textTime;
    @FindBy(xpath = "//a[@title='Một Thai Hai Bảo: Giám Đốc Hàng Tỉ Yêu Vợ Tận Xương']//div[1]")
    private WebElement textStory1;


    //Hàm buttonLogin để nhấn vào ô Login trên góc ở trang chủ
    public void buttonLogo() throws InterruptedException {
        btnLogo.click();
        sleep(1000);
    }
    public void checkTheTitle()throws InterruptedException{
        //Cái popup hiện lên sau đó mình đi kiểm tra cái text "This item is out of stock!" sau đó nhấn vào Back To Shopping
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Đọc truyện Online, đọc truyện full, truyện ngôn tình hay nhất | SSTruyen";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Title of the website : " + ActualTitle);
        sleep(2000);
    }
    public void hoverCat() throws InterruptedException {
        sleep(1000);
        Actions action = new Actions(driver);
        action.moveToElement(btnCat).build().perform();
        sleep(1000);
        String ActualCat = textCat.getText();
        String ExpectedCat = "Danh sách";
        Assert.assertEquals(ExpectedCat, ActualCat);
        System.out.println("Test text successfully  : " + ActualCat);
    }
    public void hoverList() throws InterruptedException {
        sleep(1000);
        Actions action = new Actions(driver);
        action.moveToElement(btnList).build().perform();
        sleep(1000);
        String ActualList = textList.getText();
        String ExpectedList = "Thể loại";
        Assert.assertEquals(ExpectedList, ActualList);
        System.out.println("Test text successfully  : " + ActualList);
    }
    public void checkCat() throws InterruptedException {
        sleep(1000);
        String ActualGoodTeenStories = textGoodTeenStories.getText();
        String ExpectedGoodTeenStories = "Truyện Teen Hay";
        Assert.assertEquals(ExpectedGoodTeenStories, ActualGoodTeenStories);
        String ActualtReverseRomance = textReverseRomance.getText();
        String ExpectedReverseRomance = "Ngôn Tình Ngược";
        Assert.assertEquals(ExpectedReverseRomance, ActualtReverseRomance);
        String ActualComedyRomance = textComedyRomance.getText();
        String ExpectedComedyRomance = "Ngôn Tình Hài";
        Assert.assertEquals(ExpectedComedyRomance, ActualComedyRomance);
        String ActualDamMyHai = textDamMyHai.getText();
        String ExpectedDamMyHai = "Đam Mỹ Hài";
        Assert.assertEquals(ExpectedDamMyHai, ActualDamMyHai);
        String ActualDamMyHay = textDamMyHay.getText();
        String ExpectedDamMyHay = "Đam Mỹ Hay";
        Assert.assertEquals(ExpectedDamMyHay, ActualDamMyHay);
        String ActualDamMyHVan = textDamMyHVan.getText();
        String ExpectedDamMyHVan = "Đam Mỹ H Văn";
        Assert.assertEquals(ExpectedDamMyHVan, ActualDamMyHVan);
        String ActualGoodLoveQuotes = textGoodLoveQuotes.getText();
        String ExpectedGoodLoveQuotes = "Ngôn Tình Hay";
        Assert.assertEquals(ExpectedGoodLoveQuotes, ActualGoodLoveQuotes);
        String ActualFullStory = textFullStory.getText();
        String ExpectedFullStory = "Truyện Full";
        Assert.assertEquals(ExpectedFullStory, ActualFullStory);
        String ActualTienHiepHay = textTienHiepHay.getText();
        String ExpectedTienHiepHay = "Tiên Hiệp Hay";
        Assert.assertEquals(ExpectedTienHiepHay, ActualTienHiepHay);
        String ActualLoveLanguage = textLoveLanguage.getText();
        String ExpectedLoveLanguage = "Ngôn Tình Sắc";
        Assert.assertEquals(ExpectedLoveLanguage, ActualLoveLanguage);
        String ActualHotStories = textHotStories.getText();
        String ExpectedHotStories = "Truyện Hot";
        Assert.assertEquals(ExpectedHotStories, ActualHotStories);
        String ActualGoodSwordplay = textGoodSwordplay.getText();
        String ExpectedGoodSwordplay = "Kiếm Hiệp Hay";
        Assert.assertEquals(ExpectedGoodSwordplay, ActualGoodSwordplay);
        String ActualNewlyUpdatedStory = textNewlyUpdatedStory.getText();
        String ExpectedNewlyUpdatedStory = "Truyện mới cập nhật";
        Assert.assertEquals(ExpectedNewlyUpdatedStory, ActualNewlyUpdatedStory);
        System.out.println("Test text successfully  : " + ActualGoodTeenStories
                + " / "  + ActualtReverseRomance
                + " / " + ActualComedyRomance
                + " / " + ActualDamMyHai
                + " / " + ActualDamMyHay
                + " / " + ActualDamMyHVan
                + " / " + ActualGoodLoveQuotes
                + " / " + ActualFullStory
                + " / " + ActualTienHiepHay
                + " / " + ActualLoveLanguage
                + " / " + ActualHotStories
                + " / " + ActualGoodSwordplay
                + " / " + ActualNewlyUpdatedStory);
    }
    public void checkList() throws InterruptedException {
        sleep(1000);
        String ActualtextFirstHalf = textFirstHalf.getText();
        String ExpectedtextFirstHalf = "Tiên Hiệp";
        Assert.assertEquals(ExpectedtextFirstHalf, ActualtextFirstHalf);
        String ActualttextSwordHero = textSwordHero.getText();
        String ExpectedtextSwordHero = "Kiếm Hiệp";
        Assert.assertEquals(ExpectedtextSwordHero, ActualttextSwordHero);
        String ActualtextLanguageLove = textLanguageLove.getText();
        String ExpectedtextLanguageLove = "Ngôn Tình";
        Assert.assertEquals(ExpectedtextLanguageLove, ActualtextLanguageLove);
        String ActualtextUrban = textUrban.getText();
        String ExpectedtextUrban = "Đô Thị";
        Assert.assertEquals(ExpectedtextUrban, ActualtextUrban);
        String ActualtextQuanTruong = textQuanTruong.getText();
        String ExpectedtextQuanTruong = "Quan Trường";
        Assert.assertEquals(ExpectedtextQuanTruong, ActualtextQuanTruong);
        String ActualtextVongDu = textVongDu.getText();
        String ExpectedtextVongDu = "Võng Du";
        Assert.assertEquals(ExpectedtextVongDu, ActualtextVongDu);
        String ActualtextScienceOfIllusion = textScienceOfIllusion.getText();
        String ExpectedtextScienceOfIllusion = "Khoa Huyễn";
        Assert.assertEquals(ExpectedtextScienceOfIllusion, ActualtextScienceOfIllusion);
        String ActualtextHuyenHuyen = textHuyenHuyen.getText();
        String ExpectedtextHuyenHuyen = "Huyền huyễn";
        Assert.assertEquals(ExpectedtextHuyenHuyen, ActualtextHuyenHuyen);
        String ActualtextDiGioi = textDiGioi.getText();
        String ExpectedtextDiGioi = "Dị Giới";
        Assert.assertEquals(ExpectedtextDiGioi, ActualtextDiGioi);
        String ActualtextDiNang = textDiNang.getText();
        String ExpectedtextDiNang = "Dị Năng";
        Assert.assertEquals(ExpectedtextDiNang, ActualtextDiNang);
        String ActualtextMilitary = textMilitary.getText();
        String ExpectedtextMilitary = "Quân Sự";
        Assert.assertEquals(ExpectedtextMilitary, ActualtextMilitary);
        String ActualtextHistory = textHistory.getText();
        String ExpectedtextHistory = "Lịch Sử";
        Assert.assertEquals(ExpectedtextHistory, ActualtextHistory);
        String ActualtextTranscendence = textTranscendence.getText();
        String ExpectedtextTranscendence = "Xuyên Không";
        Assert.assertEquals(ExpectedtextTranscendence, ActualtextTranscendence);
        String ActualtextTrongSinh = textTrongSinh.getText();
        String ExpectedtextTrongSinh = "Trọng Sinh";
        Assert.assertEquals(ExpectedtextTrongSinh, ActualtextTrongSinh);
        String ActualtextTrinhTham = textTrinhTham.getText();
        String ExpectedtextTrinhTham = "Trinh Thám";
        Assert.assertEquals(ExpectedtextTrinhTham, ActualtextTrinhTham);
        String ActualtextExplore = textExplore.getText();
        String ExpectedtextExplore = "Thám Hiểm";
        Assert.assertEquals(ExpectedtextExplore, ActualtextExplore);
        String ActualtextLinhDi = textLinhDi.getText();
        String ExpectedtextLinhDi = "Linh Dị";
        Assert.assertEquals(ExpectedtextLinhDi, ActualtextLinhDi);
        String ActualtextSacStory = textSacStory.getText();
        String ExpectedtextSacStory = "Truyện Sắc";
        Assert.assertEquals(ExpectedtextSacStory, ActualtextSacStory);
        String ActualtextBackstory = textBackstory.getText();
        String ExpectedtextBackstory = "Truyện Ngược";
        Assert.assertEquals(ExpectedtextBackstory, ActualtextBackstory);
        String ActualtextSung = textSung.getText();
        String ExpectedtextSung = "Truyện Sủng";
        Assert.assertEquals(ExpectedtextSung, ActualtextSung);
        String ActualtextPalaceFightingStory = textPalaceFightingStory.getText();
        String ExpectedtextPalaceFightingStory = "Truyện Cung Đấu";
        Assert.assertEquals(ExpectedtextPalaceFightingStory, ActualtextPalaceFightingStory);
        String ActualtextFemaleCuongStory = textFemaleCuongStory.getText();
        String ExpectedtextFemaleCuongStory = "Truyện Nữ Cường";
        Assert.assertEquals(ExpectedtextFemaleCuongStory, ActualtextFemaleCuongStory);
        String ActualtextGiaDauStory = textGiaDauStory.getText();
        String ExpectedtextGiaDauStory = "Truyện Gia Đấu";
        Assert.assertEquals(ExpectedtextGiaDauStory, ActualtextGiaDauStory);
        String ActualtextDongPhuong = textDongPhuong.getText();
        String ExpectedtextDongPhuong = "Đông Phương";
        Assert.assertEquals(ExpectedtextDongPhuong, ActualtextDongPhuong);
        String ActualtextDamMy = textDamMy.getText();
        String ExpectedtextDamMy = "Đam Mỹ";
        Assert.assertEquals(ExpectedtextDamMy, ActualtextDamMy);
        String ActualtextBachHop = textBachHop.getText();
        String ExpectedtextBachHop = "Bách Hợp";
        Assert.assertEquals(ExpectedtextBachHop, ActualtextBachHop);
        String ActualtextHumorous = textHumorous.getText();
        String ExpectedtextHumorous = "Hài Hước";
        Assert.assertEquals(ExpectedtextHumorous, ActualtextHumorous);
        String ActualtextDienVan = textDienVan.getText();
        String ExpectedtextDienVan = "Điền Văn";
        Assert.assertEquals(ExpectedtextDienVan, ActualtextDienVan);
        String ActualtextAncient = textAncient.getText();
        String ExpectedtextAncient = "Cổ Đại";
        Assert.assertEquals(ExpectedtextAncient, ActualtextAncient);
        String ActualtextMatThe = textMatThe.getText();
        String ExpectedtextMatThe = "Mạt Thế";
        Assert.assertEquals(ExpectedtextMatThe, ActualtextMatThe);
        String ActualtextTeen = textTeen.getText();
        String ExpectedtextTeen = "Truyện Teen";
        Assert.assertEquals(ExpectedtextTeen, ActualtextTeen);
        String ActualtextPhuongTay = textPhuongTay.getText();
        String ExpectedtextPhuongTay = "Phương Tây";
        Assert.assertEquals(ExpectedtextPhuongTay, ActualtextPhuongTay);
        String ActualtextFemaleAssistant = textFemaleAssistant.getText();
        String ExpectedtextFemaleAssistant = "Nữ Phụ";
        Assert.assertEquals(ExpectedtextFemaleAssistant, ActualtextFemaleAssistant);
        String ActualtextLightNovels = textLightNovels.getText();
        String ExpectedtextLightNovels = "Light Novel";
        Assert.assertEquals(ExpectedtextLightNovels, ActualtextLightNovels);
        String ActualtextVietNam = textVietNam.getText();
        String ExpectedtextVietNam = "Việt Nam";
        Assert.assertEquals(ExpectedtextVietNam, ActualtextVietNam);
        String ActualtextDoanVan = textDoanVan.getText();
        String ExpectedtextDoanVan = "Đoản Văn";
        Assert.assertEquals(ExpectedtextDoanVan, ActualtextDoanVan);
        String ActualtextOther = textOther.getText();
        String ExpectedtextOther = "Truyện Khác";
        Assert.assertEquals(ExpectedtextOther, ActualtextOther);


        System.out.println("Test text successfully  : " +ActualtextFirstHalf + " / " +
                ActualttextSwordHero + " / " +
                ActualtextLanguageLove + " / " +
                ActualtextUrban + " / " +
                ActualtextQuanTruong + " / " +
                ActualtextVongDu + " / " +
                ActualtextScienceOfIllusion + " / " +
                ActualtextHuyenHuyen + " / " +
                ActualtextDiGioi + " / " +
                ActualtextDiNang + " / " +
                ActualtextMilitary + " / " +
                ActualtextHistory + " / " +
                ActualtextTranscendence + " / " +
                ActualtextTrongSinh + " / " +
                ActualtextTrinhTham + " / " +
                ActualtextExplore + " / " +
                ActualtextLinhDi + " / " +
                ActualtextSacStory + " / " +
                ActualtextBackstory + " / " +
                ActualtextSung + " / " +
                ActualtextPalaceFightingStory + " / " +
                ActualtextFemaleCuongStory + " / " +
                ActualtextGiaDauStory + " / " +
                ActualtextDongPhuong + " / " +
                ActualtextDamMy + " / " +
                ActualtextBachHop + " / " +
                ActualtextHumorous + " / " +
                ActualtextDienVan + " / " +
                ActualtextAncient + " / " +
                ActualtextMatThe + " / " +
                ActualtextTeen + " / " +
                ActualtextPhuongTay + " / " +
                ActualtextFemaleAssistant + " / " +
                ActualtextLightNovels + " / " +
                ActualtextVietNam + " / " +
                ActualtextDoanVan + " / " +
                ActualtextOther
        );
    }
    public void buttonSearchAdvance() throws InterruptedException {
        sleep(1000);
        String ActualSearchAdvance = btnSearchAdvance.getText();
        String ExpectedSearchAdvance = "Lọc Truyện";
        Assert.assertEquals(ExpectedSearchAdvance, ActualSearchAdvance);
        System.out.println("Test text successfully  : " + ActualSearchAdvance);
    }

    public void clickButtonSearchAdvance() throws InterruptedException {
        btnSearchAdvance.click();
        sleep(1000);
    }
    public void navigateSearchAdvance() throws InterruptedException {
        sleep(1000);
        String ActualSearchAdvance = textSearchAdvance.getText();
        String ExpectedSearchAdvance = "Lọc truyện - Chúc bạn tìm được truyện ưng ý để đọc nhé! | SSTruyen";
        Assert.assertEquals(ExpectedSearchAdvance, ActualSearchAdvance);
        System.out.println("Test text successfully  : " + ActualSearchAdvance);
        sleep(1000);
        driver. navigate(). back();
    }
    public void buttonStoryHot() throws InterruptedException {
        sleep(1000);
        String ActualStoryHot = btnStoryHot.getText();
        String ExpectedStoryHot = "Truyện hot";
        Assert.assertEquals(ExpectedStoryHot, ActualStoryHot);
        System.out.println("Test text successfully  : " + ActualStoryHot);
    }
    public void clickButtonStoryHot() throws InterruptedException {
        btnStoryHot.click();
        sleep(1000);
    }
    public void buttonCategory() throws InterruptedException {
        sleep(1000);
        String ActualCategory = textCategory.getText();
        String ExpectedCategory = "Tất cả";
        Assert.assertEquals(ExpectedCategory, ActualCategory);
        System.out.println("Test text successfully  : " + ActualCategory);
        btnCategory.click();
    }

    public void checkCategory() throws InterruptedException {
        sleep(2000);
        String ActualGoodTeenStories = btnOptionK8.getText();
        String ExpectedGoodTeenStories = "Truyện Teen Hay";
        Assert.assertEquals(ExpectedGoodTeenStories, ActualGoodTeenStories);
        String ActualtReverseRomance = btnOptionK9.getText();
        String ExpectedReverseRomance = "Ngôn Tình Ngược";
        Assert.assertEquals(ExpectedReverseRomance, ActualtReverseRomance);
        String ActualComedyRomance = btnOptionG1.getText();
        String ExpectedComedyRomance = "Ngôn Tình Hài";
        Assert.assertEquals(ExpectedComedyRomance, ActualComedyRomance);
        String ActualDamMyHai = btnOptionG2.getText();
        String ExpectedDamMyHai = "Đam Mỹ Hài";
        Assert.assertEquals(ExpectedDamMyHai, ActualDamMyHai);
        String ActualDamMyHay = btnOptionG3.getText();
        String ExpectedDamMyHay = "Đam Mỹ Hay";
        Assert.assertEquals(ExpectedDamMyHay, ActualDamMyHay);
        String ActualDamMyHVan = btnOptionG4.getText();
        String ExpectedDamMyHVan = "Đam Mỹ H Văn";
        Assert.assertEquals(ExpectedDamMyHVan, ActualDamMyHVan);
        String ActualGoodLoveQuotes = btnOptionK4.getText();
        String ExpectedGoodLoveQuotes = "Ngôn Tình Hay";
        Assert.assertEquals(ExpectedGoodLoveQuotes, ActualGoodLoveQuotes);
        String ActualFullStory = btnOptionK2.getText();
        String ExpectedFullStory = "Truyện Full";
        Assert.assertEquals(ExpectedFullStory, ActualFullStory);
        String ActualTienHiepHay = btnOptionK5.getText();
        String ExpectedTienHiepHay = "Tiên Hiệp Hay";
        Assert.assertEquals(ExpectedTienHiepHay, ActualTienHiepHay);
        String ActualLoveLanguage = btnOptionK6.getText();
        String ExpectedLoveLanguage = "Ngôn Tình Sắc";
        Assert.assertEquals(ExpectedLoveLanguage, ActualLoveLanguage);
        String ActualHotStories = btnOptionK3.getText();
        String ExpectedHotStories = "Truyện Hot";
        Assert.assertEquals(ExpectedHotStories, ActualHotStories);
        String ActualGoodSwordplay = btnOptionK7.getText();
        String ExpectedGoodSwordplay = "Kiếm Hiệp Hay";
        Assert.assertEquals(ExpectedGoodSwordplay, ActualGoodSwordplay);
        System.out.println("Test text successfully  : " + ActualGoodTeenStories
                + " / "  + ActualtReverseRomance
                + " / " + ActualComedyRomance
                + " / " + ActualDamMyHai
                + " / " + ActualDamMyHay
                + " / " + ActualDamMyHVan
                + " / " + ActualGoodLoveQuotes
                + " / " + ActualFullStory
                + " / " + ActualTienHiepHay
                + " / " + ActualLoveLanguage
                + " / " + ActualHotStories
                + " / " + ActualGoodSwordplay
            );
    }
    public void scroll() throws InterruptedException {
        sleep(1000);
        //sử dụng JavascriptExecutor, tạo một tham chiếu cho giao diện và gán nó cho cá thể WebDriver
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //executeScript Để cuộn trang theo chiều dọc 660px
        js.executeScript("window.scrollBy(0,600)", "");
        sleep(2000);
    }
    public void buttonLoadMore() throws InterruptedException {
        sleep(2000);
        String ActualLoadMore = btnLoadMore.getText();
        String ExpectedLoadMore = "Xem Thêm";
        Assert.assertEquals(ExpectedLoadMore, ActualLoadMore);
        System.out.println("Test text successfully  : " + ActualLoadMore);
        btnLoadMore.click();
        sleep(1000);
        btnLoadMore.click();
        sleep(1000);
        btnLoadMore.click();
        sleep(1000);
        btnLoadMore.click();
        String ActualLoadMoreNew = btnLoadMore.getText();
        String ExpectedLoadMoreNew = "Đã Load Hết Truyện";
        Assert.assertEquals(ExpectedLoadMoreNew, ActualLoadMoreNew);
        System.out.println("Test text successfully  : " + ActualLoadMoreNew);
    }
    public void buttonStoryNew() throws InterruptedException {
        sleep(1000);
        String ActualStoryNew = btnStoryNew.getText();
        String ExpectedStoryNew = "Truyện mới cập nhật";
        Assert.assertEquals(ExpectedStoryNew, ActualStoryNew);
        System.out.println("Test text successfully  : " + ActualStoryNew);
    }
    public void clickButtonStoryNew() throws InterruptedException {
        btnStoryNew.click();
        sleep(1000);
    }
    public void storyBookMark() throws InterruptedException {
        sleep(1000);
        String ActualStoryBookMark= textStoryBookMark.getText();
        String ExpectedStoryBookMark = "Truyện đánh dấu";
        Assert.assertEquals(ExpectedStoryBookMark, ActualStoryBookMark);
        System.out.println("Test text successfully  : " + ActualStoryBookMark);
    }
    public void storyBeingRead() throws InterruptedException {
        sleep(1000);
        String ActualStoryBeingRead= textStoryBeingRead.getText();
        String ExpectedStoryBeingRead = "Truyện đang đọc";
        Assert.assertEquals(ExpectedStoryBeingRead, ActualStoryBeingRead);
        System.out.println("Test text successfully  : " + ActualStoryBeingRead);
    }
    public void storyGenre() throws InterruptedException {
        sleep(1000);
        String ActualStoryGenre= textStoryGenre.getText();
        String ExpectedStoryGenre = "Thể loại truyện";
        Assert.assertEquals(ExpectedStoryGenre, ActualStoryGenre);
        System.out.println("Test text successfully  : " + ActualStoryGenre);
    }
    public void storyComplete() throws InterruptedException {
        sleep(1000);
        String ActualStoryComplete= btnStoryComplete.getText();
        String ExpectedStoryComplete = "Truyện đã hoàn thành";
        Assert.assertEquals(ExpectedStoryComplete, ActualStoryComplete);
        System.out.println("Test text successfully  : " + ActualStoryComplete);
    }
    public void storyIntroduce() throws InterruptedException {
        sleep(1000);
        String ActualIntroduce= textIntroduce.getText();
        String ExpectedIntroduce = "Sstruyen.vn là nơi cập nhật những truyện hay và mới nhất từ các tác giả nổi tiếng trong và ngoài nước.\n" +
                "Với hơn 20 thể loại truyện, đọc truyện trên sstruyen.vn trở nên dễ dàng hơn bao giờ hết với hệ thống đọc truyện tiện lợi và đa dạng. Hãy đến với sstruyen.vn để khám phá thế giới truyện đầy màu sắc!";
        Assert.assertEquals(ExpectedIntroduce, ActualIntroduce);
        System.out.println("Test text successfully  : " + ActualIntroduce);
    }
    public void storyContact() throws InterruptedException {
        sleep(1000);
        String ActualContact= textContact.getText();
        String ExpectedContact = "Liên hệ: sstruyenvn@gmail.com";
        Assert.assertEquals(ExpectedContact, ActualContact);
        System.out.println("Test text successfully  : " + ActualContact);
    }
    public void backToFrontPage() throws InterruptedException {
        sleep(1000);
        btnBackToFrontPage.click();
        String ActualContact= textContact.getText();
        String ExpectedContact = "Liên hệ: sstruyenvn@gmail.com";
        Assert.assertEquals(ExpectedContact, ActualContact);
        System.out.println("Test text successfully  : " + ActualContact);
    }
    public void storyTest() throws InterruptedException {
        sleep(1000);
        String ActualContact= textStory1.getText();
        String ExpectedContact = "Một Thai Hai Bảo: Giám Đốc Hàng Tỉ Yêu Vợ Tận Xương";
        Assert.assertEquals(ExpectedContact, ActualContact);
        System.out.println("Test text successfully  : " + ActualContact);
        textStory1.click();
    }
    public void titleStoryTest() throws InterruptedException {
        sleep(1000);
        String ActualTitle= driver.getTitle();
        String ExpectedTitle = "Một Thai Hai Bảo: Giám Đốc Hàng Tỉ Yêu Vợ Tận Xương chương mới nhất | SSTruyen";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Test title successfully  : " + ActualTitle);
    }
}
