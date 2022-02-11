package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class MicrosoftEdge {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver" , "C:\\Users\\dhris\\IdeaProjects\\Selenium\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();

        String url = driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);

        driver.close();

    }
}
