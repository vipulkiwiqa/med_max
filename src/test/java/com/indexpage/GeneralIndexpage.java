package com.indexpage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.init.AbstractPage;
import com.init.Common;
import com.init.Commonnew;
import com.utility.TestData;
import com.verification.GeneralVerification;

public class GeneralIndexpage extends AbstractPage {

	public GeneralIndexpage(WebDriver driver) {
		super(driver);
	}

	//Variables
	
	String password=null;
	String medmax_email_enter=null;
	
@FindBy(xpath="//span[contains(text(),'Register')]")private WebElement medmax_register;

public GeneralVerification medmax_click_on_register(){
	
	Commonnew.clickonelementlink(driver, medmax_register, 5);
	return new GeneralVerification(driver);
}

@FindBy(xpath="//input[@id='input-firstname']")private WebElement medmax_firstname;
@FindBy(xpath="//input[@id='input-lastname']")private WebElement medmax_lastname;
@FindBy(xpath="//input[@id='input-email']")private WebElement medmax_email;
@FindBy(xpath="//input[@id='input-telephone']")private WebElement medmax_telephone;
@FindBy(xpath="//input[@id='input-fax']")private WebElement medmax_fax;

@FindBy(xpath="//input[@id='input-company']")private WebElement medmax_company;
@FindBy(xpath="//input[@id='input-address-1']")private WebElement medmax_address_1;
@FindBy(xpath="//input[@id='input-address-2']")private WebElement medmax_address_2;
@FindBy(xpath="//input[@id='input-city']")private WebElement medmax_city;
@FindBy(xpath="//input[@id='input-postcode']")private WebElement medmax_postcode;
@FindBy(xpath="//select[@id='input-country']")private WebElement medmax_select_country;
@FindBy(xpath="//select[@id='input-zone']")private WebElement medmax_state;
@FindBy(xpath="//legend[contains(text(),'Your Password')]")private WebElement pagedown;
@FindBy(xpath="//input[@id='input-password']")private WebElement medmax_password;
@FindBy(xpath="//input[@id='input-confirm']")private WebElement medmax_confirmpassword;
@FindBy(xpath="//a[contains(text(),'Read More ')]")private WebElement pagedownagain;
@FindBy(xpath="//div[@class='tm-checkbox']//input")private WebElement medmax_checkthe_conditions;



public GeneralVerification medmax_registration_details() {
	// TODO Auto-generated method stub
	Common.log("=======> Enter Your Personal Details <=======");
	Commonnew.sendkeys(driver, medmax_firstname, 1,TestData.randomAlpha(6));
	Common.log("-------> Entered Firstname <-------");
	Commonnew.sendkeys(driver, medmax_lastname, 1, TestData.randomAlpha(6));
	Common.log("-------> Entered Lastname <-------");
	
	medmax_email_enter=TestData.randomAlphaNumeric(4)+"@mailinator.com";
	
	Commonnew.sendkeys(driver, medmax_email, 1,medmax_email_enter );
	Common.log("-------> Entered Email Address <-------");
	Commonnew.sendkeys(driver, medmax_telephone, 1, TestData.randomNumeric(10));
	Common.log("-------> Entered Phone Number <-------");
	Commonnew.sendkeys(driver, medmax_fax, 1, TestData.randomNumeric(10));
	Common.log("-------> Entered Fax Number <-------");
	
	Commonnew.moveToElementByJs(driver, pagedown);
	Common.log("=======> Enter Your Address Details <=======");
	Commonnew.sendkeys(driver, medmax_company, 1,TestData.randomAlpha(10));
	Common.log("-------> Entered Company Name <-------");
	Commonnew.sendkeys(driver, medmax_address_1, 1,TestData.randomAlpha(8));
	Common.log("-------> Entered First Line of the Address <-------");
	Commonnew.sendkeys(driver, medmax_address_2, 1,TestData.randomAlpha(8));
	Common.log("-------> Entered Second Line of the Address <-------");
	Commonnew.sendkeys(driver, medmax_city, 1,TestData.randomAlpha(6));
	Common.log("-------> Entered City <-------");
	Commonnew.sendkeys(driver, medmax_postcode, 1,TestData.randomAlpha(2)+TestData.randomAlphaNumeric(4));
	Common.log("-------> Entered Post Code <-------");
	Commonnew.selectdropdownwithtextwithpause(driver, medmax_select_country,"United Kingdom");
	Common.log("-------> Select the Country <-------");
	Common.pause(2);
	Commonnew.selectdropdownwithtextwithpause(driver, medmax_state,"Greater London");
	Common.log("-------> Select the state <-------");
	
	Common.log("=======> Enter Password Details <=======");
	Commonnew.moveToElementByJs(driver, pagedownagain);
	
	password = TestData.randomAlpha(2)+TestData.randomAlphaNumeric(4);
	
	Commonnew.sendkeys(driver, medmax_password, 1,password);
	Common.log("-------> Entered password <-------");
	Commonnew.sendkeys(driver, medmax_confirmpassword, 1,password);
	Common.log("-------> Select confirm password <-------");
	
	Commonnew.clickonelementwithpause(driver, medmax_checkthe_conditions);
	Common.log("-------> Clicked on the Terms and Conditions <-------");
	
	Common.pause(15);
	
	return new GeneralVerification(driver);
}

@FindBy(xpath="//input[@type='submit']")private WebElement contunue_btn;

public GeneralVerification medmax_click_on_continue(){
	
	Commonnew.clickonelementlink(driver, contunue_btn, 5);
	Common.pause(15);
	return new GeneralVerification(driver);
}

@FindBy(xpath="//span[contains(text(),'Login')]")private WebElement login_btn;

public GeneralVerification medmax_click_on_Login(){
	
	Commonnew.clickonelementlink(driver, login_btn, 5);
	return new GeneralVerification(driver);
}

@FindBy(xpath="//input[@id='input-email']")private WebElement email;

public GeneralVerification medmax_email_Login(){
	Commonnew.type(email, medmax_email_enter);
	return new GeneralVerification(driver);
}

@FindBy(xpath="//input[@id='input-password']")private WebElement passwordlogin; 

public GeneralVerification medmax_password_Login(){
	Commonnew.type(passwordlogin, password);
	Commonnew.pause(25);
	return new GeneralVerification(driver);
}

public void credentials() {
	// TODO Auto-generated method stub
	String fileName1 = "lib/temp.txt";
	String[] data = {medmax_email_enter,password};
	Commonnew.writedataintofile(fileName1, data);
	
}

public void getcredential() {
	// TODO Auto-generated method stub
	String fileName = "lib/temp.txt";

	 
	    // This will reference one line at a time
	    String line = null;

	    try {
	        // FileReader reads text files in the default encoding.
	        FileReader fileReader = 
	            new FileReader(fileName);

	        // Always wrap FileReader in BufferedReader.
	        BufferedReader bufferedReader = 
	            new BufferedReader(fileReader);

	        int i= 0;
	        while((line = bufferedReader.readLine()) != null) {
	           if(i==0)
	        	medmax_email_enter=line;
	           else
	        	   password=line;
	        	//data[i]=line;
	        	i++;
	        }   

	        // Always close files.
	        bufferedReader.close();         
	    }
	    catch(FileNotFoundException ex) {
	        System.out.println(
	            "Unable to open file '" + 
	            fileName + "'");                
	    }
	    catch(IOException ex) {
	        System.out.println(
	            "Error reading file '" 
	            + fileName + "'");                  
	        // Or we could just do this: 
	        // ex.printStackTrace();
	    }
	    
}

@FindBy(xpath="//input[@type='submit']")private WebElement Login_btn;

public GeneralVerification medmax_Login(){
	Commonnew.clickonelementlink(driver, Login_btn, 5);
	return new GeneralVerification(driver);
}

}//end of class



