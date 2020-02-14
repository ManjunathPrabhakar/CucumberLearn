package stepdefs.websearch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleSearch {
    @Given("internet is available")
    public void internetIsAvailable() {
        System.out.println("GoogleSearch.internetIsAvailable");
    }

    @Then("Choose search engine {string}")
    public void chooseSearchEngine(String arg0) {
        System.out.println("GoogleSearch.chooseSearchEngine : " + arg0);
    }

    @And("search a keyword {string}")
    public void searchAKeyword(String arg0) {
        System.out.println("GoogleSearch.searchAKeyword : " + arg0);
    }

    @And("capture some info from its wikipedia")
    public void captureSomeInfoFromItsWikipedia() {
        System.out.println("GoogleSearch.captureSomeInfoFromItsWikipedia");
    }

    @And("Exit")
    public void exit() {
        System.out.println("GoogleSearch.exit");
    }
}
