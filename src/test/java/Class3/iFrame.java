package liveClas03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe-homework.php");
        driver.manage().window().maximize();
//fill in the username
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("grooot");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdown-iframe");
        //now we deal with dropdown
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(dropDown);
        sel.selectByValue("NewYork");


        //locating the third frame by webelement
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.className("cb1-element")).click();

    }
}