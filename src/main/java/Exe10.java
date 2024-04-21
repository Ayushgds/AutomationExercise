import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Exe10 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/BD225VJ/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        exe.executeScript("arguments[0].click();",ele);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//span[text()='My Info']")).click();

        Thread.sleep(10000);
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FileHandler.copy(src,new File("C:/Users/BD225VJ/AutomationExercise/screenshots/exe11.png"));
        driver.close();



    }}