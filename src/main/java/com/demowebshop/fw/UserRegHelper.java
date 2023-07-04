package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRegHelper extends BaseHelper{

  public UserRegHelper(WebDriver driver) {
    super(driver);
  }

  public void clickOnRegisterButton() {
    click(By.xpath("//a[contains(text(),'Register')]"));
  }

  public void fillPersonalDetails() {
    click(By.id("gender-male"));
    type(By.id("FirstName"), "Alexsey");
    type(By.id("LastName"), "Schafran");
    type(By.id("Email"), "schafran2@brother.com");
  }

  public void fillPasswordsFilds() {
    type(By.id("Password"), "qwert12345");
    type(By.id("ConfirmPassword"), "qwert12345");
  }

  public void clickOnOkRegisterButton() {
    click(By.id("register-button"));
  }

  public boolean isSignCompletedPresent() {
    return isElementPresent(By.xpath("//div[contains(text(),'Your registration completed')]"));
  }
}
