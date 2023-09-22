package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.elementHelper;

public class manWomenPage {

    AppiumDriver driver;
    elementHelper elementHelper;

    By image = AppiumBy.className("android.widget.ImageView");

    public manWomenPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
        elementHelper = new elementHelper(appiumDriver);
    }

    public void checkImage() {
        elementHelper.checkElement(image);
        //elementHelper.findElement(image).isDisplayed();
        //driver.findElement(image).isDisplayed();
    }

}
