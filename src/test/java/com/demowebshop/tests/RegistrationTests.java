package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

  @BeforeMethod
  public void goToRegistrationPage() {
    app.getUser().clickOnRegisterButton();
  }

  @Test
  public void registrationPositiveTest() {
    app.getUser().fillPersonalDetails();
    app.getUser().fillPasswordsFilds();
    app.getUser().clickOnOkRegisterButton();

    Assert.assertTrue(app.getUser().isSignCompletedPresent());
  }
}
