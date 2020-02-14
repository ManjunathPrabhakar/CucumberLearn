package stepdefs.daygames;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DayGames {
    @Given("today is Sunday")
    public void todayIsSunday() {
        System.out.println("DayGames.todayIsSunday");
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        System.out.println("DayGames.iAskWhetherItSFridayYet");
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String arg0) {
        System.out.println("DayGames.iShouldBeTold : " + arg0);
    }

    @Given("today is Friday")
    public void todayIsFriday() {
        System.out.println("DayGames.todayIsFriday");
    }
}
