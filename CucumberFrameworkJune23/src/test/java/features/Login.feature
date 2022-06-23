
@Login
Feature: Login to the application
  User login to the application successful with valid credentials

  @Login_001
  Scenario: Login to the application with the valid credentials   
    
    Given Launched the browser and open the login page   
    When Login to the application with username "puratesta" and password "Puratesta1$"    
    Then Verify the login is success
    
    @Login_002
  Scenario Outline: Login to the application with invalid credentials
   Given Launched the browser and open the login page
    When I enter username <username> in step
    And I check for the <password> in step
    Then Verify the login should be failed

    Examples: 
      | username  | password | 
      | name1 |     name1 | 
      | name2 |  _    | 
      |    _   |     name12 | 
      | ABCD |     abcd$#@# | 
      | 12345 |     abcdj | 
      | abcnnnnnnnnnnnnnnnnnnn |     name145 | 
      | name1 |     abbbbbbbbbbbbbbbbbbbbbbbbbbbbb | 
      | name2 |     name145 | 
      
    
    

  
