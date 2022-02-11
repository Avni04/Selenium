package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\dhris\\IdeaProjects\\Selenium\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.close();


    }
}
