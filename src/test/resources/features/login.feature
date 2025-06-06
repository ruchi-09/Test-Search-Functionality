Feature: Login Functionality
Scenario: Successful login with valid credentials
  Given User launches the swag labs application
  When user enters Username "standard_user"
  And user enters Password "secret_sauce"
  And user enters the login button
  Then User should be redirected to the inventory page
  