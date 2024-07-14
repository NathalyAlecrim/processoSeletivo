package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {""},
        tags = "@Login2"
)
public class TestRunner {
    @BeforeClass
    public static void antes() {
    }

    @AfterClass
    public static void depois() {
    }
}
