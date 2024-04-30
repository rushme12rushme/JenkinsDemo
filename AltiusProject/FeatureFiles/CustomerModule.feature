Feature: Customer Module
Scenario Outline: Create Customer
Given User should be present in homepage "actiTIME -  Enter Time-Track"
When He click on TasksTab
Then User should be present in Tasks List page "actiTIME -  Task List"
When he clicks on Add NewButton
And He clicks on New Customer button
Then Create New customer popup should be displayed
When He enters the customer name as "<cusname>"
And he enters the description as "<cusdesc>"
And he selects our company in the drop down
When he clicks on create customer button
Then customer should be created as "<cusname>"
Examples: 

|cusname|cusdesc|
|Smith|Smith Description|
|Johnson|Johnson Description|
|Williams|Williams Description|
|Brown|Brown Description|
|Jones|Jones Description|
|Miller|Miller Description|
|Davis|Davis Description|
|Garcia|Garcia Description|
|Rodriguez|Rodriguez Description|
|Wilson|Wilson Description|
