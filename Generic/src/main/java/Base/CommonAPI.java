package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    WebDriver driver = null;

@BeforeMethod
    public void beforeMethod(){
    System.setProperty("webdriver.chrome.driver","C:\\Users\\smkha\\IdeaProjects\\SeleniumWebTest\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
    driver.navigate().to("https://www.walmart.com");
    driver.manage().window().maximize();
}
@Test
    public void test(){
    driver.findElement(By.cssSelector(".header-GlobalSearch-input")).sendKeys("Sony TV",Keys.ENTER);
}
@AfterMethod
    public void afterMethod(){
    driver.close();
}
}
