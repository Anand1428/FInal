$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;;;1"
    },
    {
      "cells": [
        "Anand2893",
        "123@678"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Anand2893\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123@678\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 1666928700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anand2893",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 81112900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123@678",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 46703801,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 485180400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user Select The Location Of Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter The Check-In Date In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter The Check-Out Date In The Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Number Of Rooms For Adult",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Number Of Rooms For Child",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click The Search Button And It Navigates To Select Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_Of_Hotel()"
});
formatter.result({
  "duration": 79180700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 60990700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Room_Type()"
});
formatter.result({
  "duration": 54997201,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Number_Of_Rooms()"
});
formatter.result({
  "duration": 53870299,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date_In_The_Field()"
});
formatter.result({
  "duration": 62820100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_Out_Date_In_The_Field()"
});
formatter.result({
  "duration": 62931900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_For_Adult()"
});
formatter.result({
  "duration": 55481800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_For_Child()"
});
formatter.result({
  "duration": 55114700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_And_It_Navigates_To_Select_Page()"
});
formatter.result({
  "duration": 352500400,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user Confirm The Selected Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user Click On Continue Button And Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Confirm_The_Selected_Hotel()"
});
formatter.result({
  "duration": 41038401,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Continue_Button_And_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 359618700,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "user Enter The FirstName In Desired Field",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user Enter The LastName In Desired Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Address",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select Cc Type",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Select the Expiry Month Of Cc",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select the Expiry Year Of CC",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Cvv Number",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click On BookNow Button And Navigates To Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_FirstName_In_Desired_Field()"
});
formatter.result({
  "duration": 49420099,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_LastName_In_Desired_Field()"
});
formatter.result({
  "duration": 43631400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address()"
});
formatter.result({
  "duration": 53451200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 38874899,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Cc_Type()"
});
formatter.result({
  "duration": 54232399,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Expiry_Month_Of_Cc()"
});
formatter.result({
  "duration": 51383900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_the_Expiry_Year_Of_CC()"
});
formatter.result({
  "duration": 57893199,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Cvv_Number()"
});
formatter.result({
  "duration": 37324301,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_BookNow_Button_And_Navigates_To_Confirmation_Page()"
});
formatter.result({
  "duration": 6042758501,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "user Click On Booked Itinerary Navigates To Bookings Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Booked_Itinerary_Navigates_To_Bookings_Page()"
});
formatter.result({
  "duration": 590575301,
  "status": "passed"
});
});