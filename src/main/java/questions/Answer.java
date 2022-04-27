package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchPage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String numbStr = Text.of(SearchPage.TOTAL).viewedBy(actor).asString();
        float totalShoes = Float.parseFloat(numbStr.replaceAll("\\.", ""));
        if (totalShoes > Float.parseFloat(question)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

}
