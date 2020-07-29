package TestCases;

import PageFactory.SignUp_Address;
import PageFactory.SignUp_Personal;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignUp_Personal_Test extends TestBase{
    PageFactory.SignUp_Personal SignUpPersonal;
    SignUp_Address SignUpAddress;

    @Test
    public void SignUpPersonalSuccessfully() throws InterruptedException {
        SignUpPersonal = new PageFactory.SignUp_Personal(driver);

        //Input information
        SignUpPersonal.tellUsAboutYourSelf("Test",
                "Test",
                "test20201@gmail.com",
                "June",
                "10",
                "2000",
                "Arabic");

        //Verify Step 2 is displayed
        SignUpAddress = new SignUp_Address(driver);
        Assert.assertNotNull(SignUpAddress.getTextStep2());
    }
}
