Feature: Free CRM Login Feature 

#With Examples  we have to use Scenario Outline.
# Without Examples, we have to use Scenario.

Scenario: Free CRM Login Test Scenario

	Given User is already on Login Page 
	When title of login page is Blaze Demo 
	# Data Driven without using examples keyword
	#Then user enters "kunalmalviya@gmail.com" and ""XXXXXXX""
	Then user enters username and password 
	    | username | password |
		| kunalmalviya@gmail.com | password   |
	Then User Clicks on Login Button 
	Then User in on Home Page 
	Then User click on the BlazeDemo Icon 
	Then User Selects Departure and Destination City 
	    | Departure | Destination |
		| Boston | Rome |
	Then User Clicks on Find Flights Button 
	Then User Selects the Flight 
	Then User Enters Mandatory Information 
	    | Name | Address | City | State | ZipCode | NameonCard |
		| Kunal Malviya  | PJ8 | PJ | Selangor | 46200 | Kunal Malviya |
		| Kunal Malviya1 | PJ8 | PJ | Selangor | 46201 | Kunal Malviya1 |
		| Kunal Malviya2 | PJ8 | PJ | Selangor | 46202 | Kunal Malviya2 |
		| Kunal Malviya3 | PJ8 | PJ | Selangor | 46203 | Kunal Malviya3 |
	Then User Clicks on Purchase Flight 
	Then User is on flight successful booked page 
	Then Close the Browser 
	
	
	
