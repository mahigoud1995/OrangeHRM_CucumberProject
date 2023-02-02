#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Page feature

Scenario: Validate Page Title
	Given user Open "Chrome" browser and enter url
	Then user should navigates to the LoginPage 
	And page Title should be "OrangeHRM"

Scenario: validate user login
	Given user Open "Chrome" browser and enter url
	When user enter valid "username" and valid "password" and click on login
	Then user should navigates to the DashBoard page
	And DashBoard page title should be "OrangeHRM"
	
Scenario: validate OrangeHRM logo
	Given user Open "Chrome" browser and enter url
	Then OrangeHRM logo should displayed
	
Scenario: validate forget password link
	Given user Open "Chrome" browser and enter url
	When user click on forgerPassword link 
	Then User should navigates to the Forget Password page
	
Scenario: validate OrangeHRM, Inc link
	Given user Open "Chrome" browser and enter url
	When user click on OrangeHRM,Inc link
	Then it should open new window and user should navigate to "OrangeHRM HR Software" Page
	
	
	
	
	
	
	
	