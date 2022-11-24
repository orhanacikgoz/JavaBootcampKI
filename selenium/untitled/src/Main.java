import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/orhan/selenium/chromedriver_win32/chromedriver.exe/");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.google.com.tr/");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.name("q")).sendKeys("trendyol");
        webDriver.findElement(By.linkText("Google'da Ara")).click();


    }
}