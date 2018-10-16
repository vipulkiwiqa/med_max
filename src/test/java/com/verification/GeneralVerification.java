package com.verification;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.init.AbstractPage;
import com.init.Common;
import com.init.Commonnew;

public class GeneralVerification extends AbstractPage {

	public GeneralVerification(WebDriver driver) {
		super(driver);
	}
public boolean verifymedmaxhomepage() {
	// TODO Auto-generated method stub
	
	String urlpass = "http://medmaxpharmacy.com/";
	return Commonnew.verifyhomepage(driver, urlpass);
}//end of function
	
}//class ends

