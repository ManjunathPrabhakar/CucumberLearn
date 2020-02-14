Feature: Google Search

  @websearch
  Scenario Outline: Search a keyword and get the contents
    Given internet is available
    Then Choose search engine "<searchengine>"
    And search a keyword "<keyword>"
    And capture some info from its wikipedia
    And Exit

    Examples:
      | searchengine | keyword   |
      | google       | jetbrains |
      | bing         | intellij  |