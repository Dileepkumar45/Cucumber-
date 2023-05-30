Feature: Ebay Advanced Search page
@R2
Scenario: Ebay Logo on Advanced search page

Given I am Ebay Advanced Search Page
When I click on Ebay Logo
Then I am navigated to Ebay Home page

	@R21 @setCookies
  Scenario: Advanced search an item
    Given I am Ebay Advanced Search Page
    When I advanced search an item
    
    
      | keyword   | exclude     | min | max |
      | iPhone 11 | refurbished | 300 | 900 |