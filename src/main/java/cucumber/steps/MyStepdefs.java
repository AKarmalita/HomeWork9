package cucumber.steps;

import cucumber.Base;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MainPage;

import java.util.List;

public class MyStepdefs extends Base {
    static MainPage mainPage = null;
    static final String mainUrl = "https://dnipro.ithillel.ua/";
    @When("^I open site \"([^\"]*)\"$")
    public void iOpenSite(String url) throws Throwable {
        driver.get(url);
        switch (url){
            case mainUrl:
                mainPage = new MainPage(driver);
                break;
        }
    }

    @Then("^text description must equals \"([^\"]*)\"$")
    public void textDescriptionMustEquals(String text) throws Throwable {
        Assert.assertEquals(mainPage.getMTitleText(), text);
    }

    @Then("^Check titles on buttons$")
    public void checkTitlesOnButtons(List<String> list) {
        System.out.println(mainPage.checkHeaderTitles(list));
    }

    @After(value = "@MainPageFeature")
    public void close(){
        driver.quit();
    }
}
