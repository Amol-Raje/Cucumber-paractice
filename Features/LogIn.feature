Feature: Login Feature

Scenario Outline: Successful Login with Valid entries

Given user navigates to the website "Facebook.com" 
When User Navigate to Login Page
And user logs in through Login Window by using "<Username>" in username field
And "<Password>" in password fieeld 
Then login must be successful.
   Examples:
   |Username|Password|
   |Usename1|Password1|
   |Usename2|Password2|
   |Usename3|Password3|
   
   