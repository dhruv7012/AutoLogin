package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://172.25.25.5:8090/httpclient.html");

        driver.manage().window().maximize();

        WebElement userele=driver.findElement(By.id("username"));
        WebElement passele=driver.findElement(By.id("password"));
        userele.sendKeys("dhruv.parekh");
        passele.sendKeys("nointernet");
        userele.click();
        passele.click();


        WebElement submitButton=driver.findElement(By.id("loginbutton"));

        submitButton.click();

    }
}