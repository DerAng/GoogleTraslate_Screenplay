package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import interactions.Refresh;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import net.thucydides.core.annotations.Step;
import userinterface.GoogleHomePage;

public class OpenTheBrowser implements Task{

	GoogleHomePage googleHomePage;
    
	@Step("{0} open de browser de Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Open.browserOn().the(googleHomePage), 
				Refresh.theBrowserSession());
		
    
	}
	

	public static OpenTheBrowser on() {
		return instrumented(OpenTheBrowser.class);
		
	}
	
}
