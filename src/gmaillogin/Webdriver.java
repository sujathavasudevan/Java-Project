package gmaillogin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sujeesh\\Desktop\\Testing\\Driver\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();

    driver.get("https://www.facebook.com");
    Thread.sleep(2000);
    
    
    WebElement username = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("pass"));
    WebElement Login = driver.findElement(By.id("u_0_v"));
    
    username.sendKeys("sujathacool");
    password.sendKeys("sidash1015");
    Login.click();
    Thread.sleep(2000);
    WebElement navigationclick = driver.findElement(By.id("logoutMenu"));
    WebElement logout = driver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
    navigationclick.click();
    if(logout.isEnabled() && logout.isDisplayed()) {
        logout.click();
    }
    else {
        System.out.println("Element not found");

    
    }

    	
	
	}

}
