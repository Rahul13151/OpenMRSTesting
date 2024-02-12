package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.Login;
import pages.CaptureVitals;

import java.time.Duration;

public class Trial {
    @FindBy(id="referenceapplication-vitals-referenceapplication-vitals-extension")
    WebElement ele;
    @FindBy(id = "patient-search")
    WebElement searchInput;


    @Test
    public void trialTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/coreapps/findpatient/findPatient.page?app=referenceapplication.vitals");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Login obj = new Login(driver);
        obj.enterUserName("Admin");
        obj.enterPassword("Admin123");
        obj.clickOnInpatientWard();
        obj.clickLoginButton();
//
//        ele.click();

        CaptureVitals c = new CaptureVitals(driver);
        c.enterIdInSearchInput("100HM1");
//        Thread.sleep(5000);
        c.selectFirstSearchResult();
        c.confirmPatientIsRight();
        c.enterHeight("145");
    }
}
