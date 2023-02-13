import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator {

	public static void main(String[] args)throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PPonnella\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://rahulshettyacademy.com/locatorspractice/");
		d.findElement(By.id("inputUsername")).sendKeys("pavan");
		d.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
		d.findElement(By.className("signInBtn")).click();
		//System.out.println(d.findElement(By.cssSelector("p.error")).getText());
		d.findElement(By.linkText("Forgot your password?")).click();
	d.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("pavan");
	d.findElement(By.className("reset-pwd-btn")).click();
	d.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pavan@123");
	d.findElement(By.xpath("//input[@placeholder='Email']")).clear();
	d.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kalyan@123");  ////input[@type='text'][1] if attribute and attribute value are same then x-path using 
	d.findElement(By.xpath("//form/p")).getText();	 
	{
			
		}
		
		
	}

}
