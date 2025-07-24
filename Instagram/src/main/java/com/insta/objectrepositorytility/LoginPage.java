package com.insta.objectrepositorytility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
@FindBy(name="username")
WebElement username;

@FindBy(name="pass")
WebElement password;

@FindBy(id="login")
WebElement login;

}
