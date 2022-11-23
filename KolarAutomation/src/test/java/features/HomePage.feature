
@Home
Feature: Home Page of GreenKart
  User is able to navigate and validate home page componantes

  @Home_01
  Scenario: User is able to search the product
    Given Launch the wepage
    When Search the product "Tomato"
    Then Verify the product is diplayed
    When Search the product from offer page "Tomato"
    Then Verify the product is displayed


 

