import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Google\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table/");
	driver.manage().window().maximize();
	List<WebElement> trows = driver.findElements(By.tagName("tr"));
	WebElement row = trows.get(0);
	List<WebElement> tdata = row.findElements(By.tagName("td"));
	for (int i = 0; i < tdata.size(); i++) {
		WebElement data = tdata.get(i);
		String n = data.getText();
		System.out.println(n);
		
	}
	
	}
	
		
		
	}


