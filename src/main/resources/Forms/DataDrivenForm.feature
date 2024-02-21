#Sample Feature Definition Template

  @tag1
Feature: Data Driven Testing for form
  @tag2
  Scenario Outline: Title of your scenario outline
    Given User opens the chrome browser and navigate to form website 
    When User is entering "<firstname>", "<lastname>","<email>"
    And  User is entering "<contactnumber>", "<message>"
    And 	users are clicking on submit button
    Then 	All the data entered successfully.
    Examples: 
      | firstname  | lastname     |   email      | contactnumber  | message  |
      | Archisman  | Mukhopadhyay | abc@gmail.com|    8956741253   | Hello    |
      | Priyam     | Sen     			|	fgm@gmail.com|    8985741253   | Hi Priyam|
      | Sudipto    | Bose     		|	fm12@gmail.co|    2536956975   |Hi Kolkata|
      | Priyam     | Sen     			|	fgm!$gmail.23|    8985741253   | Hi Priyam|
      | Priyam     | Sen     			|	fgm@gmail.com|    8985741253   | Hi Priyam|
