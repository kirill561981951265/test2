package com.kir.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShoesPage extends AbstractPage
{
    private final String BASE_URL = "https://www.marko.by/muzhchinam/";
    private final Logger logger = LogManager.getRootLogger();

    public ShoesPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ShoesPage openPage()
    {
        driver.navigate().to(BASE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='c-bn']")));
        driver.findElement(By.xpath("//button[@class='c-bn']")).click();
        driver.manage().window().maximize();
        return this;
    }

    public ShoesPage chooseTheFirstPair1(){
        Dimension dimension = new Dimension(1500, 662);
        driver.manage().window().maximize();

        List<WebElement> elements=driver.findElements(By.xpath("//div[@class='sidebar__block ']"));
        elements.get(2).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='arrFilter_1097_3288835175']")));
        driver.findElement(By.xpath("//label[@for='arrFilter_1097_3288835175']")).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']")));
        driver.findElement(By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']")).click();
        return this;
    }

    public ShoesPage chooseTheCoast(){
        Dimension dimension = new Dimension(1500, 662);
        driver.manage().window().maximize();

        List<WebElement> elements=driver.findElements(By.xpath("//div[@class='sidebar__heading ']"));
        elements.get(1).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='irs-bar']")));
        driver.findElement(By.xpath("//span[@class='irs-bar']")).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']")));
        driver.findElement(By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']")).click();
        return this;
    }

    public ShoesPage chooseTheCity(){
        Dimension dimension = new Dimension(1500, 662);
        driver.manage().window().maximize();

        List<WebElement> elements=driver.findElements(By.xpath("//div[@class='sidebar__heading ']"));
        elements.get(0).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='vscomp-toggle-button']")));
        driver.findElement(By.xpath("//div[@class='vscomp-toggle-button']")).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-value='arrFilter_1161_1343485207']")));
        driver.findElement(By.xpath("//div[@data-value='arrFilter_1161_1343485207']")).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']")));
        driver.findElement(By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']")).click();
        return this;
    }
}