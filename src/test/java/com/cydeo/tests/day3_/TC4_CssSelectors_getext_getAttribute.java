package com.cydeo.tests.day3_;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_CssSelectors_getext_getAttribute {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
       // 2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
       // 3- Verify “Reset password” button text is as expected:

       // Expected: Reset password
        //  WebElement resetPasswordButoon=driver.findElement(By.cssSelector("button[class='login-btn']"));

        //locating reset pasword button using VALUE attribute and its value

        WebElement resetPasswordButton=driver.findElement(By.cssSelector("button[value='Reset password']"));
        System.out.println("resetPasswordButton = " + resetPasswordButton);

        String expectedResetPasswordButton="Reset password";
        String actualResetPasswordButton=resetPasswordButton.getText();
        if (actualResetPasswordButton.equals(expectedResetPasswordButton)){
            System.out.println("Reset password button text verification passed!");
        }else{
            System.out.println("Reset password button text verification failed");
        }

    }
}
