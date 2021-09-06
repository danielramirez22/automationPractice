@Account
Feature: User Creates an account

  @RegisterAccount
  Scenario Outline: User can create an account
    Given The user is on Homepage
    Then the user clicks on Sign in
    And user enters email
      | <Email> |
    And User Clicks create an account
    And User fills sign up form
      | <FirstName> | <LastName> | <Email> | <Pass> | <Company> | <AddressOne> | <AddressTwo> | <City> | <PostalCode> | <OtherInfo> | <HomePhone> | <MobilePhone> | <Alias> |
    And user clicks register
    Then the user is taken my account page
      | <ConfirmAccount> |

    Examples:
      | FirstName | LastName | Email                               | Pass      | Company  | AddressOne  | AddressTwo  | City     | PostalCode | OtherInfo | HomePhone | MobilePhone | Alias          | ConfirmAccount |
      | Daniel | Ramirez  | danieleonardo229@gmail.com | Daniel0496 | Choucair | Cr87a#32-81 | Cr87a#32-81 | Medellin | 33206      | Hiring    | 7748954   | 3005647895  | TestAutomation | MY ACCOUNT     |

  @LogInAccount
  Scenario Outline: user can log in account
    Given the user has a valid account
    Then the clicks on sign in
    And enters email
      | <Email> |
    And enters password
      | <Pass> |
    And clicks sign in
    Then the user is successfully logged in
      | <ConfirmAccount> |
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                            |
      | danielleonardo04@gmail.com  | Daniel0496 | MY ACCOUNT  |

  @PayProduct
  Scenario Outline: user select product
    Given add product to cart
    When  the click on preceed to checkout
    And  clic sign in
      | <Email> | <Pass> |
    Then go to Payment
      | <ConfirmAccount> |
    Examples:
      | Email                   | Pass      | ConfirmAccount                                                                            |
      | danielleonardo04@gmail.com  | Daniel0496 | Your order on My Store is complete.|


