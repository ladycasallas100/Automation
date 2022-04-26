package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SearchPage;

public class Search implements Task {
    public static Performable the(String shoes) {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(Enter.theValue("shoes").into(SearchPage.SEARCH),
        Click.on(SearchPage.BUTTON_SEARCH),
        Click.on(SearchPage.CHECK));
    }
}
