package com.shiyamtj.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.ebay.com/")
public class EBayHomePage extends PageObject {
    @FindBy(id = "gh-cat")
    public WebElementFacade categoryDropdown;

    @FindBy(id = "gh-ac")
    public WebElementFacade searchTextBox;

    @FindBy(id = "gh-btn")
    public WebElementFacade searchButton;

//    public void select_category(String keyword) {
//        categoryDropdown.selectByVisibleText(keyword);
//    }
//
//    public void enter_text(String keyword){
//        searchTextBox.type(keyword);
//    }
//
//    public void search_item(String keyword){
//        enter_text(keyword);
//        searchButton.click();
//    }
//
//    public void search_item(String keyword, String category){
//        select_category(category);
//        enter_text(keyword);
//        searchButton.click();
//    }

}
