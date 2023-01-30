package com.appium.batch4.pom.pages;

import com.appium.batch4.pom.BaseEmiCalculatorTest;
import com.appium.batch4.pom.util.General;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class HomePage extends BaseEmiCalculatorTest {
    @FindBy(id = "btnStart")
    WebElement emiCalculatorBtn;

    @FindBy(id = "btnCompare")
    WebElement compareLoanBtn;

    public HomePage() {
        ////        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.TIME_OUT)), this);
        PageFactory.initElements(driver, this);
    }

    public CalculatorPage tapEmiCalculatorBtn() {
        emiCalculatorBtn.isDisplayed();
        emiCalculatorBtn.click();
        return new CalculatorPage();
    }

}
