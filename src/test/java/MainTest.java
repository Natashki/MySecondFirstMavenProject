import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static school.redrover.HW11.MethodsMath.plus;

public class MainTest {

    @Test
    public void FirstTest(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        String text = driver.getTitle();
        System.out.println(text);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Selenium");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        String message1 = message.getText();
        System.out.println(message1);

        driver.quit();
    }

    @Test
    public void SecondTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebForm WebForm = new WebForm(driver);
//        WebForm.enterTextToTextInput("Selenium");
//        WebForm.clickButton();
//        System.out.println(WebForm.getPlaceholder());
    }
}
