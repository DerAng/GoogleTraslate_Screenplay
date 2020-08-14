package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleAssert {
	
	
	public final static Target TEACHER = Target.the("Name Teacher").locatedBy("//span[contains(@class,'tlid-translation translation') and contains(text(), 'Profesora')]");

}
