Feature: Valid user login

Scenario: valid user login to account



Given User Enter Id and Password

Then User is able to login

And user is on Online Banking console



Scenario: Get quote on new car



Given User is no geico.com

When  Enter zip and start quote

Then Customer enter name and dob and address

And user can add car info and ownwership

Then  user enters driving habits

And user slects days of driving and miles

Then user verfies Annual Milleage and go next

And verify personal info