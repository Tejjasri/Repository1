Feature:Test the KSRTC application
@SmokeTest
Scenario:Test the registration page with valied credentials
Given Open chrome browser and url of the application alonge with credentials1
When I Enter Username , fullname , phonenumber and click on Add button
Then the registered should be Successfull

@RegressionTest
Scenario:Test the login page with valied credentials

Given Open chrome browser and url of the application2
When I Enter Username , password and click on login button
Then the login should be Successfull

@SmokeTest1
Scenario:Test the book a bus page with valied details
Given Open chrome browser and url of the application
When I Enter leaving From , Going To , Date of departure , Date of return and click on search bus button
Then Bus chart with timing page should be appeared.