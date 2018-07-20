package common.pageobject.steps;

import common.pageobject.pages.ProductPage;
import common.pageobject.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import common.pageobject.pages.Homepage;
import org.assertj.core.api.SoftAssertionClassAssert;
import org.assertj.core.api.SoftAssertions;

public class StepLibrary {

    SoftAssertions softly= new SoftAssertions();

    public Homepage homepage;
    public SearchPage searchPage;
    public ProductPage productPage;

    @Step("Opens Site")
    public void openSite() {
        homepage.open();
    }


    /**
     * Searches for items and makes sure that results is >0
     *
     *
     */

    @Step("User searches for Printed Dress")
    public void searchForItem(String item){
        homepage.searchItem(item);
        softly.assertThat(searchPage.checkResultsExist()).isTrue();
        softly.assertAll();

    }

    /**
     * clicks on chiffon dress
     *
     */

    @Step("User clicks on Printed Chiffon Dress")
    public void clickOnChiffonDress(){
        searchPage.clickOnDress();

    }


    /**
     * User selects given size
     * Makes sure that correct size is selected
     *
     */

    @Step("User selects a size")
    public void selectsSizeOf(String item,String size){
        openSite();
        searchForItem(item);
        clickOnChiffonDress();
        productPage.selectASize(size);
        softly.assertThat(productPage.getSelectedSize()).isEqualTo(size);

    }


    /**
     * Increases quantity and adds to cart
     * Makes sure that correct number of items is in cart
     */
    @Step("User adds to Quantity and adds to cart")
    public void increaseQuantityAndAddToCart(int quantity){

        for (int j =1; j<quantity; j++){
            productPage.addToQuantity();
        }
        productPage.addToCart();
        softly.assertThat(productPage.getCartText()).isEqualTo
                ("There are "+ String.valueOf(quantity) + " items in your cart");


    }





    }
