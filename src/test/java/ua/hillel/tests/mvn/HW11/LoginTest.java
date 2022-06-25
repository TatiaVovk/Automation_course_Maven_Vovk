package ua.hillel.tests.mvn.HW11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
    @Test(dataProvider = "params", priority = 0)
    public void loginTest(String name, String password, String role) {
        System.out.println("Name: " + name + ", Password: " + password + ", Role: " + role);

    }

    @Test(priority = 1)
    public void logIn() {
        System.out.println("Successfully Login!");
    }

    @DataProvider(name = "params")
    public Object[][] getParams() {
        Object[][] results = {
                {"KhanTeSon", "pass1", "employee"},
                {"SonBu", "pass2", "bisnesadmin"},
                {"OJunSol", "pass3", "manager"}
        };
        return results;
    }
}


