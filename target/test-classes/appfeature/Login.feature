Feature: Profile functionality validation

Background:
Given I have logged into the application

Scenario: Addition of profile
When I click on add profile button
Then profile should get added

Scenario: Updation of profile
When I click on edit profile button
And I modify the data
Then profile should get updated

Scenario: Deletion of profile
When I click on delete profile button
Then Profile should get deleted