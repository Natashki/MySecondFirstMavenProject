import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class WebFromTest {
    WebDriver driver;
    WebForm WebForm;
    SuccessForm SuccessForm;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebForm = new WebForm(driver);
        SuccessForm = new SuccessForm(driver);
    }

    @Test
    public void testPlaceholderInDropdownSelect(){
        Assert.assertEquals(WebForm.getPlaceholder(WebForm.dropdownDatalist), "Type to search...");
    }

    @Test
    public void testPlaceholderInDisabledInput(){
        Assert.assertEquals(WebForm.getPlaceholder(WebForm.disabledInput), "Disabled input");
    }

    @Test
    public void sendFormWithFullOfFields(){
        WebForm.enterTextToTextInput("Selenium", WebForm.textInput);
        WebForm.enterTextToTextInput("1234", WebForm.passwordInput);
        WebForm.enterTextToTextInput("Hello world!", WebForm.textArea);
        WebForm.clickButton();
        Assert.assertEquals(SuccessForm.getText(SuccessForm.h1), "Form submitted");
        Assert.assertEquals(SuccessForm.getText(SuccessForm.message), "Received!");
    }

    @AfterMethod
    public void quitDriver(){
        if(driver != null){
            driver.quit();
        }
    }
}
