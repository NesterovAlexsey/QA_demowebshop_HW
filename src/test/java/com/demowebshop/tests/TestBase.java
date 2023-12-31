package com.demowebshop.tests;

import com.demowebshop.fw.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

  protected static ApplicationManager app = new ApplicationManager();

  @BeforeSuite
  public void setUp(){
    app.init();
  }

  @AfterSuite(enabled = false)
  public void tearDown() {
    app.stop();
  }
}
