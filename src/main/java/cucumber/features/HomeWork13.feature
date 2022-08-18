@TestCertificate
  Feature: Test Certificate

    Scenario Outline:
      When I open site "https://certificate.ithillel.ua/"
      And Enter certificate code "<certificate>"
      Then Check result
      Examples:
        | certificate |
        | 564748483   |
        | 09862956924 |
        | 9879483709  |
        | 68103593   |
