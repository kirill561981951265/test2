package com.kir.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindAStore extends AbstractPage
{
    private final String BASE_URL = "https://www.marko.by/";

    public FindAStore(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    @Override
    public FindAStore openPage()
    {
        driver.navigate().to(BASE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='c-bn']")));
        driver.findElement(By.xpath("//button[@class='c-bn']")).click();
        driver.manage().window().maximize();
        return this;
    }

    public FindAStore findAStore()
    {

        driver.findElement(By.xpath("//input[@class='search-form__input field-effects-js']")).sendKeys("ботинки");
        driver.findElement(By.xpath("//input[@class='search-form__input field-effects-js']")).sendKeys(Keys.ENTER);
        return this;
    }
    public FindAStore subskribe()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,6500)", "");
        driver.findElement(By.xpath("//input[@id='subs']")).sendKeys("kirill24022@mail.ru");

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/footer/div[1]/div/form/div/div[2]/div[1]/button")));
        driver.findElement(By.xpath("//html/body/div[2]/footer/div[1]/div/form/div/div[2]/div[1]/button")).click();
        return this;
    }

    public FindAStore subskribeerror() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,6500)", "");
        driver.findElement(By.xpath("//input[@id='subs']")).sendKeys("kirill24022");

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/footer/div[1]/div/form/div/div[2]/div[1]/button")));
        driver.findElement(By.xpath("//html/body/div[2]/footer/div[1]/div/form/div/div[2]/div[1]/button")).click();
        Thread.sleep(15000);
        return this;
    }
}
