package com.orangehrm.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest {

    @Test
    public void verifyDashboard() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

     // Open OrangeHRM
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Create Explicit Wait (maximum 10 seconds)
        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        // Wait for username field
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.name("username")
        )).sendKeys("Admin");

        // Wait for password field
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.name("password")
        )).sendKeys("admin123");

        // Wait for login button and click
        wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("button[type='submit']")
        )).click();
        
     // Wait for Dashboard heading
        WebDriverWait wait1 = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        String actualHeading = wait1.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h6[text()='Dashboard']")
            )
        ).getText();

        // Verify heading
        Assert.assertEquals(actualHeading, "Dashboard");

        // Navigate to Leave
        driver.findElement(
            By.xpath("//span[text()='Leave']")
        ).click();

        // Close browser
        driver.quit();
    }
}