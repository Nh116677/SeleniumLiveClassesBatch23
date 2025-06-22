package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class WebDriverCommands {

        public static void main(String[] args) throws InterruptedException {
//        goto facebook.com
            WebDriver driver=new ChromeDriver();

            driver.get("https://www.facebook.com");
//        maximize the window
            driver.manage().window().maximize();
//        get the title
            String titleOftheWebPage = driver.getTitle();

            System.out.println("the title of the webPage is "+titleOftheWebPage);
            String webPageURL = driver.getCurrentUrl();
            System.out.println("The url is " + webPageURL);
            driver.navigate().to("https://google.com");

            //for visualization
            Thread.sleep(2000);

            //go back to facebook.com
            driver.navigate().back();

            driver.quit();
        }
    }


