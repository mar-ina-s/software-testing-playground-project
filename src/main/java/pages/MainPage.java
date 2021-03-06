package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Web Elements
    private WebElement getFormsElement() {
        return driver.findElement(By.xpath("//h5[text()='Forms']"));
    }

    // Methods for Web Element manipulation
    public void clickOnFormsElement() {
        getFormsElement().click();
    }
}
