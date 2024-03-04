@Registration
Feature: Digital Bank Registration Page

  Background:
    Given User navigates to Digital Bank signup page

  Scenario Outline: Positive Test Case. As a user, I want to successfully create Digital Bank account
    When User creates account with following fields with mocked email ans ssn
      | title   | firstName   | lastName   | gender   | dob   | ssn   | email   | password   | confirmPassword   | address   | locality   | region   | postalCode   | country   | homePhone   | mobilePhone   | workPhone   | termsCheckMark   |
      | <title> | <firstName> | <lastName> | <gender> | <dob> | <ssn> | <email> | <password> | <confirmPassword> | <address> | <locality> | <region> | <postalCode> | <country> | <homePhone> | <mobilePhone> | <workPhone> | <termsCheckMark> |

    Then User should be displayed with the message "Success Registration Successful. Please Login."
    Examples:
      | title | firstName | lastName | gender | dob        | ssn    | email  | password  | confirmPassword | address          | locality      | region | postalCode | country | homePhone     | mobilePhone   | workPhone     | termsCheckMark |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city | CA     | 94302      | US      | (547)392-5436 | (547)392-5436 | (547)392-5436 | true           |
      | Ms.   | Elena     | Muska    | F      | 11/11/1990 | random | random | Elena9999 | Elena9999       | 321 Duglus       | Pittsburgh    | PA     | 17654      | US      | (412)412-2112 | (412)412-2112 | (412)412-2112 | true           |

  @NegativeRegistrationCases
  Scenario Outline: Negative Test Case. As a Digital Bank Admin, I want to make sure users can not register without providing all valid data
    When User creates account with following fields with mocked email ans ssn
      | title   | firstName   | lastName   | gender   | dob   | ssn   | email   | password   | confirmPassword   | address   | locality   | region   | postalCode   | country   | homePhone   | mobilePhone   | workPhone   | termsCheckMark   |
      | <title> | <firstName> | <lastName> | <gender> | <dob> | <ssn> | <email> | <password> | <confirmPassword> | <address> | <locality> | <region> | <postalCode> | <country> | <homePhone> | <mobilePhone> | <workPhone> | <termsCheckMark> |
    Then The user should see the "<fieldWithError>" required field error message "<errorMessage>"

    Examples:
      | title | firstName | lastName | gender | dob        | ssn    | email  | password  | confirmPassword | address          | locality      | region | postalCode | country | homePhone     | mobilePhone   | workPhone     | termsCheckMark | fieldWithError  | errorMessage                                  |
      |       |           |          |        |            |        |        |           |                 |                  |               |        |            |         |               |               |               |                | title           | Please select an item in the list.            |
      | Mr.   |           |          |        |            |        |        |           |                 |                  |               |        |            |         |               |               |               |                | firstName       | Please fill out this field.                   |
      | Mr.   | Elon      |          |        |            |        |        |           |                 |                  |               |        |            |         |               |               |               |                | lastName        | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     |        |            |        |        |           |                 |                  |               |        |            |         |               |               |               |                | gender          | Please select one of these options.           |
      | Mr.   | Elon      | Musk     | M      |            |        |        |           |                 |                  |               |        |            |         |               |               |               |                | dob             | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12-12-1990 |        |        |           |                 |                  |               |        |            |         |               |               |               |                | dob             | Please match the requested format.            |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 |        |        |           |                 |                  |               |        |            |         |               |               |               |                | ssn             | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | 123211 |        |           |                 |                  |               |        |            |         |               |               |               |                | ssn             | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random |        |           |                 |                  |               |        |            |         |               |               |               |                | email           | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | Elon   |           |                 |                  |               |        |            |         |               |               |               |                | email           | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random |           |                 |                  |               |        |            |         |               |               |               |                | password        | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 |                 |                  |               |        |            |         |               |               |               |                | confirmPassword | Passwords Do Not Match                        |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       |                  |               |        |            |         |               |               |               |                | address         | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane |               |        |            |         |               |               |               |                | locality        | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city |        |            |         |               |               |               |                | region          | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city | CA     |            |         |               |               |               |                | postalCode      | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city | CA     | 94302      |         |               |               |               |                | country         | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city | CA     | 94302      | US      |               |               |               |                | homePhone       | Please fill out this field.                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city | CA     | 94302      | US      | (547)392-5436 |               |               |                | mobilePhone     |                    |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city | CA     | 94302      | US      | (547)392-5436 | (547)392-5436 |               |                | workPhone       |                   |
      | Mr.   | Elon      | Musk     | M      | 12/12/1990 | random | random | Email1228 | Email1228       | 123 Digital Lane | Internet city | CA     | 94302      | US      | (547)392-5436 | (547)392-5436 | (547)392-5436 |                | termsCheckMark  | Please check this box if you want to proceed. |

