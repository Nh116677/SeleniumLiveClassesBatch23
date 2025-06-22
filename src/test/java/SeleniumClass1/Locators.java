package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
//        goto the website
        WebDriver driver =new ChromeDriver();
        driver.get("https://syntaxprojects.com/locator-homework.php");
        driver.manage().window().maximize();

//        goto the text box and enter first name
        WebElement firstName = driver.findElement(By.id("fullName"));
        firstName.sendKeys("groootistan");

//        Enter the invalid email address and confirm that the error is displayed
        WebElement emailAddress = driver.findElement(By.name("yourEmail"));
        emailAddress.sendKeys("grrotisangmail.com");

        Thread.sleep(5000);
//        correct email address and verufy that error vanishes
        emailAddress.clear();  //clean the previous email address
        emailAddress.sendKeys("grrotisan@gmail.com");


        Thread.sleep(2000);
//        click on the text  "click here"
        WebElement clickHereBtn = driver.findElement(By.linkText("Click Here."));
        clickHereBtn.click();

    }
}
