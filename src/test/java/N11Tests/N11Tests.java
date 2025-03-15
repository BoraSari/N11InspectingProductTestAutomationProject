package N11Tests;
import N11Pages.N11MainPage;
import N11Pages.OverseasProductPage;
import N11Pages.ProductDetailsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.util.logging.Logger;

public class N11Tests extends BaseTest{
    N11MainPage n11MainPage;
    OverseasProductPage overseasProductPage;
    ProductDetailsPage detailsPage;
    private final  static Logger logger = Logger.getLogger(String.valueOf(N11Tests.class));


    @BeforeMethod
    public void setupPages(){
        logger.info("All required classes setup section");
        n11MainPage = new N11MainPage(getDriver());
        overseasProductPage = new OverseasProductPage(getDriver());
        detailsPage =  new ProductDetailsPage(getDriver());
    }

    @Test(priority = 1)
    public void N11NavigateOverseasProductCategoryTest(){
        logger.info("Navigate N11 Main Page");
        n11MainPage.navigateN11MainPage();
        logger.info("Navigate Overseas Products Category");
        n11MainPage.navigateOverseasProductPage();
    }

    @Test(priority = 2)
    public void navigateOverseasProductTest(){
        logger.info("Scroll down the page");
        overseasProductPage.scrollDownOverseasProductPage();
        logger.info("Click Product");
        overseasProductPage.clickProduct();
    }

    @Test(priority = 3)
    public void checkingOverseasProductTest() throws InterruptedException, AWTException {
        logger.info("Inspect product pictures");
        detailsPage.clickProduct();
       for(int i=0;i<9;i++){
           Thread.sleep(2000);
           logger.info("Click arrow button");
           detailsPage.clickArrowButton();
       }
       logger.info("Close Product Image Sections");
        detailsPage.closeProductImages();
        try {
            softAssert.assertEquals(detailsPage.checkEvaluationOfProduct(),"55\n" +
                    "değerlendirme");
        }catch (Exception e){
            logger.warning("55 total evaluate can't be founded");
        }

        try {
            softAssert.assertTrue(detailsPage.checkOverseasImage().isDisplayed());
        }catch (Exception e){
            logger.warning("Overseas ımage can't displayed on page.");
        }


    }
}
