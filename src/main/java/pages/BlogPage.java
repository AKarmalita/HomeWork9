package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlogPage {
    public BlogPage(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//li[@class='theme-list_item']")
    List<WebElement> listBlogMenu;

    @FindBy(xpath = "//ul[contains(@class, 'post-list') and contains(@class, 'post-list')]")
    WebElement listNews;

    public void printHrefListBlogMenu(){
        for (WebElement l:listBlogMenu){
            System.out.println(l.findElement(By.tagName("a")).getAttribute("href"));
        }
    }
    public void clickBlogMenu(String name){
        for (WebElement l:listBlogMenu){
            if(l.findElement(By.tagName("a")).getAttribute("href").contains(name)){
                l.click();
                break;
            }
        }
    }
    public int getListNewsSize(){
        return listNews.findElements(By.tagName("li")).size();
    }

}
