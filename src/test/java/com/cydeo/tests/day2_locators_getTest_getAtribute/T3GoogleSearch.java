package com.cydeo.tests.day2_locators_getTest_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement googleSearchBox=driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        driver.findElement(By.id("gLFyf gsfi"));

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println(" = ");
        }

    }
}
