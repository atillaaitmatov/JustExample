package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class MainPageSteps {

    WebDriver driver;

    @Given("client is on main page")
    public void client_is_on_main_page() {
        System.setProperty("webdriver.chrome.driver","src/test/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @When("client click Honda on radio button")
    public void client_click_honda_on_radio_button() {
        try {
            driver.findElement(By.xpath("//input[@id='hondaradio']")).click();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @And("selects Benz on select options")
    public void selects_benz_on_select_options() {
        try {
            driver.findElement(By.id("carselect")).click();
            driver.findElement(By.xpath("//option[@value='honda']")).click();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @And("selects multiple select options")
    public void selects_multiple_select_options() throws InterruptedException {
        try {
            driver.findElement(By.xpath("//option[@value='peach']")).click();

        }catch (Exception e){
            e.printStackTrace();
        }
        Thread.sleep(1500);
    }
    @Then("^enter (.*) into textBox and click confirm$")
    public void enter_name_into_text_box_and_click_confirm(String name) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(name);
        Thread.sleep(1500);
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(1500);
        driver.close();
    }
}
