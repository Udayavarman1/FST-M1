package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        // Open the browser
        driver.get("https://www.training-support.net");

        Thread.sleep(5000);
        // Close the browser
        driver.close();
    }

}
