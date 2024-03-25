Feature: Login  
 Scenario: Successful Login with  Valid Credentials
  Given User launch Chrome browser
  When User Opens Url "http://admin-demo.nopcommerce.com/login"
  And User enters Email and Password from Excel file at index 1
  And Click on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  When User click on Log out link
  Then Page Title should be "Your store. Login"
  And close browser
