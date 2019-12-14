package com.j4mt.webaut.test.expedia.testrunner;

import com.j4mt.webaut.test.expedia.pageobjects.ExpediaPageObj;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.yandex.qatools.allure.annotations.Attachment;

import static com.codeborne.selenide.Selenide.open;

public class Steps {

    @Given("^I am on expedia com page$")
    public void i_am_on_expedia_com_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        open(ExpediaPageObj.URL);
    }

    @Given("^I click flights$")
    public void i_click_flights() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter origin London$")
    public void i_enter_origin_London() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter destination London$")
    public void i_enter_destination_London() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter from date today$")
    public void i_enter_from_date_today() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter to date (\\d+)$")
    public void i_enter_to_date(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click num of passengers (\\d+) (\\d+) (\\d+)$")
    public void i_click_num_of_passengers(int arg1, int arg2, int arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click search$")
    public void i_click_search() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the flight cost is verified in the first row$")
    public void the_flight_cost_is_verified_in_the_first_row() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Attachment()
    private byte[] createAttachment(String att) {
        String content = att;
        return content.getBytes();
    }

}
