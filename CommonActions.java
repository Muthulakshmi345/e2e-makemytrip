package e2.utilities;




import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {

 public void waitForElementToVisible(WebElement ele, WebDriver driver) {

 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

 wait.until(ExpectedConditions.visibilityOf(ele));

 }

 public void clickOnElement(WebElement ele) {

 try {

  ele.click();

 } catch (Exception e) {

  e.printStackTrace();

 }

 }

 public void clickIfElementExist(WebElement ele) {

 if(ele.isDisplayed())

 {

  ele.click();

 }else

 {

 }

 }

}

