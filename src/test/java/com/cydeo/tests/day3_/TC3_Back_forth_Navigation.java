package com.cydeo.tests.day3_;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_Back_forth_Navigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement Gmail= driver.findElement(By.className("Gmail"));
        System.out.println("Gmail = " + Gmail);


        String expectedHref="Gmail";
        String actualHrefAttributeGmail= Gmail.getAttribute("href");
        System.out.println("actualHrefAttributeGmail = " + actualHrefAttributeGmail);
        if (actualHrefAttributeGmail.equals(expectedHref)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


    }
}
