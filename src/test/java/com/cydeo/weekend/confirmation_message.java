package com.cydeo.weekend;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class confirmation_message {
    public static void main(String[] args) {
        //to verify exoected Vs actual
        //expected: documentation(SRS)
        //actual: UI testing from the front end (web page)
        //WebElelement: these are elements that we need to interact
        //find the element(lokators
        //--findElement(By.different locator sytax)
        //apply an action(click,sending sth, select them, enter... etc...)
// selenium Library method
        //get : url, void method--opens
        //findElement() : locator--
        //getTitle(): no parameter
        //getText():no parameter
        //Click():no parameter

        //Analysis should include:
        // do I have to provide parameter?
        //2. what does the method return to me ?

        //8 Locators:
        //6 of them already comes in the attribute
        //--id:unique, dynamic(chancing)
        //---name:duplicate (usually to more than one element)
        //--className: duplicate and can not be used if there is space
        //--tagName
        //--LinkText/PartialLinkText: Links which have "a" anchor tag and href attribute
        //2 of them(xpath/css) custom locators

       // Verify confirmation message
       // open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome"); // open the browser
        //maximize your page
        driver.manage().window().maximize();

       // go to https://practice.cydeo.com/forgot_password // to navigate
        driver.get("https://practice.cydeo.com/");


        // then ckick on "forgot_password" Link
        /*
        2 ways of using webElements : long way or lazy way
         */
        //long way:
        WebElement forgotPasswordLink= driver.findElement(By.linkText("Forgot Password"));
        forgotPasswordLink.click();
       // enter any email
        WebElement emailBox=driver.findElement(By.name("email"));
       // emailBox.sendKeys("nike.smith@garbage.com");

        String expectedEmail="nike.smith@garbage.com";
        emailBox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
        //
        //String actualEmail=emailBox.getText();// lets see if it work

        String actualEmail=emailBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);
        System.out.println("expectedEmail = " + expectedEmail);
        //verify test
        if (actualEmail.equals(expectedEmail)){
            System.out.println("pass email verification");
        }else{
            System.out.println("failed email verification");
        }

        //click on Retrieve password
        //verify that confirmation message says 'Your e-mail's been sent!'
    }
}
