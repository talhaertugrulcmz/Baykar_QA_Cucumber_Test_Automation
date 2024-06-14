
Feature: BaykarTech Language Test

  Scenario: Baykar Language Kontrolu
    Given Baykar Web Sitesine Git
    When HeaderBarda bulunan Language sekmesine tikla
    Then Sayfada Dil Degisimi Oldugunu Kontrol Et

