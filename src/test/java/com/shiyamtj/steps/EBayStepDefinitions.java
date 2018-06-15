package com.shiyamtj.steps;

import com.shiyamtj.steps.ebay.EndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class EBayStepDefinitions {

    @Steps
    EndUserSteps user;

    @Given("^the user is on the ebay home page$")
    public void the_user_is_on_the_ebay_home_page() throws Exception {
        user.open_homepapge();
    }

    @When("^the user select '(.*)' category$")
    public void the_user_select_music_category(String category) throws Exception {
        user.select_category(category);
    }

    @When("^the user search for '(.*)' term$")
    public void the_user_search_for_rihanna_term(String searchtext) throws Exception {
        user.search_item(searchtext);
        user.submit_search();
    }

    @Then("^the user should see items$")
    public void the_user_should_see_items() throws Exception {
        Thread.sleep(1000);
    }

    @Then("^the user searches '(.*)'$")
    public void the_user_searches(String searchtext) throws Exception {
        user.search_item(searchtext);
        user.submit_search();
    }

    @Then("^the user can see '(.*)' selected by default on search category dropdown$")
    public void the_user_should_see_items(String comparetext) throws Exception {
        Assert.assertEquals("Text Compare Failed!!", user.get_category_dropdown_selectedvalue(), comparetext);
    }

    @Then("^the user searches '(.*)' from '(.*)' category$")
    public void the_user_searches_item_category(String searchtext, String category) throws Exception {
        user.search_item_by_category(searchtext, category);
    }

}
