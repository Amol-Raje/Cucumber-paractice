
Feature: Uber Booking Feture

@Smoke
Scenario: Booking a cab Sedan
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Sangamner" and drop location "Banglore"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD
Then User can check trip details

@Smoke @Regression
Scenario: Booking a cab SUV
Given User wants to select a car type "SUV" from uber app
When User selects car "SUV" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking a cab Mini
Given User wants to select a car type "Mini" from uber app
When User selects car "Mini" and pick up point "Pune" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD