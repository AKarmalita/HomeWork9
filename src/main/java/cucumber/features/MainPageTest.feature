@MainPageFeature
Feature: MainPageTest

  Scenario: Test text description
    When I open site "https://dnipro.ithillel.ua/"
    Then text description must equals "Вдосконалюйся!"

  Scenario: Test city buttons titles
    When I open site "https://dnipro.ithillel.ua/"
    Then Check titles on buttons
      | Name   |
      | Київ   |
      | Одеса  |
      | Дніпро |

