package step_definitions;

import static org.testng.Assert.assertEquals;

public class login_Essent_wb_steps {
    @cucumber.api.java.en.Given("^Login using a valid username and password$")
    public void loginUsingAValidUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
        assertEquals(1,1);

    }

    @cucumber.api.java.en.Given("^Successfully logged in$")
    public void Successfullyloggedin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(1,1);    }

    @cucumber.api.java.en.Given("^Home page should get displayed$")
    public void Homepageshouldgetdisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(1,1);    }

    @cucumber.api.java.en.Given("^Login using a InValid username and password$")
    public void loginUsingAInValidUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(1,1);    }

    @cucumber.api.java.en.Given("^Should not allow to login$")
    public void Shouldnotallowtologin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(1,1);    }

    @cucumber.api.java.en.Given("^Home page should not get displayed$")
    public void Homepageshouldnotgetdisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(1,1);    }
}
