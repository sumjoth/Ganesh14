import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gg {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Google\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://paytm.com/");

WebElement f = driver.findElement(By.xpath("//div[@class='_1Vt1']"));

f.click();


}
}
