package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits-homework.php");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement clickBtn = driver.findElement(By.id("show_text_synchronize_three"));
        clickBtn.click();

        WebElement checkBox1 = driver.findElement(By.className("cb1-element"));
        checkBox1.click();


    }
}