package com.cydeo.tests.day2_locators_getTest_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com./login.html");

        WebElement userNameInput=driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        WebElement passwordInput=driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        WebElement signInButton=driver.findElement(By.tagName("button"));
        signInButton.click();

    }
}
