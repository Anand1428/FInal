package com.adactin.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.maven.pom.Booking_Page;
import com.maven.pom.Confirmation_Page;
import com.maven.pom.Login_Page;
import com.maven.pom.Search_Page;
import com.maven.pom.Select_Page;
import com.maven.pom.User_Registration_Page;

public class Page_Object_Manager {
	public static WebDriver driver;

	private Booking_Page bp;
	private Confirmation_Page cp;
	private Login_Page lp;
	private Search_Page sp;
	private Select_Page selpag;
	private User_Registration_Page urp;

	public Page_Object_Manager(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
	
	}

	public Booking_Page getInstancebp() {
		bp = new Booking_Page(driver);
		return bp;
	}

	public Confirmation_Page getInstancecp() {
		cp = new Confirmation_Page(driver);
		return cp;

	}

	public Login_Page getInstancelp() {
		lp = new Login_Page(driver);
		return lp;
	}
	
	public Search_Page getInstancesp() {
		sp=new Search_Page(driver);
		return sp;
	}
     public Select_Page getInstanceselpag() {
		selpag=new Select_Page(driver);
		return selpag;
		
		
	}
     
     public User_Registration_Page getInstanceurp() {
		urp=new User_Registration_Page(driver);
		return urp;
	}
     
     
     
}
