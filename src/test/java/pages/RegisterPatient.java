package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPatient {
    @FindBy(css="input[name='givenName']")
    WebElement nameInputBox;
    @FindBy(css="input[name='middleName']")
    WebElement middleNameInputBox;
    @FindBy(css="input[name='familyName']")
    WebElement familyNameInputBox;
    @FindBy(id="next-button")
    WebElement nextButton;
    @FindBy(css="option[value='M']")
    WebElement maleGenderButton;
    @FindBy(css="option[value='F']")
    WebElement femaleGenderButton;
    @FindBy(id="birthdateDay-field"){

    }

    public void enterNameDetails(String given,String middle,String family){
        nameInputBox.sendKeys(given);
        middleNameInputBox.sendKeys(middle);
        familyNameInputBox.sendKeys(family);
        nextButton.click();
    }


}
