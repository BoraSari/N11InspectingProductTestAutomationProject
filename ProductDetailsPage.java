package N11Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import static com.google.common.util.concurrent.Futures.withTimeout;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.refreshed;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class ProductDetailsPage extends BasePage{

    @FindBy(css = "img[src='https://n11scdn.akamaized.net/a1/602_857/11/99/81/81/IMG-593874296162406960.jpg']")
    private WebElement productImage;
    @FindBy(css = "button[class='slick-next-main slick-arrow'")
    private WebElement arrowButton;
    @FindBy(className = "closeBtn")
    private WebElement closeButton;
    @FindBy(id = "readReviews")
    private WebElement evaluationOfProduct;
    @FindBy(xpath = "//img[@src='https://n11scdn.akamaized.net/a1/org/24/08/09/88/56/64/67/16/21/58/62/81/79064825173882417375.png'][1]")
    private WebElement overseasProductImage;


    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void clickProduct()throws InterruptedException {
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
      wait.until(ExpectedConditions.visibilityOf(productImage));
       Actions actions = new Actions(driver);
        if(productImage.isDisplayed()&& productImage.isEnabled()){
            actions.moveToElement(productImage).click().perform();
        }else{
            System.out.println("Element is not displayed");
        }


    }

    public void clickArrowButton()throws InterruptedException{
        arrowButton.click();
    }

    public void closeProductImages() throws AWTException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

    }

    public String checkEvaluationOfProduct(){
      return evaluationOfProduct.getText();

    }

    public WebElement checkOverseasImage(){
        WebElement image = overseasProductImage;
        return image;
    }


}
