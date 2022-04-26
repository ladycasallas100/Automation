package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;

public class CaseOneStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        }

    @Given("^the user wants to know how many adidas shoes are registered Ebay$")
    public void theUserWantsToKnowHowManyAdidasShoesAreRegisteredEbay() throws Exception {
        OnStage.theActorCalled("Lady").wasAbleTo(OpenUp.thePage());

    }


    @When("^the user filters by shoes and brand$")
    public void theUserFiltersByShoesAndBrand() throws Exception {

    }

    @Then("^the result must be greater than two thousand$")
    public void theResultMustBeGreaterThanTwoThousand() throws Exception {

    }
}
