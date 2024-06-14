Feature: Baykar Navbar Testi

  Scenario: Baykar Navbar Kontrol Testi
    Given Baykar Sitesine Git
    When HeaderBarda bulunan Tüm Navbar sekmelerine tikla
    Then Sayfada Tüm Navbarlara Tiklanabildigini Kontrol Et

