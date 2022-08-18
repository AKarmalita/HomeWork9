package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatePage {
    @FindBy(name = "certificate")
    WebElement cerField;

    @FindBy(xpath = "//button[contains(@class, 'btn') and contains(@class,'certificate-check_submit')]")
    WebElement buttonSubmit;

    @FindBy (xpath = "//p[@class='certificate-check_message']")
    WebElement message;

    public void getResultCertificate(String certificate) throws InterruptedException {
        cerField.sendKeys(certificate);
        Thread.sleep(2000);
        buttonSubmit.click();
        Thread.sleep(2000);

    }

    public String getMessage() {
        return message.getText();
    }
}
