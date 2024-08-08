package driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StartBrowser {

    public static WebDriver driver;

    public static void driver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeDriver() {
        getDriver().quit();
    }

    public void tirarScreenShot(String nomeEvidencia) {
        try {
            TakesScreenshot scrShot = (TakesScreenshot) driver;
            File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
            FileUtils.copyFile(scrFile, destFile);
        } catch (Exception e) {
            System.err.println("---------- ERRO ao tirar foto ------------");
        }
    }

//    public void esperarElemento(By elemento) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
//        } catch (Exception e) {
//            System.err.println("---------- ERRO ao esperar elemento: " + e.getMessage() + " ------------");
//        }
//    }
}
