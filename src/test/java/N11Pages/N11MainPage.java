package N11Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class N11MainPage extends BasePage {
    @FindBy(xpath = "//img[@src='https://n11scdn.akamaized.net/a1/org/24/12/03/65/85/81/01/73/96/21/30/26/38976176843259491755.png']")
    private WebElement  overseasProductPagePicture;





    public N11MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void navigateOverseasProductPage(){
        overseasProductPagePicture.click();
    }




    }

