package handlingWebdriverfromJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\\\java\\\\drivers for automation\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx");
driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']")).sendKeys("Tester");
driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']")).sendKeys("test");
driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']")).click();
System.out.println("Login succesful");
	}

}
