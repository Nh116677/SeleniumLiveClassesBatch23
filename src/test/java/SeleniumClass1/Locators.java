package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        // go to the website
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/locator-homework.php");
        driver.manage().window().maximize();

        // go to the text box and enter first name

        WebElement firstName = driver.findElement(By.id("fullName"));
        firstName.sendKeys("Nhu Nguyen");

        //enter the invalid email address and confirm that the error is displayed
        WebElement emailAddress = driver.findElement(By.name("yourEmail"));
        emailAddress.sendKeys("nh116677@gmail.com");

        Thread.sleep(5000);

        //Correct email address
        emailAddress.clear();//clean the previous email address

        emailAddress.sendKeys("nh116677@gmail.com");




    }
}
