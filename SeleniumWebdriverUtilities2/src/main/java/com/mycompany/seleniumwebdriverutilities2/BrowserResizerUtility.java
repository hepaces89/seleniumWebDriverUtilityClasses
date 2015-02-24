package com.mycompany.seleniumwebdriverutilities2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author hubert
 */
public class BrowserResizerUtility {
    
    /**
     * Resizes the browser controlled by the WebDriver driver
     * sourced from http://stackoverflow.com/questions/16664433/how-to-resize-current-browser-window-in-selenium-webdriver-with-java
     * @param browser
     * @param xDim
     * @param yDim 
     */
    public static void resizeBrowser(WebDriver browser, int xDim, int yDim){
        Dimension dimension = new Dimension(xDim, yDim);
        browser.manage().window().setSize(dimension);
    }
}
