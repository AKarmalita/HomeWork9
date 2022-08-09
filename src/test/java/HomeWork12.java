import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.BlogPage;
import pages.MainPage;
import pages.MenuList;

public class HomeWork12 extends Base{
    private static final String MAIN_URL = "https://ithillel.ua/";
    private static MainPage mainPage;
    private static BlogPage blogPage;

    @BeforeClass
    public static void before (){
        driver.get(MAIN_URL);
        mainPage= new MainPage(driver);
    }

    @Test
    public void testBlog(){
        mainPage.clickBlogButton();
        Assert.assertEquals(driver.getTitle(), "Корисні матеріали: статті та новини IT-індустрії | Комп'ютерна школа Hillel");
        blogPage=new BlogPage(driver);

    }

    @Test
    public void testFrontEnd(){
        blogPage.clickBlogMenu("frontend");
        System.out.println("frontend =" + blogPage.getListNewsSize());
        driver.navigate().back();
    }

    @Test
    public void testQa(){
        blogPage.clickBlogMenu("qa");
        System.out.println("qa =" + blogPage.getListNewsSize());
        driver.navigate().back();
    }

    @Test
    public void testPm(){
        blogPage.clickBlogMenu("management");
        System.out.println("PM =" + blogPage.getListNewsSize());
        driver.navigate().back();
    }

    @Test
    public void testMarketing(){
        blogPage.clickBlogMenu("marketing");
        System.out.println("Marketing =" + blogPage.getListNewsSize());
        driver.navigate().back();
    }
}
