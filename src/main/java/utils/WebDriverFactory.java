package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver GetChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/bruno.moreira/IdeaProjects/Rede/src/main/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        driver = new ChromeDriver(options);
        return driver;
    }

}
