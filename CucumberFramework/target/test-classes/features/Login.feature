
@Login
Feature: Login to the application
  User login to the application successful with valid credentials

  @Login_001
  Scenario: Login to the application with the valid credentials   
    
    Given Launched the browser and open the login page   
    When Login to the application with username "puratesta" and password "Puratesta1$"    
    Then Verify the login is success
    
    

  
