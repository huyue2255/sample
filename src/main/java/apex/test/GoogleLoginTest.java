package apex.test;
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleLoginTest {
    public static void main(String[] args) throws InterruptedException {


        String exePath = "/Users/yuehu/Documents/workspace/HelloWorld/chromedriver";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        driver.close();

        WebDriver driver2 = new FirefoxDriver();
        System.out.println(driver);
        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.id("lst-ib"));
        search.sendKeys("java firebook");

//        WebElement login = driver.findElement(By.cssSelector("a#gb_70"));
//        login.click();

        WebElement sendSS = driver.findElement(
                By.cssSelector(".jsb > center:nth-child(1) > input:nth-child(1)"));
        sendSS.click();

        Thread.sleep(5000);
        driver.close();
    }
}
