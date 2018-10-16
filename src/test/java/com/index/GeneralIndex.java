package com.index;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.indexpage.GeneralIndexpage;
import com.init.Common;
import com.init.Commonnew;
import com.init.SeleniumInit;
import com.verification.GeneralVerification;

public class GeneralIndex extends SeleniumInit {

	
    
@Test
public void register_med_max(){
int step=1;
	
	Common.logcase("To verify that user is able to Register");

	Common.logcase("--------------------------------------------------------------------------");
	
	Common.logstep("Step "+ (step++) +". open : http://medmaxpharmacy.com/");
	
	
	boolean tf = generalVerification.verifymedmaxhomepage();
	
	if(tf){

		   Common.log("--->  Home page is open  <---");
		   Common.logStatus("Pass");
		   Assert.assertTrue(true,"--->  Home page is open  <---");
		   
		   
	}
	else
	   {   Common.log("--->  Home page is not open  <---");
	       Common.logStatus("Fail");
	       Assert.assertTrue(false,"--->  Home page is not open  <---");
	  } 
	
	 Common.logstep("Step "+ (step++) +". Click on Register Button");
	 
	 generalVerification=generalIndexpage.medmax_click_on_register();
	 
	 Common.logstep("Step "+ (step++) +". Enter Details for the Registration");
	 
	 generalVerification=generalIndexpage.medmax_registration_details();
	 
     Common.logstep("Step "+ (step++) +". Click on Continue Button to Register");
	 
	 generalVerification=generalIndexpage.medmax_click_on_continue();
	 
	 generalIndexpage.credentials();
}

@Test
public void Login_med_max(){
int step=1;
	
	Common.logcase("To verify that user is able to Login");

	Common.logcase("--------------------------------------------------------------------------");
	
	Common.logstep("Step "+ (step++) +". open : http://medmaxpharmacy.com/");
	
	
	boolean tf = generalVerification.verifymedmaxhomepage();
	
	if(tf){

		   Common.log("--->  Home page is open  <---");
		   Common.logStatus("Pass");
		   Assert.assertTrue(true,"--->  Home page is open  <---");
		   
		   
	}
	else
	   {   Common.log("--->  Home page is not open  <---");
	       Common.logStatus("Fail");
	       Assert.assertTrue(false,"--->  Home page is not open  <---");
	  } 
	
	 generalIndexpage.getcredential();
	
	 Common.logstep("Step "+ (step++) +". Click on Login Button");
	 
	 generalVerification=generalIndexpage.medmax_click_on_Login();
	 
	 Common.logstep("Step "+ (step++) +". Enter Email for Login");
	 
	 generalVerification=generalIndexpage.medmax_email_Login();
	 
     Common.logstep("Step "+ (step++) +". Enter Password For Login");
	 
	 generalVerification=generalIndexpage.medmax_password_Login();
	 
     Common.logstep("Step "+ (step++) +". Click on Login Button");
	 
	 generalVerification=generalIndexpage.medmax_Login();
}


}//ends of class





