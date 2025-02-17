package N11Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverseasProductPage extends BasePage{

    @FindBy(xpath = "//img[@class='lazy cardImage'][1]")
    private WebElement product;

    public OverseasProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void scrollDownOverseasProductPage(){
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scrollBy(0,500)");
    }


    public void clickProduct(){
        product.click();
    }
}
