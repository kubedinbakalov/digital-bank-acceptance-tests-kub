Feature: Change user first name in profile
 Background:
   Given the user is on the home page
   And  the user populates the username field with "AskarM@gmail.com"
   And the user populates the password field with "AskarM@gmail.com2"
   When the user clicks the sign-in button
   Then user should see user verify massage "Welcome Askar"
  Scenario: Positive first name change
    And user in photo click My Profile change firstName "Shone" click submit
    And user should see "Profile Updated Successfully."
    And user should see user verify massage "Welcome Shone"
    And user in photo click My Profile change firstName "Askar" click submit
    And user should see "Profile Updated Successfully."
    And user should see user verify massage "Welcome Askar"

    Scenario: Positive last name change
      And user in photo click My Profile change lastName "Dou" click submit
      And user should see "Profile Updated Successfully."
      And user should see lastName "Dou"
      And user in photo click My Profile change lastName "Musa" click submit
      And user should see "Profile Updated Successfully."
      And user should see lastName "Musa"

      Scenario: Positive address change
        And user in photo click My Profile change address "125 Douglas" click submit
        And user should see "Profile Updated Successfully."
        And user should see address "125 Douglas"
        And user in photo click My Profile change address "123 Digital Lane" click submit
        And user should see "Profile Updated Successfully."
        And user should see address "123 Digital Lane"

