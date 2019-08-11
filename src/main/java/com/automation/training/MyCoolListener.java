package com.automation.training;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyCoolListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }
    @Override
    public void onTestSuccess(ITestResult arg0){
        System.out.println("El test paso!");
    }
    @Override
    public void onTestFailure(ITestResult arg0){
        System.out.println("El test fallo :( ");
    }
    @Override
    public void onTestSkipped(ITestResult result) {

    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
    @Override
    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
