Feature: Amazon Order Page
 In order to check my order details 
 As a registerd user
 I want to specify the features of order deatils page 

 Background: 
   Given Launch the URL 
   Given user is on Amazon login page 
   When user enters username 
   When user enters password
   And user clicks on login button 
   Then user navigates to order page

 Scenario: Check Previous Order Details
   When user clicks on Order Link
   Then user checks the previous order details 
   
 Scenario: Check Open Order Details
   When user clicks on Open Orders Link
   Then user checks the Open order details
   
 Scenario: Check Cancelled Order Details
   When user clicks on Cancelled Orders Link
   Then user checks the cancelled order details