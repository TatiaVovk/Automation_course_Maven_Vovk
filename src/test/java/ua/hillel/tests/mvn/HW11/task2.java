package ua.hillel.tests.mvn.HW11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class task2 {
    @Test(dataProvider = "params", dependsOnMethods = "ua.hillel.tests.mvn.HW11.LoginTest")
    public void noName(String name, String password, String role) {
        System.out.println("test pass");

    }

    @DataProvider(name = "params")
    public Object[][] getParams() {
        Object[][] results = {
                {"KhanTeSon", "pass1", "employee"},
                {"SonBu", "pass2", "bisnesadmin"},
                {"OJunSol", "pass3", "manager"},
//              {"ChanGu", "pass4"}
        };
        return results;
    }
}

