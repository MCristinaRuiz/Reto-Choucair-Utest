Feature: Create a new user
  As an unregistered user
  I want to create an account
  To join the utest tester community

  @UserCreation
  Scenario Outline: Successful user creation
    Given Cristina open the page Utest
    When she register with valid data
      | computer    | version    | language   | mobile   | model   | system   |
      | <computer>  | <version>  | <language> | <mobile> | <model> | <system> |
    Then the client can see information on how to get started with uTest

    Examples:
      | computer  | version          | language | mobile | model         | system        |
      | Windows   | Windows 11 Home  | Spanish  | Apple  | iPhone 13 Pro | iOS 15.6 Beta |

