package com.cydeo.tests.day3_;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_NextBaseCRM_locators_getText_atribute {
    public static void main(String[] args) {

       // TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
       // 1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

      //  2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

       // 3- Verify “remember me” label text is as expected:
       // Expected: Remember me on this computer
        WebElement rememberMeLabel=driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememeberMeLabel="Remember me on this computer";
        String actualRememberMeLabel=rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememeberMeLabel)){
            System.out.println("Label verification PASSED!!");
        }else{
            System.out.println("Label verification FAİLED!!");
        }


       // 4- Verify “forgot password” link text is as expected:
       // Expected: Forgot your password?
        WebElement forgotPasswordLink=driver.findElement(By.className("login-link-forgot-pass"));

        String expectedforgotPasswordLink="FORGOT YOUR PASSWORD?";
        String actualforgotPasswordLink=forgotPasswordLink.getText();

        if (actualforgotPasswordLink.equals(expectedforgotPasswordLink)){
            System.out.println("Forgot password link verification PASSED");
        }else{
            System.out.println("actualforgotPasswordLink = " + actualforgotPasswordLink);
            System.out.println("expectedforgotPasswordLink = " + expectedforgotPasswordLink);
            System.out.println("Forgot password link verification FAİLED");
        }

       // 5- Verify “forgot password” href attribute’s value contains expected:
       // Expected: forgot_password=yes
        String expectedHref="forgot_password=yes";
        String actualHrefAttributeValue=forgotPasswordLink.getAttribute("href");
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if (actualHrefAttributeValue.equals(expectedHref)){
            System.out.println("HREF attribute value verification PASSED");
        }else {
            System.out.println("HREF attribute value verification FAİLED");
        }


       // PS: Inspect and decide which locator you should be using to locate we

    }
}
