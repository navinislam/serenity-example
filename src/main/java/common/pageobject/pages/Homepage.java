package common.pageobject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class Homepage extends PageObject {


    @FindBy(className="login-button")
    WebElementFacade loginButton;




    /*
            SELECTORS
         */
    private static final String SEARCH_BAR = "id:search_query_top";
    private static final String SUBMIT_SEARCH = "name:submit_search";


    /*
        ACTIONS
     */



    public void searchItem(String item){
        $(SEARCH_BAR).sendKeys(item);
        $(SUBMIT_SEARCH).click();



    }
}
