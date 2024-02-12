package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "username")
    WebElement userNameInputBox;

    @FindBy(id = "password")
    WebElement passwordInputBox;
    @FindBy(id="Inpatient Ward")
    WebElement inpatientWardButton;
    @FindBy(id="loginButton")
    WebElement loginButton;
    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUserName(String userName){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(userNameInputBox));
        userNameInputBox.sendKeys(userName);
    }
    public void enterPassword(String password){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
        passwordInputBox.sendKeys(password);
    }
    public void clickOnInpatientWard(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(inpatientWardButton));
        inpatientWardButton.click();
    }
    public void clickLoginButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }
}
