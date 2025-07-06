package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calendar {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("https://syntaxprojects.com/jquery-date-picker-demo-homework.php");
        //Click on the calendar
        driver.findElement((By.id("from_date"))).click();
        //Get the month
        boolean nofound = true;
        while (nofound) {
            WebElement month = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']"));
            String currentMonth = month.getText();
            if (currentMonth.equals("December")) {
                //select the date
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : allDates) {
                    String requiredDate = date.getText();
                    if (requiredDate.equals("25")) {
                        date.click();
                    }
                }
                //break the loop
                nofound = false;
            }
            if (nofound) {
                //click on next button
                WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nextBtn.click();
            }
        }
    }
}
