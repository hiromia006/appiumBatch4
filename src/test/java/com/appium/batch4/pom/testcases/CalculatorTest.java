package com.appium.batch4.pom.testcases;

import com.appium.batch4.pom.BaseEmiCalculatorTest;
import com.appium.batch4.pom.pages.CalculatorPage;
import com.appium.batch4.pom.pages.HomePage;
import com.appium.batch4.pom.util.General;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseEmiCalculatorTest {
    CalculatorPage calculatorPage;

    @BeforeClass
    public void initialization() {
        calculatorPage = new HomePage()
                .tapEmiCalculatorBtn();
    }

    @Test
    public void calculateLoanShouldSucceed() {
        calculatorPage = calculatorPage
                .fillLoanAmount(250000)
                .fillInterestPercentage(9)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessFee(2)
                .tapCalculatorBtn();
        Assert.assertTrue(calculatorPage.hasDetailBtn());
    }

    @Test(enabled = false)
    public void resetLoanShouldSucceed() {
        calculatorPage = calculatorPage
                .fillLoanAmount(250000)
                .fillInterestPercentage(9)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessFee(2)
                .tapResetBtn();
    }

    @Test(dataProvider ="loanInfo" )
    public void calculateLoanDetailShouldSucceed(String loan, String interest, String period,  String pFee, String tpFee ) {
        calculatorPage = calculatorPage
                .fillLoanAmount(Integer.valueOf(loan))
                .fillInterestPercentage(Integer.valueOf(interest))
                .fillYear(Integer.valueOf(period))
                .fillMonth(Integer.valueOf(pFee))
                .fillProcessFee(Integer.valueOf(tpFee))
                .tapCalculatorBtn();
        Assert.assertTrue(calculatorPage.hasDetailBtn());

    }


    @DataProvider
    public Object[][] loanInfo() {
        return General.getTestData("Sheet1");
    }

}
