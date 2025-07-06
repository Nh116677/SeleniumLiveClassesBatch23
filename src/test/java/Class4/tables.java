package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tables {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //entering the login info
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();
        //navigating to the PIM module
        WebElement pimButton=driver.findElement(By.xpath("//b[text()='PIM']"));
        pimButton.click();


        //find the column id
        List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        int count=1;
        for(WebElement id:allIds){
            String idValue = id.getText();
            if(idValue.equals("90906036")){
//  print the row number of this id in the table at this particular moment
                System.out.println("the row value is "+count);
//                find the checkbox and click on it
//                over here we are creating a dynamic xpath by integrating count in place of row number as row numbers change and count takes care of that
                WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                checkBox.click();
            }
            count=count+1;

        }







    }
}