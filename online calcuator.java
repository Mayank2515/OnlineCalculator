package OnlineCalculator;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnlineCalculator {
 public WebDriver driver1;
 WebDriver driver=new ChromeDriver();
@BeforeTest
public void OpenCalculator()
{
	
	driver.get("https://www.calculator.net/");
}

@AfterTest
public void LogOutFromCalculator()
{
driver.close();	
}
@Test(priority = 1)
public void Multiplication() throws InterruptedException 
{
String expectedResult="222075";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[text()='×']")).click();


Thread.sleep(2000);
driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
String ActualMultiplication = driver.findElement(By.id("sciOutPut")).getText();
System.out.println(ActualMultiplication);
if(ActualMultiplication.contains(expectedResult)) {
	System.out.println("Multiplication test case is Pass");
	}
	else {
	System.out.println("Multiplication test case is Fail");
	}
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='AC']")).click();
Thread.sleep(2000);


}
@Test(priority = 2)
public void Division() throws InterruptedException 
{
String expectedResult="20";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
driver.findElement(By.xpath("//span[text()='/']")).click();


Thread.sleep(2000);
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
String ActualDivision = driver.findElement(By.id("sciOutPut")).getText();
System.out.println(ActualDivision );
if(ActualDivision .contains(expectedResult)) {
	System.out.println("Division test case is Pass");
	}
	else {
	System.out.println("Division test case is Fail");
	}
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='AC']")).click();
Thread.sleep(2000);




}
@Test(priority = 3)
public void Addition() throws InterruptedException 
{
String expectedResult="111111";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//span[text()='–']")).click();
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[text()='+']")).click();


Thread.sleep(2000);
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
String ActualAddition = driver.findElement(By.id("sciOutPut")).getText();
System.out.println( ActualAddition);
if( ActualAddition .contains(expectedResult)) {
	System.out.println("Addition test case is Pass");
	}
	else {
	System.out.println("Addition test case is Fail");
	}
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='AC']")).click();
Thread.sleep(2000);



}
@Test(priority = 4)
public void Substraction() throws InterruptedException 
{
String expectedResult="234823";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
driver.findElement(By.xpath("//span[text()='–']")).click();


Thread.sleep(2000);
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(9)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
String ActualSubstraction = driver.findElement(By.id("sciOutPut")).getText();
System.out.println( ActualSubstraction);
if( ActualSubstraction.contains(expectedResult)) {
	System.out.println("Substraction test case is Pass");
	}
	else {
	System.out.println("Substraction test case is Fail");
	}
}
}


