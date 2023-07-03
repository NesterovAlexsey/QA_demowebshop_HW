package com.demowebshop.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

  @Test
  public void LoginPositiveTest() {
    app.getUser().click(By.xpath("//a[contains(text(),'Register')])"));
  }

}
