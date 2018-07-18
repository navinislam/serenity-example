package common.pageobject.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage  extends PageObject{
    @FindBy(partialLinkText="login-button")
    WebElementFacade loginButton;




    /*
            SELECTORS
         */
    private static final String PRINTED_SUMMER_DRESS= "css: #center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.first-item-of-tablet-line.last-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img";

    /*
        ACTIONS
     */



    public void clickOnDress(){
        $(PRINTED_SUMMER_DRESS).click();



    }
}
