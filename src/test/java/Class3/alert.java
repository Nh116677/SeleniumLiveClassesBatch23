package Class3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();

        //switch the focus to the alert
        Alert alertHandler = driver.switchTo().alert();
        Thread.sleep(2000);
        alertHandler.accept();

        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Thread.sleep(2000);
        alertHandler.dismiss();


    }
}
