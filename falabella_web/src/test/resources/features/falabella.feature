# language: en

Feature: falabella shopping cart
  In order to consult offers and make purchases.
  As a falabella user
  I want to have the option to view offers and make purchases through a shopping cart.

  #manual
  @know-offers @manual
  Scenario: knowing offers
    Given Carlos is a falabella customer who enters the online store
    When he selects yes, I love the offers
    Then he sees the pop up indicating that he will receive the store's offers

  @know-offers @automated
  Scenario: Add product to shopping cart
    Given Carlos is a falabella customer who wants to make a purchase
    When he adds a product to the shopping cart
    And makes the purchase request
    Then he will be able to see the summary of his order