package N11Tests;

import N11Pages.N11MainPage;
import N11Pages.OverseasProductPage;
import N11Pages.ProductDetailsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;

public class N11Tests extends BaseTest{
    N11MainPage n11MainPage;
    OverseasProductPage overseasProductPage;
    @Test(priority = 1)
    public void N11NavigateOverseasProductCategoryTest(){
        n11MainPage=new N11MainPage(driver);
        n11MainPage.navigateN11MainPage();
        n11MainPage.navigateOverseasProductPage();
    }

    @Test(priority = 2)
    public void navigateOverseasProductTest(){
        overseasProductPage = new OverseasProductPage(driver);
        overseasProductPage.scrollDownOverseasProductPage();
        overseasProductPage.clickProduct();
    }

    @Test(priority = 3)
    public void checkingOverseasProductTest() throws InterruptedException, AWTException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage.clickProduct();
       for(int i=0;i<7;i++){
           productDetailsPage.clickArrowButton();
           Thread.sleep(2000);
       }
        productDetailsPage.closeProductImages();
        Thread.sleep(5000);
        softAssert.assertEquals(productDetailsPage.checkEvaluationOfProduct(),"8\n" +
                "değerlendirme");
        softAssert.assertTrue(productDetailsPage.checkOverseasImage().isDisplayed());
    }
}
