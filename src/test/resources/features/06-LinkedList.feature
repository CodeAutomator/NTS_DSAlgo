@LinkedListPage
Feature: Linked List page validation dsalgo

 # Scenario: The user is logged into DS Algo portal
    #Given user is on Signin of DS Algo portal
    #When user enters "NinjaTestSquad" and "adgn-stars"
    #And user clicks on login button
   # Then user redirected to Home Page of DsAlgo Portal

  Scenario: User should be able to navigate to LinkedList Data Structure Page
    Given User is on Home Page of DsAlgo Portal
    When User clicks on LinkedList Getstarted button
    Then User redirected to LinkedList Page

  Scenario: User navigated to Introduction page
    Given The user is on the Linked List page
    When The user clicks Introduction link
    Then The user move to Introduction of Linked List Page

  Scenario: User navigated to tryEditor page from Introduction page
    Given The user is on the Introduction Page
    When The user clicks Try Here button in the introduction page
    Then The user redirected to the tryEditor page of introduction page

  Scenario: User enters valid Python code and Presented with  Result
    Given User is on Try Editor Page of introduction page
    When User Enters "print('Hello Ninja Testers')" in the Editor of introduction page
    And clicks on Run Button of introduction page
    Then The User is Presented with result of introduction page
    
 

  Scenario: User navigated to creating linked list  page
    Given The user is on the Linked List page 
    When The user clicks creating linked list link
    Then The user move to Creating Linked LIst of Linked List Page

  Scenario: User navigated to tryEditor page  from Creating a Linked List page
    Given The user is on the Creating a Linked List of Linked List Page
    When  clicks Try Here button in the creation of linked listPage
    Then The user redirected to the tryEditor page of creating linked list Page


 
  Scenario: User gets error message by passing  invalid pyhton code for Creating a Linked List page
    Given User is on Try Editor Page of creating linked list page
    When The user Enter invalid python code "print Creating a Linked List" in creating linked list page
    And click on run button of Creating a Linked List page
    Then The user get the error message of Creating a Linked List page

  Scenario: User navigated to Types of linked list page
    Given The user is on the Linked List page 
    When The user clicks Types of Linked List link
    Then The user move to Types of Linked List of Linked List Page

  Scenario: User navigated to tryEditor page with Run button from Types of Linked List page
    Given The user is on the Types of Linked list Page
    When The user clicks TryHere button in the types of linkedlist page
    Then The user redirected to the tryEditor page of types of linked list page

  Scenario: User run the code in tryEditor with valid input for Types of Linked List page
    Given  User is on TryEditor Page of Types of Linked List
    When The user Enter valid python code "phrase = 'Ninja Testers'; print(phrase.replace('Ninja','Numpy Ninja'))" in types of linked list page
    And click on run button of Types of Linked List page
    Then The User is Presented with a Result of types of Linked List page
    
 

  Scenario: User navigated to Implementation linked list in python page
    Given The user is on the Linked List page
    When The user clicks Implement Linked List in Python link
    Then The user move to Implement Linked List in Python of Linked List Page

  Scenario: User navigated to tryEditor page with Run button from Implement Linked List in Python page
    Given The user is on the Implement Linked List in Python
    When The user clicks Try Here button in the implemented linked list in python page
    Then The user redirected to the tryEditor page of Implement Linked List in Python 

  Scenario: User enters valid Python code and Presented with  Result
    Given User is on Try Editor Page
    And User Enters  invalid python code "for index in range(4,10) :print(index)" in implementation link list in python
    And clicks on Run Button
    Then The user get the error message of implementation link list in python



  Scenario: User navigated to Traversal Page
    Given The user is on the Linked List page
    When The user clicks Traversal link
    Then The user move to Traversal of Linked List Page

  Scenario: User navigated to tryEditor page with Run button from Traversal page
    Given The user is on the Traversal Page
    When The user clicks Try Here button in the traversal page
    Then The user redirected to the tryEditor page of Traversal page 

  Scenario: User run the code in tryEditor with valid input for Traversal page
    Given The user is on Tryeditor page of traversal
    When The user Enter valid python code "numbers_grid = [[1,2,3],[4,5,6],[7,8,9],[10,11,12]]; print(numbers_grid[3][2])" in traversal page
    And click on run button of traversal page
    Then The user should get the Run output of traversal page

  

  Scenario: User navigated to Insertion page
    Given The user is on the Linked List page
    When The user clicks Insertion link
    Then The user move to Insertion of Linked List Page

  Scenario: User navigated to tryEditor page with Run button from Insertion page
    Given The user is on the Insertion Page
    When The user clicks Try Here button in the Insertion page
    Then The user redirected to the tryEditor page of Insertion

  Scenario: User run the code in tryEditor with valid input for Insertion page
    Given The user is on Tryeditor page of Insertion
    When The user Enter invalid python code "print('Insertion')" in insertion page
    And click on run button of insertion page
    Then The user get the error message of insertion page
    
 
  Scenario: User navigated to Deletion page
    Given The user is on the Linked List page
    When The user clicks Deletion link
    Then The user move to Deletion of Linked List Page

  Scenario: User navigated to tryEditor page with Run button from Deletion page
    Given The user is on the Deletion page
    When The user clicks Try Here button in the Deletion page
    Then The user redirected to the tryEditor page of Deletion

  Scenario: User run the code in tryEditor with valid input for Deletion page
    Given The user is on Tryeditor page of deletion
    When The user Enter valid python code "print('Deletion')" in deletion page
    And click on run button of deletion page
    Then The user should get the Run output deletion page

  

  Scenario: The user is validating Practice Questions page
    Given The user is on the Introduction Page
    When  User clicks on the Practice Questions
    Then User redirected to Practice Questions of Linked List Page