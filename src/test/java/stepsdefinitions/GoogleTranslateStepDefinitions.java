package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import net.thucydides.core.annotations.Managed;
import questions.AssertTraslate;
import tasks.GoTo;
import tasks.OpenTheBrowser;
import tasks.TraslateWord;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver= "chrome")
	private WebDriver herbrowser;
	private Actor sam = Actor.named("sam"); 
	
	
	@Before
	public void setUp() {
		sam.can(BrowseTheWeb.with(herbrowser));
		
	}
	
	@Given("^that sam wants to traslate a word$")
	public void thatsamWantsToTraslateAWord() throws Exception {
		
		sam.wasAbleTo(OpenTheBrowser.on());
		
		
	}
	
	@When("^she traslates the word teacher from English to Spanish$")
	public void sheTraslatesTheWordTeacherFromEnglishToSpanish() throws Exception {
		
		sam.attemptsTo(GoTo.theApp());
		sam.attemptsTo(TraslateWord.theApp());
	}
	
	@Then("^she should see the word profesor in the screen$")
	
	public void sheShouldSeeTheWordProfesorInTheScreen() throws Exception {
		
		sam.should(seeThat(AssertTraslate.value(), equalTo("Profesora")));
		
	}


		
	

}
