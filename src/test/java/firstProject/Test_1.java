package firstProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Test_1 {
    WebDriver wd;

    @BeforeMethod
    public void preConditions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/julia/Documents/QA/QA_Automation/QA/Qa31_Start1/chromedriver.exe");
        wd.navigate().to("https://trello.com/");
    }

        @Test
        public void testNew() {
            //WebElement el = wd.findElement(By.tagName("a"));
            WebElement el2 = wd.findElement(By.tagName("div"));
            WebElement el22 = wd.findElement(By.cssSelector("div"));

            WebElement el4 = wd.findElement(By.id("hero"));
            WebElement el44 = wd.findElement(By.cssSelector("#hero"));

            WebElement el3 = wd.findElement(By.className("font-weight-bold"));
            WebElement el33 = wd.findElement(By.cssSelector(".font-weight-bold"));

            WebElement link = wd.findElement(By.linkText("Sign Up"));
            WebElement link2 = wd.findElement(By.cssSelector("[href='/login']"));
            //WebElement partLink = wd.findElement(By.partialLinkText("Sign"));
        }
          @Test
                  public void  test2(){
            List<WebElement> ael= wd.findElements(By.tagName("a"));
            System.out.println(ael.size());

        }

        @Test
        public void  enterEmail(){
            WebElement eln= wd.findElement(By.cssSelector("input[name='email']"));
            type(eln, "juliakliot.jk@gmail.com");

        }
    @Test
    public void  enterEmailWithoutCom(){
        WebElement eln= wd.findElement(By.cssSelector("input[name='email']"));
        type(eln, "juliakliot.jk@gmail");

    }
    @Test
    public void  enterEmailNeg2(){
        WebElement eln= wd.findElement(By.cssSelector("input[name='email']"));
        type(eln, "juliakliot.jkgmail.com");

    }

    public void type(WebElement eln, String email) {
        eln.click();
        eln.clear();
        eln.sendKeys(email);
    }

    @AfterMethod
    public void close(){
        wd.close();
        wd.quit();
    }

}
