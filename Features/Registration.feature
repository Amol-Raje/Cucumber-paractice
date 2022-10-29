Feature: User Registration

Scenario: user registration with different data
 Given User is on registration page
 When User enters following user details
   | Amol | Dighe | Automation | amolraodighe@gmail.com | Swits | 99999999 |
   | sudh | kolhe | Automation | sudhraokolhe@gmail.com | Paris | 99999998 |
   | Aksh | khule | Automation | akshraokhule@gmail.com | Canad | 99999996 |
 Then User registration should be successful
 
 Scenario: user registration with different data with column 
 Given User is on registration page
 When User enters following user details with column
   | Name | last name| Dept | Email | Job Location | mob no. |
   | Amol | Dighe | Automation | amolraodighe@gmail.com | Swits | 99999999 |
   | sudh | kolhe | Automation | sudhraokolhe@gmail.com | Paris | 99999998 |
   | Aksh | khule | Automation | akshraokhule@gmail.com | Canad | 99999996 |
 Then User registration should be successful
   
   
   
   
   
   
   
   
   
   
   