package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("enable_button")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement btn = driver.findElement(By.xpath("//button[text()='Button']"));
        wait.until(ExpectedConditions.elementToBeClickable(btn));
        btn.click();
        System.out.println( btn.isEnabled());


        driver.findElement(By.id("checkbox_button")).click();

        WebElement checkBox = driver.findElement(By.id("checkbox"));
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        System.out.println(checkBox.isSelected());


        driver.findElement(By.id("changetext_button")).click();

        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));

        String text = driver.findElement(By.xpath("//h2[@id='headingtext']")).getText();
        System.out.println(text);

    }
}