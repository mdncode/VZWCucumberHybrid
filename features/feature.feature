Feature: VZWCucumberHybrid

#@Step123
#Scenario: Negative Login
#Given 	loginPageExists
#When 	enterWrongLogin
#Then 	verifyLoginScreenshotIfFailed
#
#
#@Step4
#Scenario: Positive Login with Dynamic Xpath
#Given 	loginPageExists4
#Then 	enterCorrectLogin
#Then 	verifyLoginScreenshotIfFailed4
#
#
#@Step456
#Scenario: Login and Go to Smartphones
#Given 	loginPageExists456
#When 	enterCorrectLogin456
#When 	gotoWireless
#And 	selectSmartphones
#And 	verifyResult456

@Step789
Scenario: Select SamsungS10+
Given 	smartphonesPageExists
When 	selectGalaxy10SPlus
And 	pickColor
And 	addtoCart
Then 	verifyResult789
