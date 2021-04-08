import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class testFirst {

    WebDriver driver;

    @Test
    public void ParallelTest_1() throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver");
        ChromeOptions options = new ChromeOptions();
        // options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--headless");
        options.addArguments("window-size=1200,600");
        options.addArguments("--disable-extensions"); // disdemoabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox");
        driver = new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/");

    WebElement logo= driver.findElement(By.xpath("//*[@id=\'divLogo\']/img"));
    Assert.assertEquals(logo.isDisplayed(), true);
    Thread.sleep(2000);
        System.out.println("This test case is working fine");
 }

   @Test
   public void ParallelTest_2() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","./src/parallelTest/chromedriver");
       driver.get("https://opensource-demo.orangehrmlive.com/");

       Assert.assertEquals(driver.getTitle(), "OrangeHRM");
       Thread.sleep(3000);

   }

//     @AfterClass
//     public void tearDown(){

//         driver.quit();
//     }
}
