package com.automation.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MyDriver {
    private WebDriver driver;

    public MyDriver(String browser){
        switch(browser){
            case "remoteFirefox":
                try {
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
                } catch (MalformedURLException e){
                    e.printStackTrace();
                }
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver","/home/eve/Descargas/chromedriver/chromedriver_linux64");
                driver = new ChromeDriver();
                break;
                default:
                break;
            }
    }
    public WebDriver getDriver(){
        return this.driver;
    }
}
