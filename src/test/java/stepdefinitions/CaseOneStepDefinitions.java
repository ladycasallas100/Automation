package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.Search;

public class CaseOneStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        }

    @Given("^the user wants to know how many adidas shoes are registered Ebay$")
    public void theUserWantsToKnowHowManyAdidasShoesAreRegisteredEbay() throws Exception {
        OnStage.theActorCalled("Lady").wasAbleTo(OpenUp.thePage());

    }


    @When("^the user filters by (.*) and brand$")
    public void theUserFiltersByShoesAndBrand(String shoes) throws Exception {
OnStage.theActorInTheSpotlight().attemptsTo(Search.the(shoes));

    }

    @Then("^the result must be greater than (.*)$")
    public void theResultMustBeGreaterThanTwoThousand(String question) throws Exception {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
