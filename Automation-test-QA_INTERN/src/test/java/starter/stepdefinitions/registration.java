package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.HomePage;

public class registration {
    HomePage homePage;
    @Given("i access the web")
    public void iAccessTheWeb() {
        homePage.openUrl("https://rahulshettyacademy.com/angularpractice/");
    }

    @When("i input {string} and {string} and {string}")
    public void iInputAndAnd(String username, String email, String password) {
        homePage.inputFieldName(username);
        homePage.inputFieldEmail(email);
        homePage.inputPassword(password);
    }
    @And("i check the checkbox and choose my gender")
    public void iCheckTheCheckboxAndChooseMyGender() {
        homePage.clickCheckBox();
        homePage.selectDropdownForGender();
    }


    @And("i choose my employment status")
    public void iChooseMyEmploymentStatus() {
        homePage.clickEmploymentStatus();
    }

    @And("i choose my birthday {string}")
    public void iChooseMyBirthday(String birthday) {
        homePage.inputDate(birthday);
    }

    @Then("i click submit button and get my {string}")
    public void iClickSubmitButtonAndGetMy(String result) {
        homePage.clickSubmitButton();
        homePage.validateResult(result);
    }



}
