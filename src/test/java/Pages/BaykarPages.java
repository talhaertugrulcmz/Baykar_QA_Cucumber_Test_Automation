package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class BaykarPages {

    private static final Logger log = LoggerFactory.getLogger(BaykarPages.class);
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;


    static By LanguageClick = By.cssSelector("li[class=\"siteCustomLi\"]");

    public BaykarPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {

    }

    public static void LanguageClick() {
        WebElement LanguageText = driver.findElement(By.cssSelector("li[class=\"siteCustomLi\"]"));
        String LanguageTextContains = driver.findElement(By.cssSelector("div[class=\"wrapper\"]")).getText();
        LanguageText.getAttribute("text");

        if (LanguageText.equals("EN")) {
            System.out.println("Sayfa Dili Türkçe'dir");
        } else {
            System.out.println("Sayfa Dili İngilizce'dir");
        }

        if (LanguageTextContains.contains("AÇIK POZİSYONLAR")) {
            System.out.println("Sayfa Dili Türkçe İçermektedir");
        }
        elementHelper.click(LanguageClick);


        if (LanguageText.equals("TR")) {
            System.out.println("Sayfa Dili İngilizce'dir");
        } else {
            System.out.println("Sayfa Dili Türkçe'dir");
        }

        if (LanguageTextContains.contains("OPEN POSITIONS")) {
            System.out.println("Sayfa Dili İngilizce'dir");
        } else {
            System.out.println("Sayfa Dili Değiştirilemedi");
        }

    }

    public static void NavbarClick() throws InterruptedException {

        List<WebElement> navbar = driver.findElements(By.xpath("/html/body/div/header/nav/div/div/ul/li/a"));
        List<String> navbarList = new ArrayList<>();
        List<WebElement> altNavbar = driver.findElements(By.xpath("/html/body/div/header/nav/div/div/ul/li/ul/li/a"));
        List<WebElement> altNavbarList = new ArrayList<>();

        WebElement b;
        WebElement a;
        Thread.sleep(1000);
        if (!navbar.isEmpty()) {
            for (int i = 2; i < navbar.size(); i++) {
                a = navbar.get(i);
                System.out.println(a.getText());
                navbar.get(i).click();
                Thread.sleep(2000);
                System.out.println("Tüm Navbar Ekranlari Basarili Bir Sekilde Geldi...");


            }

            String parent = driver.getWindowHandle();
            driver.switchTo().window(parent);
            navbar.get(2).click();
            for (int j = 6; j < altNavbar.size(); j++) {
                b = altNavbar.get(j);
                System.out.println(b.getText());
                altNavbar.get(j).click();
                Thread.sleep(1000);
            }

        }
        List<WebElement> NavbarLink = driver.findElements(By.xpath("/html/body/div[15]/div[2]/div[1]/div[1]/div/div[2]/a"));
        List<String> linkHaberler = new ArrayList<>();
        System.out.println("Alt Bar Size Boyutu = " + NavbarLink.size());

        int x;

        if (!NavbarLink.isEmpty()) {
            for (int i = 0; i < NavbarLink.size(); i++) {
                x = NavbarLink.indexOf(i) * -1;
                System.out.println(x + ".haber goruntulendi");
                methods.hoverElement(By.xpath(xpath));

                logger.info(x + " .Haberi Alt Numaralardan Kontrol Islemi Yapildi");

            }
        }
    }
}

