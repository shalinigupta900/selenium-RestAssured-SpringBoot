package com.pojo.fedex.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shipping {


    @FindBy(css=".fdx-sjson-c-nav__main__menu__item.is-active")
    private WebElement shipping;

    @FindBy(xpath="//li/a[1]")
    private WebElement shippingNow;


}
