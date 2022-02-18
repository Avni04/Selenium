package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("gender-female")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("FirstName")).sendKeys("Avni");
        Thread.sleep(2000);

        driver.findElement(By.id("LastName")).sendKeys("Patel");
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement year=  driver.findElement(By.name("DateOfBirthYear"));

        Select select = new Select(day);
        select.selectByValue("4");

        Select select1= new Select(month);
        select1.selectByVisibleText("April");

        Select select2= new Select(year);
        select2.selectByValue("1992");


        driver.findElement(By.xpath("//input [contains(@id, 'Email')]")).sendKeys("avni123@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("Company")).sendKeys("unify testing ltd");
        Thread.sleep(2000);

        driver.findElement(By.id("Newsletter")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("Password")).sendKeys("Dhrish28");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dhrish28");
        Thread.sleep(2000);

        driver.findElement(By.id("register-button")).click();
        Thread.sleep(1000);




    }

    private static void SelectValueFromDropDown(WebElement day, String value) {
        Select select= new Select(day);
        select.selectByVisibleText("4");
    }
}
