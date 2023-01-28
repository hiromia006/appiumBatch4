package com.appium.batch4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmulatorTest extends BaseEmulatorTest {

    @Test
    public void browseTest() throws InterruptedException {
        WebElement webElement7 = driver.findElement(By.id("search_src_text"));
        webElement7.isDisplayed();
        webElement7.click();
        webElement7.sendKeys("Hiro Mia");
        Thread.sleep(3000);

        WebElement add = driver.findElement(By.id("search_go_btn"));
        add.isDisplayed();
        add.click();
        Thread.sleep(3000);
    }
}
