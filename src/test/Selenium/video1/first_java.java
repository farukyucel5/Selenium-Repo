package video1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_java {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("The page title "+driver.getTitle());
        System.out.println("The page url "+driver.getCurrentUrl());
        System.out.println("The hashcode of the page "+driver.getWindowHandle());

        System.out.println("The source code of the webpage: "+driver.getPageSource());

    }
}
