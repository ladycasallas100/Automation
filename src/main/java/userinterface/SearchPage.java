package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {
    public static final Target SEARCH = Target.the("search bar").located(By.id("gh-ac"));
    public static final Target BUTTON_SEARCH = Target.the("button").located(By.id("gh-btn"));
    public static final Target CHECK = Target.the("check").located(By.xpath("//*[@name='Brand'][1]"));
    public static final Target TOTAL = Target.the("total").located(By.xpath("/html[1]/body[1]/div[5]/div[6]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]/span[1]"));
}
