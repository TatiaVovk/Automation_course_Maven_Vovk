package ua.hillel.tests.mvn.HW11;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class task3 {
    @Parameters({"url", "browser"})
    public void method1(String url, String browser) {
        System.out.println(url);
        System.out.println(browser);

    }
}
