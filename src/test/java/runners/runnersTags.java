package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

public class runnersTags {

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions (features = "src/test/resources/features/demo.feature",
            tags = "@tag1",
            glue = "stepdefinitions",
            snippets = SnippetType.CAMELCASE )

    public class RunnerTags {
    }
}
