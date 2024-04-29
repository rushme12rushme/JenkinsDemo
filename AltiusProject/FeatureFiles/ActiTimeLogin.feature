Feature: Login Feature
Scenario Outline: Login to actitime with multiple data
Given User should enter the URL as "http://localhost/login.do" in browser
When  He enters "<username>" and "<password>" in the textbox
And  He clicks on login button
Then Homepage must be displayed

Examples:
|username|password|
|admin|manager|
|1234|5678|
|Modi|Rahul|