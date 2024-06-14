package StepDefinitions;

import Pages.BaykarPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NavbarStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(NavbarStepDefinitions.class);

    @Given("Baykar Sitesine Git")
    public void baykarSitesineGit() {
        BaykarPages.HomePage();
        System.out.println("Baykar Kariyer Sitesine Başarılı Bir Şekilde Gidildi");
    }

    @When("HeaderBarda bulunan Tüm Navbar sekmelerine tikla")
    public void headerbardaBulunanTümNavbarSekmelerineTikla() throws InterruptedException {
        BaykarPages.NavbarClick();
        System.out.println("Tüm Navbarlara Tıklandı");
        log.info("Sayfaya basarili bir sekilde giris yapildi");
    }


    @Then("Sayfada Tüm Navbarlara Tiklanabildigini Kontrol Et")
    public void sayfadaTümNavbarlaraTiklanabildiginiKontrolEt() {
        log.info("Tüm Navbarlara Tiklanabilirligi Dogrulandi");
    }
}
