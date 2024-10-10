import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessForm {
    private static WebDriver driver;

    By h1 = By.cssSelector("h1[class = 'display-6']");
    By message = By.id("message");

    public SuccessForm(WebDriver driver) {
        this.driver = driver;
    }

    public String getText(By element){
        return driver.findElement(element).getText();
    }
}
