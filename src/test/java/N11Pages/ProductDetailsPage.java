package N11Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static com.google.common.util.concurrent.Futures.withTimeout;


public class ProductDetailsPage extends BasePage{

    @FindBy(xpath = "//img[@src='https://n11scdn.akamaized.net/a1/602_857/03/53/57/18/IMG-2097642565721014876.jpg']")
    private WebElement product;
    @FindBy(xpath = "//button[@class='slick-next-main slick-arrow' and @aria-label='İleri']")
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
      wait.until(ExpectedConditions.visibilityOf(product));
       Actions actions = new Actions(driver);
        if(product.isDisplayed()&& product.isEnabled()){
            actions.moveToElement(product).click().perform();
        }else{
            System.out.println("Element is not displayed");
        }


    }

    public void clickArrowButton()throws InterruptedException{
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        if(arrowButton.isEnabled()&&arrowButton.isDisplayed()){
           wait.until(ExpectedConditions.visibilityOf(arrowButton)).isDisplayed();
            actions.click(arrowButton).build().perform();
        }

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
