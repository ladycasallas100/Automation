@stories
  Feature: Automation
    @scenario1
    Scenario: Find the quantity of adidas shoes
      Given  the user wants to know how many adidas shoes are registered Ebay
      When the user filters by shoes and brand
      Then the result must be greater than two thousand