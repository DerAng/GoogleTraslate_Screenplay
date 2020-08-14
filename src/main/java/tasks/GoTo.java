package tasks;



import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import userinterface.GoogleAppsComponent;


public class GoTo implements Task {

	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
		actor.attemptsTo(Switch.toFrame(0));
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_TRASLATE));
	}
	
	
	public static GoTo theApp() {
		return instrumented(GoTo.class);
		
	}

}
