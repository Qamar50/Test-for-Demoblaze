import java.awt.Window;
import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 
import java.util.Date; 
import org.openqa.selenium.TakesScreenshot;  
public class TESTCASES extends PARAMETERS {
	
	@BeforeTest
	public void BeforeTest() {
		driver.get(Homepage);
		  driver.manage().window().maximize();
		
	}
	
	// @Test()
	// public void SignUp () throws InterruptedException {

	// WebElement SignUp = driver.findElement(By.xpath("//*[@id=\"signin2\"]"));
	// WebElement UserName =
	// driver.findElement(By.xpath("//*[@id=\"sign-username\"]"));
	// WebElement Password =
	// driver.findElement(By.xpath("//*[@id=\"sign-password\"]"));
	// WebElement SignUpButton =
	// driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));

	// STEPS TO SIGNUP
	// SignUp.click();
	// Thread.sleep(3000);
	// UserName.sendKeys(UserName1);
	// Password.sendKeys(Password1);
	// SignUpButton.click();
	//
   //	}
	
	@Test(priority=1)
	public void LogIn () throws InterruptedException{
	
		
		WebElement LogIn = driver.findElement(By.xpath("//*[@id=\"login2\"]"));
		WebElement LogInField = driver.findElement(By.id("loginusername"));
		WebElement PasswordField = driver.findElement(By.id("loginpassword"));
		WebElement LogInButton = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
	
	//STEPS TO LOGIN
	LogIn.click();
	Thread.sleep(2000);
	LogInField.sendKeys(UserName1);
	Thread.sleep(2000);
	PasswordField.sendKeys(Password1);
	LogInButton.click();	
	}
	
	
	@Test(priority=2)	
	public void ADD_ONLY_DEVICES_THAT_ARE_SAMSUNG() throws InterruptedException {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		driver.get(Homepage);
		Thread.sleep(1000);
		List<WebElement> Items = driver.findElements(By.className("card-block"));

		for (int i = 0; i < Items.size(); i++) {

		List<WebElement> AllItems = driver.findElements(By.className("hrefch"));

			if (AllItems.get(i).getText().contains("Samsung")) {
				
				Thread.sleep(1000);
				AllItems.get(i).click();
				
				driver.findElement(By.linkText("Add to cart")).click(); // Add to cart
				
				Thread.sleep(2000);
				driver.switchTo().alert().accept(); // Accept the confirmation alert

				Thread.sleep(2000);
				driver.get(Homepage);
				
				Thread.sleep(6000);

			}
		}

	}


	
	
	
	
	
	@Test(priority=3)	
	public void RANDOMLY_ADD3_PHONES() throws InterruptedException {
		Thread.sleep(4000);
		
		List<WebElement> Categories = driver.findElements(By.id("itemc"));
		
		Categories.get(0).click();
		
		Thread.sleep(3000);
		
		
		
		String [] URLS = {"https://www.demoblaze.com/prod.html?idp_=1",
				"https://www.demoblaze.com/prod.html?idp_=2",
				"https://www.demoblaze.com/prod.html?idp_=3",
				"https://www.demoblaze.com/prod.html?idp_=4",
				"https://www.demoblaze.com/prod.html?idp_=5",
				"https://www.demoblaze.com/prod.html?idp_=6",
				"https://www.demoblaze.com/prod.html?idp_=7"};
		
		
		Random rand = new Random();
		int[] randomNums = rand.ints(0, URLS.length).distinct().limit(3).toArray();

		// Navigate to the randomly selected URLs
		for (int i : randomNums) {
			driver.get(URLS[i]);

			Thread.sleep(3000);
			driver.findElement(By.className("btn-success")).click();
			
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
           
        }

	}
		
		

	@Test(priority=4)	
	public void RANDOMLY_ADD2_LAPTOPS() throws InterruptedException {
		
		driver.get(Homepage);
		
		List<WebElement> Categories = driver.findElements(By.id("itemc"));
		
		Categories.get(1).click();
		
		
Thread.sleep(3000);
		
		
		
		String [] URLS = {"https://www.demoblaze.com/prod.html?idp_=8",
				"https://www.demoblaze.com/prod.html?idp_=9",
				"https://www.demoblaze.com/prod.html?idp_=10",
				"https://www.demoblaze.com/prod.html?idp_=11",
				"https://www.demoblaze.com/prod.html?idp_=12",
				"https://www.demoblaze.com/prod.html?idp_=13",
				"https://www.demoblaze.com/prod.html?idp_=14",
				"https://www.demoblaze.com/prod.html?idp_=15"};
		
		Thread.sleep(3000);
		

		Random rand = new Random();
        int[] randomNums = rand.ints(0, URLS.length).distinct().limit(2).toArray();

        // Navigate to the randomly selected URLs
        for (int i : randomNums) {
            driver.get(URLS[i]);
            
            Thread.sleep(3000);
            driver.findElement(By.className("btn-success")).click();
            
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
        }
	}
	

		
		
	@Test(priority=5)	
	public void RANDOMLY_ADD1_MONITOR() throws InterruptedException {
		
       driver.get(Homepage);
       
		Thread.sleep(3000);
		List<WebElement> Categories = driver.findElements(By.id("itemc"));
		
		Categories.get(2).click();
Thread.sleep(3000);
		
		
		
		String [] URLS = {"https://www.demoblaze.com/prod.html?idp_=10",
			
				"https://www.demoblaze.com/prod.html?idp_=11",
				"https://www.demoblaze.com/prod.html?idp_=12",
				"https://www.demoblaze.com/prod.html?idp_=13",
				"https://www.demoblaze.com/prod.html?idp_=14",
				"https://www.demoblaze.com/prod.html?idp_=15",};
		
		
		Thread.sleep(3000);


		Random rand = new Random();
        int[] randomNums = rand.ints(0, URLS.length).distinct().limit(1).toArray();

        // Navigate to the randomly selected URLs
        for (int i : randomNums) {
            driver.get(URLS[i]);
            
            Thread.sleep(3000);
            driver.findElement(By.className("btn-success")).click();
            
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
        }
	}
	
	@Test (priority=6)
	public void checkOutProcess() throws InterruptedException, IOException {
		
		
		driver.navigate().to("https://www.demoblaze.com/index.html");
		Thread.sleep(5000);
		WebElement CartButton = driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a"));
		CartButton.click();
		Thread.sleep(2000);
		
		WebElement placeHolderButton = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
		placeHolderButton.click();
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		name.sendKeys("Eman");
		Thread.sleep(3000);

		WebElement country =driver.findElement(By.xpath("//*[@id=\"country\"]"));
		country.sendKeys("Jordan");
		Thread.sleep(3000);

		WebElement city =driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("Amman");
		Thread.sleep(3000);

		WebElement creditCard =driver.findElement(By.xpath("//*[@id=\"card\"]"));
		creditCard.sendKeys("51515154321");
		Thread.sleep(3000);

		

		WebElement month =driver.findElement(By.xpath("//*[@id=\"month\"]"));
		month.sendKeys("5");
		Thread.sleep(3000);
		
		WebElement year =driver.findElement(By.xpath("//*[@id=\"year\"]"));
		year.sendKeys("2000");
		Thread.sleep(3000);

		WebElement purchase = driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
		purchase.click();
		Thread.sleep(3000);

		// set the date to the screenshot
			Date date=new Date();
			String updateDate = date.toString();
			String fixedDate = updateDate.replace(":", "-");
			
	     // take screenShot after each addTocart process
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(".//" + fixedDate + ".png");
			FileUtils.copyFile(SrcFile, DestFile);
		
		WebElement AcceptButton = driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button"));
		AcceptButton.click();
		Thread.sleep(3000);
		
		
	}
	
	@AfterTest
      public void AfterTest() {
		
	}
	

}
