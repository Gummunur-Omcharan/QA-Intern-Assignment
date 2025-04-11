import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_logout {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(180));
		driver.manage().window().maximize();
		driver.get("https://www.intervue.io/");
		driver.findElement(By.xpath("//div[@id='iv-homepage-login']//div//span[contains(text(),'Login')]")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		List<String> windowList=new ArrayList(windowIDs);
		String Parentid=windowList.get(0);
		String childid=windowList.get(1);
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.id("login_email")).sendKeys("neha@intervue.io");
		driver.findElement(By.id("login_password")).sendKeys("Ps@neha@123");
		String title=driver.getTitle();	

		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement loginbtn=driver.findElement(By.xpath("//button/span[contains(text(),'Login with email')]"));
		js.executeScript("arguments[0].click()",loginbtn);
		Thread.sleep(3000);		
		
		
		if(title.equals("Login | Intervue: Tech hiring tool for recruiters")) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File sourcefile=ts.getScreenshotAs(OutputType.FILE);
			File targetfile=new File("C:\\Users\\hi\\Desktop\\selinium_code\\Intervue.io\\Screenshot\\Login_Failure.png");
			sourcefile.renameTo(targetfile);
			System.out.println("Login failed, Screenshot captured Succefully");			
		}	
		else {
			
			System.out.println("Login successful, no screenshot captured.");
		}
		
		
		WebElement H_search=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='HeaderSearch__SearchLensIconWrap-sc-1140h69-2 hVEOxf']")));
		H_search.click();
		
		WebElement I_search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type what you want to search for']")));
		I_search.sendKeys("Hello");
		
		WebElement Suggestion=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='style__CardsWrapper-pqpu-13 hWxwTx']")));
		Suggestion.click();			
		
		WebElement Neha_Menu=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Dropdown__Wrapper-ejd68n-0 kjKPLV']")));
		Neha_Menu.click();		
		
		WebElement Logout=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Logout')]")));
		Logout.click();		
		
		driver.quit();

	}

}
