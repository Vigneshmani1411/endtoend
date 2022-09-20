package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndtoEndusingChrome {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://cf-customer-site-qa.s3-website.ap-south-1.amazonaws.com/#/login");
		driver.manage().window().maximize(); 
		
		//login
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("text")).sendKeys("naveen@coinfantasy.io");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='0']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='1']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='2']")).sendKeys("0");
		driver.findElement(By.xpath("//input[@name='3']")).sendKeys("0");
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		Thread.sleep(3000);
		
		
		//join now
		driver.findElement(By.xpath("(//div[@class='button-section text-[clamp(7px,1vw,14px)]']//button)[7]")).click();
		
		//select coins
		//low cap
		driver.findElement(By.xpath("//div[@class='flex h-full']/div/div[4]/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//+
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();
		
		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='5x']/..")).click();
		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='3x']/..")).click();
		
		
		//mid cap
		driver.findElement(By.xpath("(//div[@class='flex h-full']/div/div[4]/button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='1x']/..")).click();
		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[2]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='3x']/..")).click();
		
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='4x']/..")).click();
		
		
		
		//high cap
		driver.findElement(By.xpath("(//div[@class='flex h-full']/div/div[4]/button)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class='w-[10%]']//button)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Down']/../..")).click();
		driver.findElement(By.xpath("//button[text()='2x']/..")).click();
		
		driver.findElement(By.xpath("//button[text()='Join Game']")).click();
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View Game']")).click();
	
	}
	
}
