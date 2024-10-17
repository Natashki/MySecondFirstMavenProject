import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VkusVillTest {

    @Test
    public void testPlaceholderInDropdownSelect(){
        ChromeDriver  driver2 = new ChromeDriver();
        driver2.get("https://vkusvill.ru/");

        WebElement search = driver2.findElement(By.cssSelector(".HeaderSearchBlock__Input.js-vv21-search__search-input.js-search-autotyping"));

        search.sendKeys("Сыр");

        WebElement searchButton = driver2.findElement(By.cssSelector(".HeaderSearchBlock__BtnSearchImg.js-vv21-seacrh__icon-btn"));
        searchButton.click();

        driver2.quit();
    }
}
