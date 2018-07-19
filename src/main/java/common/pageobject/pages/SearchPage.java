package common.pageobject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage  extends PageObject{
    @FindBy(partialLinkText="login-button")
    WebElementFacade loginButton;




    /*
            SELECTORS
         */
    private static final String PRINTED_CHIFFON_DRESS= "css: a.product-name[title='Printed Chiffon Dress'] ";
    private static final String PRODUCTS= "css: a.product-name";
    /*
        ACTIONS
     */




    public void clickOnDress(){
        $(PRINTED_CHIFFON_DRESS).click();

    }

    public boolean checkResultsExist(){

        List<WebElement> myElements = getDriver().findElements(By.cssSelector("a.product-name"));

        if(myElements.size()>0){
            return true;
        }
        else {
            return false;
        }
    }


}
