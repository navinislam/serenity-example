package common.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;

public class ProductPage extends PageObject {




    /*
           SELECTORS
        */
    private static final String SIZE_DROP_DOWN = "css: select#group_1.form-control.attribute_select.no-print";

    private static final String SELECTED_SIZE = "css: #uniform-group_1 > span";

    private static final String QUANTITY_PLUS= "css:i.icon-plus";

    private static final String ADD_TO_CART = "css: #add_to_cart > button > span";

    private static final String CART_TEXT = "css: span.ajax_cart_product_txt_s.unvisible";
    /*
        ACTIONS
     */


    public void selectASize(String size){
        $(SIZE_DROP_DOWN).selectByVisibleText(size);
    }

    public  String getSelectedSize() {
        return $(SELECTED_SIZE).getText();
    }

    public void addToQuantity(){

        $(QUANTITY_PLUS).click();
    }

    public void addToCart(){
        $(ADD_TO_CART).waitUntilEnabled();
        $(ADD_TO_CART).click();

    }

    public  String getCartText() {
        return $(CART_TEXT).getText();
    }
}
