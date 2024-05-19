package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class destinacijaLetaAviokarata {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// //a[@value='MAA'] - Xpath za Chenay
		
		// //a[@value='BLR'] - Xpath za Bengaluru
		
		
	//u slucaju da zelimo da lociramo opciju koja se nalazi u drugoj koloni i da ga Selenijum kao takvu prepozna, u tom slucaju koristimo sledece:
	// (//a[@value='BLR'])[2]  - razlika je u tome sto je sada Xpath u zagradi i ima nastavak [2] koji oznacava da je nas cilj u drugoj grupi
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

	}

}
