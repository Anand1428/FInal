package com.maven.Final;

import com.maven.pom.User_Registration_Page;

import Base_Class.Base_Class;

public class User_Reg extends Base_Class {
	public static void main(String[] args) throws Throwable {
		BrowserLaunch("chrome");
		openUrl("https://adactinhotelapp.com/");

	User_Registration_Page ur=new User_Registration_Page(driver);
	ClickOnElement(ur.toclickregister());
		inputValues(ur.togetusername(),"Anand2893");
		Thread.sleep(2000);
		inputValues(ur.togetpassword(), "123@678");
		inputValues(ur.getconfirmpwd(),"123@678");
		inputValues(ur.getname(), "Anand");
		inputValues(ur.getmail(), "maxanand7860@gmail.com");
		inputValues(ur.getcaptcha(),"jashkjd");
		ClickOnElement(ur.getterms());
		//ClickOnElement(ur.submit());
	
	
	}

}
