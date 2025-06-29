package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) throws InterruptedException{
        //declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //go to browser
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel=new Select(dropdown);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByVisibleText("Banana");
        Thread.sleep(2000);
        sel.selectByValue("Apple");

        //multiselect dropdown
        WebElement multiSelectDD = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select selDD = new Select(multiSelectDD);
        selDD.selectByValue("Cooking");
        selDD.selectByIndex(4);

        Thread.sleep(2000);
        selDD.deselectByIndex(4);

        //how can we check if the dropdown is multiple select or not( single select)
        System.out.println(" The dropdown is multi select " + selDD.isMultiple());



    }
}
