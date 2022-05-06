package com.cydeo.tests.day1SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");

        String expectedURL="cydeo";
        String actualURL=driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASS!");
        }else {
            System.out.println("URL verification");
        }

        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Title verification PASS!");
        }else{
            System.out.println("Title verification FAİLED!!!");
        }
        driver.close();

        /*
        if (driver.getTitle().equals("Practice")){
            System.out.println("PASSED!!");
        }else{
            System.out.println("FAİLED!!!");
        }
        not work this argument but why ?
         */

        //if (actualURL.contains(expectedURL))


    }
}
