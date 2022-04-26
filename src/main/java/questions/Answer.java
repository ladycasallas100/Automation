package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchPage;

public class Answer implements Question<Boolean>{
    private String question;
    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        Double totalShoes = Text.of(SearchPage.TOTAL).viewedBy(actor).asDouble();
        System.out.println("TOTAL DE ZAPATOS");
        System.out.println(totalShoes);
        if(question.equals(totalShoes)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

}
