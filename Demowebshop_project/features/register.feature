Feature: Testing webshop application
Scenario: Login to the application
Given open application and click on login link
When the user enters the valid username and valid password and click submit
Then the system navigates to HOMEpage