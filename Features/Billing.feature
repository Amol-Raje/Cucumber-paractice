Feature: Calculate billing amount

Scenario Outline: billing amount
  Given User is on billing page
  When User enters billing amount "<Billingamount>"
  When User enters tax amount "<taxamount>"
  And User clicks on calculate btn
  Then it will give the final amount "<finalamount>"
  
    Examples:
    |Billingamount|taxamount|finalamount|
    |1000|20|1020|
    |500|10|510|
    |100|5.5|105.5|
