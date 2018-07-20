import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import common.pageobject.steps.StepLibrary;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TC1 {

    int quantity = 4;


    @Managed
    WebDriver driver;

    @Steps
    StepLibrary navin;

    @Title("User can search for an item")
    @Test
    public void test01(){
        navin.openSite();
        navin.searchForItem("Printed Dress");

    }

    @Title("User can choose a dress")
    @Test
    public void test02(){
        navin.openSite();
        navin.searchForItem("Printed Dress");
        navin.clickOnChiffonDress();
    }

    @Title("User can select a size, quantity and add to cart")
    @Test
    public void test03(){
        navin.selectsSizeOf("Printed Dress","M");
        navin.increaseQuantityAndAddToCart(quantity);

    }

}
