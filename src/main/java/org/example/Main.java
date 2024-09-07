package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static WebDriver driver;
    public static void main(String[] args) {
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.navigate().to("https://swcqa.solartis.net/starr/");

         //Login Page

        //Username
       // WebElement username = driver.findElement(By.xpath("//input[@name = 'j_idt39:login_username']"));
        // WebElement username = driver.findElement(By.xpath("//input[contains(@id,'login_username')]"));
         WebElement username = driver.findElement(By.xpath("//label[text() = 'User Name']//following::input[contains(@id,'username')]"));

        username.sendKeys("starrunderwriter");

        //Password
        WebElement password = driver.findElement(By.xpath("//input[@id = 'j_idt39:login_password']"));
        password.sendKeys("welcome1");

        //LoginButton
        WebElement loginButton = driver.findElement(By.xpath("//input[@type = 'submit']"));
        loginButton.click();

        //Logoutlink
       // WebElement logout = driver.findElement(By.linkText("Logout"));
        WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        logout.click();

        //After Logout check
        WebElement textInLoginPage = driver.findElement(By.xpath("//label[@class = 'font_header']"));
        System.out.println(textInLoginPage.getText());

    }
    }
