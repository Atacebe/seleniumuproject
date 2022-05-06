package com.cydeo.tests.day2_locators_getTest_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTestPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
       // driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestlink=driver.findElement(By.linkText("A/B testing"));
        abTestlink.click();

        String expectedTitle="No A/B Test";
        String actualTitle=driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAİLED!!!");
        }

        driver.navigate().back();

        String expectedTitle2="Practice";
        actualTitle=driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle2)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAİLED!!!");

        }



    }
}
