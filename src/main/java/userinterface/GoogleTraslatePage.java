package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTraslatePage {
	
	public static final Target LANGUAGE_TWO = Target.the("Language two").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");
	
	public static final Target SELECT_SPANISH = Target.the("Select Spanish").located(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div[2]/div[2]/div/div[2]/div[30]/div[2]"));

	public static final Target LANGUAGE_ONE = Target.the("language one").locatedBy("//div[@class='sl-more tlid-open-source-language-list']");
	
	public static final Target SELECT_ENGLISH = Target.the("Select English").located(By.xpath("/html/body/div[2]/div[2]/div[4]/div/div[2]/div[1]/div[2]/div/div[3]/div[50]/div[2] "));
	
	public static final Target TYPEWORD= Target.the("Tipiar Palabra").located(By.id("source"));
	
	

}
