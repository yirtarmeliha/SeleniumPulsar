package Scenarios;


import TestLogger.TestResultLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestResultLogger.class)
public class OpenPage {



    protected WebDriver driver;
    Elements page;
    ElementsJS fruitAndVegElement;

    @BeforeAll
    public void setUp() throws Exception{




        //  System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://pulsar.tills4u.com:4440/pulsar/dispatcher/pagenavi#/");
        driver.manage().window().maximize();
        page = new Elements(driver);
        fruitAndVegElement = new ElementsJS(driver);
        Elements.singOnOff().click();
        for (WebElement webElement : Arrays.asList(Elements.onePopUp(), Elements.enterPopUp())) {
            webElement.click();
        }

    }


    protected void initJqueryPointVegMenuElements(){
        if(!(Boolean) ElementsJS.js.executeScript("return (typeof jQuery != \"undefined\")")) {
            ElementsJS.js.executeScript(
                    "var headID = document.getElementsByTagName('head')[0];" +
                            "var newScript = document.createElement('script');" +
                            "newScript.type = 'text/javascript';" +
                            "newScript.src = 'https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js';" +
                            "headID.appendChild(newScript);");


            ElementsJS.js.executeScript("return (typeof jQuery != \"undefined\")");
        }
    }







}
