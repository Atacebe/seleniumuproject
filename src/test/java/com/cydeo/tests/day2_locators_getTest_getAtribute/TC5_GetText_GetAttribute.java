package com.cydeo.tests.day2_locators_getTest_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_GetText_GetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");
         //Verify header text is as expected:
        WebElement headerText=driver.findElement(By.tagName("h2"));
        //Expected: Registration form
        //String expectedHeaderText=headerText.getText();

        String expectedHeaderText="Registration form";
        String actualHeaderText=headerText.getText(); //will return "Header as String
        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification PASSED!!");
        }else{
            System.out.println("Header text verification FAİLED!!");
        }

        System.out.println("expectedHeaderText = " + expectedHeaderText);

        //locate "first name" input box
        //we are locating the web element using "name" locator
        //name attribute has "firstname" value
        WebElement firstNameInput=driver.findElement(By.name("firstname"));
        WebElement classaName=driver.findElement(By.className("form-control"));
        System.out.println("className = " + classaName);
        //verfy placeHolder attribute's value is as expected
        String expectedPlaceHolder="first name";
        String actualPlaceHolder=firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Place holder text verification PASSED!!");
        }else{
            System.out.println("Place holder text verification FAİLED!!");
        }
        driver.close();


    }
}
