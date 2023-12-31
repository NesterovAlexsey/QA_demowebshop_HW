package com.demowebshop.fw;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

  public WebDriver driver;

  UserRegHelper user;

  public UserRegHelper getUser() {
    return user;
  }

  public void init() {
    driver = new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    user = new UserRegHelper(driver);
  }

  public void stop() {
    driver.quit();
  }
}
