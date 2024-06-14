package StepDefinitions;

import Pages.BaykarPages;
import Util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LanguageStepDefinitions{

    WebDriver driver = Driver.getDriver();
    BaykarPages baykarPages = new BaykarPages(driver);

    @Given("Baykar Web Sitesine Git")
    public void baykarWebSitesineGit() {
        BaykarPages.HomePage();
        System.out.println("Siteye gidildi");

    }

    @When("HeaderBarda bulunan Language sekmesine tikla")
    public void headerbardaBulunanLanguageSekmesineTikla() {
        BaykarPages.LanguageClick();
        System.out.println("Bu adıma gelindi");
    }

    @Then("Sayfada Dil Degisimi Oldugunu Kontrol Et")
    public void sayfadaDilDegisimiOldugunuKontrolEt() {
    }
}
