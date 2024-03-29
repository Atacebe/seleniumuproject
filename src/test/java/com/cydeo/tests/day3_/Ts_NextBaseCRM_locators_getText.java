package com.cydeo.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts_NextBaseCRM_locators_getText {
    public static void main(String[] args) {



        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Enter incorrect username: “incorrect”
       // driver.findElement(By.className("login-inp")).sendKeys("incorrect");//we can be not reusable
        WebElement inputUsername=driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect"); // we can be reusable

        //4- Enter incorrect password: “incorrect”
        // to auto generate local variable
        //window alt+enter
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //WebElement inputPasword=
        //5- Click to login button.
        WebElement loginButton=driver.findElement(By.className("login-btn"));
        loginButton.click();
        //6- Verify error message text is as expected:

        //Expected: Incorrect login or password
        WebElement errorMessage=driver.findElement(By.className("errortext"));
        String expectedErrorMessage="Incorrect login or password";
        //String actualErrorMessage=errorMessage; compeiler error becauese return webelement
        String actualErrorMessage=errorMessage.getText();
        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error message verification PASSED!!");
        }else {
            System.out.println("Error message verification FAİLED!!");
        }
        //driver.close();

        //PS: Inspect and decide which locator you should be using to locate webelements.
    }
}
