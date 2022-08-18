package cucumber.steps;

import cucumber.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;

public class CertificateSteps extends Base {
    CertificatePage certificatePage = PageFactory.initElements(driver, CertificatePage.class);

    @And("Enter certificate code {string}")
    public void enterCertificateCode(String certificate) throws Throwable {
        certificatePage.getResultCertificate(certificate);
    }

    @Then("Check result")
    public void checkResult() throws InterruptedException{
        Assert.assertNotEquals(certificatePage.getMessage(), "Сертифікат не знайдено");
    }


}
