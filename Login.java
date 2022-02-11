package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Login {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhris\\IdeaProjects\\Selenium\\chromedriver.exe ");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/ ");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("Abc0404@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Avanikrunal29");
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("ico-logout")).click();
        Thread.sleep(1000);
        driver.close();

    }
}
