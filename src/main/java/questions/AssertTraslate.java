package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.GoogleAssert;

@Subject("the displayed todo items")
public class AssertTraslate implements Question<String> {

	public String answeredBy(Actor actor) {
		return (GoogleAssert.TEACHER).resolveFor(actor).getText();
		
	}
	
	public static Question<String> value() { return new AssertTraslate(); }
	


	



}
