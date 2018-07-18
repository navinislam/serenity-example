import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import common.pageobject.steps.StepLibrary;

@RunWith(SerenityRunner.class)

public class TC1 {

    @Managed
    WebDriver driver;

    @Steps
    StepLibrary navin;

    @Test
    public void userCanSearchForItem(){
        navin.openSite();
        navin.searchForItem("Printed Dress");

    }

    @Test
    public void userCanChooseDress(){
        navin.openSite();
        navin.searchForItem("Printed Dress");
        navin.clickOnChiffonDress();
    }
}
