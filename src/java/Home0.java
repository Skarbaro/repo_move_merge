package homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

    public static void main(String[] args) {

        WebDriver browser = new ChromeDriver();
        browser.get("https://google.com");
        browser.quit();

    }
}
