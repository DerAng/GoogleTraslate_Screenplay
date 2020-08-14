package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("google apps button").located(By.id("gbwa"));
	
	public static final Target GOOGLE_TRASLATE = Target.the("google traslate option").located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[12]/a/div/span"));
	

}
