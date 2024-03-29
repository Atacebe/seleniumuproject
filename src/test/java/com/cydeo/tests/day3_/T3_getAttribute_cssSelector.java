package com.cydeo.tests.day3_;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
       //Expected: Log

        //WebElement signInButton=driver.findElement(By.className("login-btn"));

        // LOCATİON THE WEB ELEMENT USİNG DİFFERENT ATTRİBUTE VALUES
        // tagName yani input// input[class='login-btn']
        // LOCATED USİNG CLASS ATTRİBUTE
        //tagName[attribute='value'  === input[class='login-btn'] thats mean
       // WebElement signInButton=driver.findElement(By.cssSelector("input[class='login-btn']"));
        // input[type='submit']
        //LOCATED USİNG VALUE
        //WebElement signInButton=driver.findElement(By.cssSelector("input[type='submit'"));
        //input[onclick="BX.addClass(this, 'wait'
        WebElement signInButton=driver.findElement(By.cssSelector("input[value='Log In'"));
        System.out.println("signInButton = " + signInButton);

        String expectedButtonText="Log In";

        String actualButtonText= signInButton.getAttribute("value");
        System.out.println("actualButtonText = " + actualButtonText);
        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification passed!");
        }else{
            System.out.println("Log In button text verification failed");
        }

    }
}
