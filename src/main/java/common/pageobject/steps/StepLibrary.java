package common.pageobject.steps;

import common.pageobject.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import common.pageobject.pages.Homepage;

public class StepLibrary {

    public Homepage homepage;
    public SearchPage searchPage;

    @Step("Opens Site")
    public void openSite() {
        homepage.open();
    }


    @Step("User searches for Printed Dress")
    public void searchForItem(String item){
        homepage.searchItem(item);

    }

    @Step("User clicks on Printed Chiffon Dress")
    public void clickOnChiffonDress(){
        searchPage.clickOnDress();
    }


    }
