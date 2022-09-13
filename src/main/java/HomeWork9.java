import driverConfig.BROWSER;
import driverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomeWork9 {
    static final String BASEURL="https://ithillel.ua/courses/java-basic";
    static final By CourseTitle=By.className("course-descriptor_header-text");
    static final By CourseRate = By.className("course-rating_average");
    static final By CourseDescription = By.xpath("//div[contains(@class, 'introduction-info_content') and contains(@class,'introduction-info-redactor')]");

    public void getCourseTitle() {
        WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
        driver.get(BASEURL);
        WebElement searchField = driver.findElement(CourseTitle);
        System.out.println("The course title is: " + searchField.getText());
    }

    public void getCourseRate(){
        WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
        driver.get(BASEURL);
        WebElement searchField = driver.findElement(CourseRate);
        System.out.println("The course rate is: " + searchField.getText());
    }

    public void getCourseDescription(){
        WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
        driver.get(BASEURL);
        WebElement searchField = driver.findElement(CourseDescription);
        System.out.println("The course description is: " + searchField.getText());
    }
}

