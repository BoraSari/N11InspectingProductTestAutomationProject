package N11Pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public  WebDriver driver;
    protected String baseUrl ="https://www.n11.com/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public String getN11PageSources(){
        return driver.getPageSource();
    }

    public String getN11Title(){
        return driver.getTitle();
    }
    public void navigateN11MainPage(){
        driver.get(baseUrl);
    }
}
