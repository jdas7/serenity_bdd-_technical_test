# language: en

Feature: falabella shopping cart
  In order to consult offers and make purchases.
  As a falabella user
  I want to have the option to view offers and make purchases through a shopping cart.

  @know-offers @automated
  Scenario: knowing offers
    Given Carlos is a falabella customer who enters the online store
    When he selects yes, I love the offers
    Then he sees the pop up indicating that he will receive the store's offers