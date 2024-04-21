import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/BD225VJ/chromedriver-win64/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("LOL");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ok");
        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
         String a = driver.findElement(By.xpath("//div[@class='fsl fwb fcb']")).getText();
        System.out.println(a);
        driver.quit();

    }
}
