package com.mycompany.seleniumwebdriverutilities2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author hubert
 */
public class ScreenShotUtility {
    /**
     * Takes a screen shot of the browser
     * @param browser
     * @return 
     */
    public File takeScreenShot(WebDriver browser){
        File scrFile = ((TakesScreenshot)browser).getScreenshotAs(OutputType.FILE);
        return scrFile;
        //FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
        //pulled from http://stackoverflow.com/questions/3422262/take-a-screenshot-with-selenium-webdriver
    }
    
}
