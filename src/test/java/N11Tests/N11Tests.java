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
        n11MainPage=new N11MainPage(getDriver());
        n11MainPage.navigateN11MainPage();
        n11MainPage.navigateOverseasProductPage();
    }

    @Test(priority = 2)
    public void navigateOverseasProductTest(){
        overseasProductPage = new OverseasProductPage(getDriver());
        overseasProductPage.scrollDownOverseasProductPage();
        overseasProductPage.clickProduct();
    }

    @Test(priority = 3)
    public void checkingOverseasProductTest() throws InterruptedException, AWTException {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());
        productDetailsPage.clickProduct();
       for(int i=0;i<9;i++){
           Thread.sleep(2000);
           productDetailsPage.clickArrowButton();
       }
        productDetailsPage.closeProductImages();
        Thread.sleep(5000);
        softAssert.assertEquals(productDetailsPage.checkEvaluationOfProduct(),"51\n" +
                "değerlendirme");
        softAssert.assertTrue(productDetailsPage.checkOverseasImage().isDisplayed());
    }
}
