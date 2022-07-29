import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebElement;

import java.net.URL;

public class Test {
    static final By SEARCH=By.xpath("//*[@id=\"body\"]/div[1]/main/section[1]/div[1]/div/p");
    static final String text="Вдосконалюйся!";
    static final String BASEURL="https://ithillel.ua/";
    public static void main(String[] args) throws Exception {

        WebDriver driver = DriverFactory.getDriver("CHROME");
        driver.get(BASEURL);
        WebElement searchField = driver.findElement(SEARCH);
        if (!searchField.getText().equals(text)) {
            throw new Exception("Text is not equal");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {

        }
        driver.quit();
    }

}
