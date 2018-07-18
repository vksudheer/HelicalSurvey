package Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

    @Given("^I have basic setups to run the project$")
    public void openBrowser(){
      System.setProperty("webdriver.chrome.driver","D:\\HelicalSurvey\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      }
     @When("^I navigate into the baseUrl$")
     public void navigateTobaseUrl(){
        driver.navigate().to("https://onlineretail.tagrail.com/v1/");
     }
     @Then("^I will enter invalid user name$")
     public void enterUserName(){

        driver.findElement(By.xpath("/html/body/ngx-app/ngx-app-auth/ngx-auth-layout/nb-layout/div/" +
                "div/div/div/div/nb-layout-column/div/div/" +
                "div[1]/div/div[1]/div/div[2]/" +
                "div/ngx-app-login/div/div[2]/form/div[1]/div/input")).sendKeys("user");
     }
    @Then("^I will enter valid password$")
    public void enterPassword(){
        driver.findElement(By.xpath("/html/body/ngx-app/ngx-app-auth/ngx-auth-layout/nb-layout/div/div/div/div/div/" +
                "nb-layout-column/div/div/div[1]/div/div[1]/div/" +
                "div[2]/div/ngx-app-login/div/div[2]/form/div[2]/div/input")).sendKeys("password");
    }

    @And("^ I will click on the Login button$")
    public void clickOnLogin(){
      driver.findElement(By.xpath("/html/body/ngx-app/ngx-app-auth/ngx-auth-layout/nb-layout/div/div/div/div/div/" +
              "nb-layout-column/div/div/div[1]/div/div[1]/div/div[2]/div/ngx-app-login/div/div[2]/form/div[3]/button[1]")).click();

    }


}
