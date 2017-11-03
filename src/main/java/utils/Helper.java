package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PaginaComprador;
import pages.Portais;

import static java.awt.SystemColor.text;

public class Helper {
    private static WebDriver driver;
    private static WebDriverWait wait = new WebDriverWait(getWebDriver(), 20);

    public static void elementToBeClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public static void loadingPortal() {

        boolean flag = true;
        while (flag) {
            String status = Portais.loading();
            if (!status.equals("ng-scope actived")) {
                flag = false;
            }
        }
    }

    public static String getText(By by) {
        return findElement(by).getText();
    }

    public static void click(By by) {
        getWebDriver().findElement(by).click();
    }

    public static void get(String url) {
        getWebDriver().get(url);
    }

    public static WebElement findElement(By by) {
        return getWebDriver().findElement(by);
    }

    public static void sendKeys(By by, CharSequence... text) {
        findElement(by).sendKeys(text);
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = WebDriverFactory.GetChromeDriver();
            return driver;
        } else {
            return driver;

        }
    }
}
