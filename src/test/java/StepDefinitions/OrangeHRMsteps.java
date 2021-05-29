package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMsteps {

    WebDriver driver;

    @Given("I launch the chrome browser")
    public void i_launch_the_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C://selenium jars and drivers/drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("I open the OrangeHRM home page")
    public void i_open_the_orange_hrm_home_page() {

        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @Then("I verify that the logo is present on the page")
    public void i_verify_that_the_logo_is_present_on_the_page() {

       boolean status= driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @And("close the browser")
    public void close_the_browser() {
     driver.quit();
    }

}
