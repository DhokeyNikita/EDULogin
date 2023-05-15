import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EDULogin {
    static WebDriver driver;

    @Test
    public void f() {
        driver.findElement(By.name("loginName")).sendKeys("T7302");
        driver.findElement(By.name("password")).sendKeys("T7302*abc");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/button")).click();
    }
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikita.dhokey\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://10.82.180.36:8080/EDUBank/tellerLogin");
    }
    @AfterClass
    public void afterClass() {
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
