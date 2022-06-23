
@Form
Feature: Fill the practice form
Background:
    Given Launched the browser and open the login page   
    When Login to the application with username "puratesta" and password "Puratesta1$"    
    Then Verify the login is success
  

  @Form_001
  Scenario: Title of your scenario
  Then Verify the login is success1
  Given Navigate to the practice form
  When Enter the firstname "nandi" and lastname "circle"
  And Enter the emailid "nandi@gmail.com"
  Then Verify the successfully filled1
  
  
  
  
  
 

  
