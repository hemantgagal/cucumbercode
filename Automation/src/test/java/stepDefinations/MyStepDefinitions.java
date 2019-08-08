package stepDefinations;


//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^user is on landing page$")
    public void user_is_on_landing_page() {
        
    	System.out.println("Login");
    	
   }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2){
        
    	System.out.println(strArg1);
    	System.out.println(strArg2);
            
    }

    @Then("^home page is displayed$")
    public void home_page_is_displayed() {
       System.out.println("HomePage");
    }

    @And("^something is displayed \"([^\"]*)\"$")
    public void something_is_displayed_something(String strArg1){
        
    	System.out.println(strArg1);
    
    }
    }


