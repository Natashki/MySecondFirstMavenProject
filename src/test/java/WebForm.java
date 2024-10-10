import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.FileStore;

public class WebForm {
    private  WebDriver driver;

    By textInput = By.name("my-text");
    By passwordInput = By.name("my-password");
    By textArea = By.name("my-textarea");
    private By dropdownSelect = By.name("my-select");
    By dropdownDatalist = By.cssSelector("input[name='my-datalist']");
    private By button = By.cssSelector("button");
    By disabledInput = By.cssSelector("input[name= 'my-disabled'");

    public WebForm(WebDriver driver) {
        this.driver = driver;
    }

    public  void enterTextToTextInput(String text, By element){
        driver.findElement(element).sendKeys(text);
    }

    public  void clickButton(){
        driver.findElement(button).click();
    }

    public String getPlaceholder(By element){
       return driver.findElement(element).getAttribute("placeholder");
    }
}
