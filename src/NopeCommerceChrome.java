import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NopeCommerceChrome {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the driver
        driver.get(baseUrl);
        //maximize the browser
        driver.manage().window().maximize();
        //time to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //get the current url
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //set link to login field by click
        WebElement loginField = driver.findElement(By.linkText("Log in"));
        loginField.click();
        //print the email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc@gmail.com");
        //print the password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Welcome123");
        //driver quit
        driver.quit();

    }
}
