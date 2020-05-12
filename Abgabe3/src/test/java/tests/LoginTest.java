package tests;

import org.junit.Before;
import org.junit.Test;
import pages.Login;

public class LoginTest {

    Login login;

    @Before
    public void setup() {
        login = new Login();
    }

    @Test
    public void validLoginTest() {
        login.with("tomsmith", "SuperSecretPassword!");
        //login.with("tomsmithINVALID", "SuperSecretPassword!");
        login.assertValidLogin();
    }
}
