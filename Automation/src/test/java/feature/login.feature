Feature: Application Login

Scenario: home page default login
Given user is on landing page
When user login into application with "jim" and "pswd"
Then home page is displayed
And something is displayed "true"

Scenario: home page default login
Given user is on landing page
When user login into application with "tim" and "pswd1"
Then home page is displayed
And something is displayed "false"