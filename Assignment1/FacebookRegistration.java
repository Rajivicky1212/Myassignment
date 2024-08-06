package Assignment1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//IMPLICIT WAIT
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://en-gb.facebook.com");

//TO CREATE NEW BUTTON
driver.findElement(By.linkText("Create new account")).click();

//TO PRINT FIRST NAME
driver.findElement(By.name("firstname")).sendKeys("Rajalakshmi");

//TO PRINT last NAME
driver.findElement(By.name("lastname")).sendKeys("Anbazhagan");


//TO PRINT THE EMAIL ID OR MOBILE NUMBER
driver.findElement(By.name("reg_email__")).sendKeys("rajivicky1212@gmail.com");

//TO REPRINT EMAIL ID OR MOBILE NO
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("rajivicky1212@gmail.com");

//TO PRINT NEW PASSWORD
driver.findElement(By.id("password_step_input")).sendKeys("raji9933@");

WebElement dd=driver.findElement(By.id("day"));
WebElement mon=driver.findElement(By.id("month"));
WebElement yr=driver.findElement(By.id("year"));

Select dateDropdown=new Select(dd);
Select monthDropdown=new Select(mon);
Select yearDropdown=new Select(yr);

dateDropdown.selectByVisibleText("12");
monthDropdown.selectByVisibleText("Dec");

yearDropdown.selectByVisibleText("1991");

//TO SELECT GENDER
driver.findElement(By.xpath("//input[@type=\"radio\"and@value='1']")).click();





	}

}
