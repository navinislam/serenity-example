package common.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;

public class ProductPage extends PageObject {




    /*
           SELECTORS
        */
    private static final String SIZE_DROP_DOWN = "css: select#group_1.form-control.attribute_select.no-print";

    private static final String SELECTED_SIZE = "css: #uniform-group_1 > span";
    /*
        ACTIONS
     */


    public void selectASize(String size){
        $(SIZE_DROP_DOWN).selectByVisibleText(size);
    }

    public  String getSelectedSize() {
        return $(SELECTED_SIZE).getText();
    }
}
