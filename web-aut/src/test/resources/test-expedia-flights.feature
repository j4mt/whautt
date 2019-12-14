@expedia-flights
Feature: Test expedia flights


  Background:
    Given I am on expedia com page
    And I click flights

  Scenario Outline: results page first row contains cost
    When I enter origin <fromCityAirport>
    And I enter destination <toCityAirport>
    And I enter from date <fromDate>
    And I enter to date <returnDateInDays>
    And I click num of passengers <adults> <children> <infants>
    And I click search
    Then the flight cost is verified in the first row

    Examples:
      | fromCityAirport | toCityAirport | fromDate | returnDateInDays | adults | children | infants |
      | London          | London        | today    | 3                | 2      | 0        | 0       |