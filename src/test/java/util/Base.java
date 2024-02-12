package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base {

    WebDriver driver;
    WebDriverWait wait;

    public WebDriver initializeDriver() {
        if (driver == null) {
            if (ProjectConfig.browser.equals("Chrome")) {
                driver = new ChromeDriver();
            } else if (ProjectConfig.browser.equals("Firefox")) {
                driver = new FirefoxDriver();
            }else if (ProjectConfig.browser.equals("Edge")) {
                driver = new EdgeDriver();
            }
        }
        return driver;
    }
    public void waitForVisibilityOfElement(WebElement ele){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
}
