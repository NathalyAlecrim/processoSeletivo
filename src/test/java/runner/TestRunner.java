package runner;

import driver.StartBrowser;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {""},
        tags = " @CriarNovoUsuario"
)
public class TestRunner {
    @BeforeClass
    public static void antes() {
        StartBrowser.driver();
    }

    @AfterClass
    public static void depois() {
        StartBrowser.closeDriver();
    }
}
