package com.adactin.Step_Definition;

import org.openqa.selenium.WebDriver;

import com.adactin.Helper.Page_Object_Manager;
import com.adactin.Testrunner.Test_Runner;
import com.adactin.properties.File_Reader_Manager;
import com.maven.pom.Booking_Page;
import com.maven.pom.Confirmation_Page;
import com.maven.pom.Login_Page;
import com.maven.pom.Search_Page;
import com.maven.pom.Select_Page;

import Base_Class.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	 
     Page_Object_Manager pom=new Page_Object_Manager(driver);
	

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	//	BrowserLaunch("chrome");
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		
		openUrl(url);

	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field( String Username) throws Throwable {
		inputValues(pom.getInstancelp().getUsername(), Username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field( String Password) throws Throwable {
		inputValues(pom.getInstancelp().getpass(), Password);
	}


	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		
		ClickOnElement(pom.getInstancelp().clicklogin());
	}

	@When("^user Select The Location Of Hotel$")
	public void user_Select_The_Location_Of_Hotel() throws Throwable {
		String loc = File_Reader_Manager.getInstance().getInstanceCR().getLoc();
		Selectvalue(pom.getInstancesp().selectlocation(),loc);
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		String hotel = File_Reader_Manager.getInstance().getInstanceCR().getHotel();
		
		Selectvalue(pom.getInstancesp().selecthotels(),hotel);

	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		String roomtype = File_Reader_Manager.getInstance().getInstanceCR().getRoomtype();              
		Selectvalue(pom.getInstancesp().selectroomtype(),roomtype);

	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
		String nroom = File_Reader_Manager.getInstance().getInstanceCR().getNroom();
		Selectvalue(pom.getInstancesp().getNoofrooms(),nroom);
	}

	@When("^user Enter The Check-In Date In The Field$")
	public void user_Enter_The_Check_In_Date_In_The_Field() throws Throwable {
		String cid = File_Reader_Manager.getInstance().getInstanceCR().getCID();
		Clr(pom.getInstancesp().checkinDate());
		inputValues(pom.getInstancesp().checkinDate(),cid);
	}

	@When("^user Enter The Check-Out Date In The Field$")
	public void user_Enter_The_Check_Out_Date_In_The_Field() throws Throwable {
		String cod = File_Reader_Manager.getInstance().getInstanceCR().getCOD();
		
		Clr (pom.getInstancesp().checkoutDate());
		inputValues(pom.getInstancesp().checkoutDate(),cod);
	}

	@When("^user Select The Number Of Rooms For Adult$")
	public void user_Select_The_Number_Of_Rooms_For_Adult() throws Throwable {
		String adult = File_Reader_Manager.getInstance().getInstanceCR().getAdult();
		Selectvalue(pom.getInstancesp().selectAdultroom(),adult);
	}

	@When("^user Select The Number Of Rooms For Child$")
	public void user_Select_The_Number_Of_Rooms_For_Child() throws Throwable {
		String child = File_Reader_Manager.getInstance().getInstanceCR().getChild();
		Selectvalue(pom.getInstancesp().selectChildroom(),child);
	}

	@Then("^user Click The Search Button And It Navigates To Select Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Page() throws Throwable {
		ClickOnElement(pom.getInstancesp().clicksubmit());
	}

	@When("^user Confirm The Selected Hotel$")
	public void user_Confirm_The_Selected_Hotel() throws Throwable {
		ClickOnElement(pom.getInstanceselpag().CheckRadio());

	}

	@Then("^user Click On Continue Button And Navigates To Book A Hotel Page$")
	public void user_Click_On_Continue_Button_And_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		ClickOnElement(pom.getInstanceselpag().clickcontinue());
	}

	@When("^user Enter The FirstName In Desired Field$")
	public void user_Enter_The_FirstName_In_Desired_Field() throws Throwable {
		String fn = File_Reader_Manager.getInstance().getInstanceCR().getFn();
		
		inputValues(pom.getInstancebp().getFsname(),fn);
	}

	@When("^user Enter The LastName In Desired Field$")
	public void user_Enter_The_LastName_In_Desired_Field() throws Throwable {
		String ln = File_Reader_Manager.getInstance().getInstanceCR().getLn();
		inputValues(pom.getInstancebp().getLsname(),ln);
	}

	@When("^user Enter The Address$")
	public void user_Enter_The_Address() throws Throwable {
		String add = File_Reader_Manager.getInstance().getInstanceCR().getAdd();
		inputValues(pom.getInstancebp().getads(),add);
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		String cc = File_Reader_Manager.getInstance().getInstanceCR().getCc();
		inputValues(pom.getInstancebp().getCredit(),cc);

	}

	@When("^user Select Cc Type$")
	public void user_Select_Cc_Type() throws Throwable {
		String ccType = File_Reader_Manager.getInstance().getInstanceCR().getCcType();
		Selectvalue(pom.getInstancebp().getCCtype(),ccType);
	}

	@When("^user Select the Expiry Month Of Cc$")
	public void user_Select_the_Expiry_Month_Of_Cc() throws Throwable {
	String expm = File_Reader_Manager.getInstance().getInstanceCR().getExpM();
	
		Selectvalue(pom.getInstancebp().getExpmonth(),expm);

	}

	@When("^user Select the Expiry Year Of CC$")
	public void user_Select_the_Expiry_Year_Of_CC() throws Throwable {
		String expY = File_Reader_Manager.getInstance().getInstanceCR().getExpY();
		Selectvalue(pom.getInstancebp().getExpYear(),expY);
	}

	@When("^user Enter The Cvv Number$")
	public void user_Enter_The_Cvv_Number() throws Throwable {
		String getcvv = File_Reader_Manager.getInstance().getInstanceCR().getcvv();
		inputValues(pom.getInstancebp().getCvv(),getcvv);
	}

	@Then("^user Click On BookNow Button And Navigates To Confirmation Page$")
	public void user_Click_On_BookNow_Button_And_Navigates_To_Confirmation_Page() throws Throwable {
	
		
		ClickOnElement(pom.getInstancebp().ClickBkN());
		Thread.sleep(6000);
	}

	@When("^user Click On Booked Itinerary Navigates To Bookings Page$")
	public void user_Click_On_Booked_Itinerary_Navigates_To_Bookings_Page() throws Throwable {
		ClickOnElement(pom.getInstancecp().ClickMyBookings());

	}
}
