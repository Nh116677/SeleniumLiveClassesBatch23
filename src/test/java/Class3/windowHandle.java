package Class3;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");
        driver.manage().window().maximize();


        WebElement B1 = driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        WebElement B2 = driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));

        B1.click();
        B2.click();

        //get the window handle of the main page

        String mainPageHandle = driver.getWindowHandle();
        System.out.println("the handle of the main page is "+mainPageHandle);


//        switch the focus of the driver to the page b2
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String url = driver.getCurrentUrl();
            if(url.equals("https://syntaxprojects.com/b2-page.php")){
                break;
            }
        }

        System.out.println(driver.getCurrentUrl());

//        switch the focus to main page

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getCurrentUrl());

    }
}
