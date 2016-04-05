

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class DownloadFileFromGithub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ActualTitle= null;
		String expectedTitle= null;

		FirefoxProfile pro = new FirefoxProfile();  
		pro.setPreference("browser.download.folderList", 0);
		pro.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		WebDriver driver= new FirefoxDriver(pro);
		driver.manage().window().maximize();
		
		//GitHub.com
		driver.get("http://www.github.com");
		expectedTitle = "How people build software · GitHub";
		ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if (expectedTitle.equals(ActualTitle)){
			System.out.println("github.com page opened.Test pass");
		}
		else{
			System.out.println("github.com page is not displayed. Test fail");
		}
		
		//Clicking on Sign-in
		driver.findElement(By.xpath("html/body/header/div/div/div/a[2]")).click();
		expectedTitle = "Sign in to GitHub · GitHub";
		ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if (expectedTitle.equals(ActualTitle)){
			System.out.println("Signin option is found and click operation is performed.Test pass");
		}
		else{
			System.out.println("Signin option is not found.Test fail");
		}
		//Identifying Username field and sending keys
		driver.findElement(By.xpath(".//*[@id='login_field']")).sendKeys("moolamdeepthi");
		System.out.println("Username field is found ");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("deepthim333");
		System.out.println("Password field is found ");
		// Clicking on Signin 
		driver.findElement(By.xpath(".//*[@id='login']/form/div[4]/input[3]")).click();
		expectedTitle = "GitHub";
		ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if (expectedTitle.equals(ActualTitle)){
			System.out.println("Signin option is found and click operation is performed,User home page opened.Test status is pass");
		}
		else{
			System.out.println("Signin option is not found.Test status is fail");
		}
		
		// Selecting Onlinebooking Repository
		driver.findElement(By.xpath(".//*[@id='repo_listing']/li[4]/a")).click();
		expectedTitle = "moolamdeepthi/Onlinebooking: Filling data in the BookFlight";
		ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if (expectedTitle.equals(ActualTitle)){
			System.out.println("Onelinebooking repository page is opened.Test status is pass");
		}
		else{
			System.out.println("Onlinebooking repository not found.Test status is fail");
		}
		
		//Downloading Onlinebooking Repository 
		driver.findElement(By.linkText("Download ZIP")).click();
		
			System.out.println("Download ZIP option found. Test status is pass");
			
			//added///
		
	}

}
