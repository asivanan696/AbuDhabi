import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntoduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.driver", "/Users/Gleac/Downloads/chromedriver-mac-x64/chromedriver");

		WebDriver driver=new ChromeDriver();

		//Firefoxlaunch
		System.setProperty("Webdriver.gecko.driver", "/Users/Gleac/Downloads/chromedriver-mac-x64/chromedriver");

//		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		
		
		driver.findElement(By.xpath("//*[@placeholder='Date of travel']")).click();
//		driver.close();
//		driver.findElement(By.xpath("//*[@class=\"flatpickr-day today\"]")).click();
		
//		driver.findElement(By.xpath("//*[@class='flatpickr-day']"));
		
		
		String currentMonth=driver.findElement(By.xpath("//*[@class='cur-month']")).getText();
		driver.findElement(By.xpath("//*[@class='cur-month']")).getText();
		
		//input[@min="2023"]
		
		
		while(!driver.findElement(By.xpath("//*[@class='cur-month']")).getText().contains("October ")) {
			driver.findElement(By.xpath("//*[@class=\"flatpickr-next-month\"]")).click();
			break;
			
			
		}
		
		
		List<WebElement> dates=driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		
		for(WebElement s:dates) {
			System.out.println(s.getText());
		}
		
		int count=driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			String text=driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();
			
			if(text.equalsIgnoreCase("26")) {
				
				driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
				break;
				
			}
		}
//		driver.quit();

	}

}
