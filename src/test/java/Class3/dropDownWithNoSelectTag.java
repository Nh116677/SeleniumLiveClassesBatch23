package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropDownWithNoSelectTag {
    public static void main(String[] args) {


        //declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //go to browser
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        WebElement dropDown = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        dropDown.click();

        List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']"));
        for(WebElement option:options){
            String optionText = option.getText();
            if(optionText.equals("Apple")){
                option.click();
            }
        }

    }
}
