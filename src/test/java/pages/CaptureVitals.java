package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class CaptureVitals {
    WebDriver driver;
    @FindBy(id="patient-search")
    WebElement patientSearchInputBox;
    @FindBy(xpath="//*[@class='odd'][1]/td[1]")
    WebElement firstElementId;
    @FindBy(css = ".odd")
    WebElement firstSearchResult;
    @FindBy (id = "coreapps-vitals-confirm")
    WebElement confirmPatientIsRightButton;
    @FindBy(id = "w8")
    WebElement heightInputBox;
    @FindBy(id = "w10")
    WebElement weightInputBox;
    @FindBy(id="next-button")
    WebElement nextButton;
    @FindBy(id="prev-button")
    WebElement prevButton;
    @FindBy(id="w12")
    WebElement temperatureInputBox;
    @FindBy(id="w14")
    WebElement pulseInputBox;
    @FindBy(id="w16")
    WebElement respiratoryRateInputBox;
    @FindBy(id="w18")
    WebElement bloodPressureInputBox1;
    @FindBy(id="w20")
    WebElement bloodPressureInputBox2;

    @FindBy(id="w22")
    WebElement bloodOxygenInputBox;
    @FindBy(css = ".confirm.right.focused")
    WebElement saveButton;
    WebDriverWait wait;
    public CaptureVitals(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void enterIdInSearchInput(String id){
        patientSearchInputBox.sendKeys(id);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        System.out.println(firstElementId.getText());
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@class='odd'][1]/td[1]"),id + "Recent"));
    }
    public void enterNameInSearchInput(String name){
        patientSearchInputBox.sendKeys(name);

    }
    public void selectFirstSearchResult(){

        firstSearchResult.click();
    }
    public void confirmPatientIsRight(){
        confirmPatientIsRightButton.click();
    }
    public void enterHeight(String height){
        heightInputBox.sendKeys(height);
        nextButton.click();

    }
    public void enterWeight(String Weight){
        weightInputBox.sendKeys(Weight);
        nextButton.click();
        nextButton.click();
    }
    public void enterTemperature(String height){
        temperatureInputBox.sendKeys(height);
        nextButton.click();
    }
    public void enterPulse(String pulse){
        pulseInputBox.sendKeys(pulse);
        nextButton.click();
    }
    public void enterRespiratoryRate(String respiratoryRate){
        respiratoryRateInputBox.sendKeys(respiratoryRate);
        nextButton.click();
    }
    public void enterRespiratoryRate(String respiratoryRate){
        respiratoryRateInputBox.sendKeys(respiratoryRate);
        nextButton.click();
    }
    public void enterBloodPressure(String bloodPressureInput1,String bloodPressureInput2){
        bloodPressureInputBox1.sendKeys(bloodPressureInput1);
        bloodPressureInputBox2.sendKeys(bloodPressureInput2);

    }
    public void enterBloodOxygen(String bloodOxygen){
        bloodOxygenInputBox.sendKeys(bloodOxygen);
    }
    public void enterSaveButton(){
        saveButton.click();
    }

}
