package properties;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestRule {
    public static WebDriver driver;

    @Before
    public void beforeCenario(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void afterCenario(){
        driver.close();
    }

    //Método utilizado para retornar o Driver.
    public static WebDriver getDriver(){
        return driver;
    }
}
