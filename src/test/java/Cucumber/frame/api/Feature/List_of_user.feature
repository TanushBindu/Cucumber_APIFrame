Feature: List of user

  Scenario: Validate the list of user API
    Given user enters the base uri
     When user calls "List_of_user" Endpoint with GET HTTP request
     Then use should get the response
      And user should get the status code as 200
      
   Scenario: Validate the Single user API
    Given user enters the base uri
     When user calls "Single_user" Endpoint with GET HTTP request
     Then use should get the response
      And user should get the status code as 200
      
      Scenario: Validate the SINGLE_USER_NOT_FOUND API
    Given user enters the base uri
     When user calls "SINGLE_USER_NOT_FOUND" Endpoint with GET HTTP request
     Then use should get the response
      And user should get the status code as 404
      
      Scenario: Validate the LIST_RESOURCE API
    Given user enters the base uri
     When user calls "LIST_RESOURCE" Endpoint with GET HTTP request
     Then use should get the response
      And user should get the status code as 200