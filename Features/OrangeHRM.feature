Feature: OrangeHRM Login

  Scenario: Logo presence on the OrangeHRM home page
    Given I launch the chrome browser
    When I open the OrangeHRM home page
    Then I verify that the logo is present on the page
    And close the browser
