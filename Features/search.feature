
Feature: Amazon Search

@Smoke
Scenario: Search a Product Apple Macbook Pro
Given I have a search field om Amazon page
When I search for a product with name "Apple Macbook Pro" and price 1000
Then Product with name "Apple MacBook Pro" should be displayed

@Regression
Scenario: Search a Product Apple Macbook air
Given I have a search field om Amazon page
When I search for a product with name "Apple Macbook Air" and price 1200
Then Product with name "Apple MacBook Air" should be displayed

