package com.cydeo.tests.day3_;

import com.cydeo.Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class T3_try {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
}
