package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://www.googlemail.com");

        String title = driver.getTitle();
        if(title.contains("Gmail")){
            System.out.println("Test Cases passed");
        }else {
            System.out.println("Test Cases not passed");
        }
        driver.quit();
    }
}
