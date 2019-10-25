Feature: Free CRM Login Feature

#With Examples  we have to use Scenario Outline.
# Without Examples, we have to use Scenario.

Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When title of login page is Blaze Demo
# Data Driven without using examples keyword
#Then user enters "kunalmalviya@gmail.com" and "Holmes2010"
Then user enters "<username>" and "<password>"
Then User Clicks on Login Button
Then User in on Home Page
Then Close the Browser

Examples:
     | username               | password   |
     | kunalmalviya@gmail.com | password   |
   

