package handlingWebdriverfromJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\\\java\\\\drivers for automation\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx");
driver.findElement(By.xpath("//*[@id='ctl00_MainContent_username']")).sendKeys("Tester");
driver.findElement(By.xpath("//*[@id='ctl00_MainContent_password']")).sendKeys("test");
driver.findElement(By.xpath("//*[@id=\'ctl00_MainContent_login_button\']")).click();
driver.findElement(By.xpath("//*[@id=\'ctl00_menu\']/li[1]/a")).click();
/*String prexpath="//*[@id=\'ctl00_MainContent_orderGrid\']/tbody/tr[";
String postxpath="]/td[2]";
for(int i=2;i<=9;i++) {
String name=driver.findElement(By.xpath(prexpath + i + postxpath)).getText();
System.out.println(name);

	}*/
String prexpath="//*[@id=\'ctl00_MainContent_orderGrid\']/tbody/tr[";
String postxpath="]/td[";
String Lastxpath="]";
for(int i=2;i<=12;i++) {
	for(int j=2;j<=12;j++) {
		String namestext=driver.findElement(By.xpath(prexpath + i + postxpath + j + Lastxpath )).getText();
		System.out.println(namestext);
	}
}
	}

}
