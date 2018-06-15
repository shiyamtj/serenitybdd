package com.shiyamtj.steps.ebay;

import com.shiyamtj.pages.EBayHomePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    EBayHomePage eBayHomePage;

    @Step
    public void open_homepapge() {
        eBayHomePage.open();
        eBayHomePage.getDriver().manage().window().maximize();
    }

    @Step
    public void search_item(String searchtext) {
        eBayHomePage.searchTextBox.type(searchtext);
    }

    @Step
    public void select_category(String category) {
//        eBayHomePage.categoryDropdown.click();
        eBayHomePage.categoryDropdown.selectByVisibleText(category);
    }

    @Step
    public void submit_search() {
        eBayHomePage.searchButton.click();
    }

    @Step
    public void search_item_by_category(String searchtext, String category){
        eBayHomePage.categoryDropdown.selectByVisibleText(category);
        eBayHomePage.searchTextBox.type(searchtext);
        eBayHomePage.searchButton.click();
    }

    @Step
    public String get_category_dropdown_selectedvalue(){
        return eBayHomePage.categoryDropdown.getSelectedVisibleTextValue();
    }

}