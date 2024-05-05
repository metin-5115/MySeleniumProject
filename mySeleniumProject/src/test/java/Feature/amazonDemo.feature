@recordDemo
Feature: Record Test

  @test2
  Scenario Outline: Go to amazon website and test record page
    Given go to record page
    And write "<name>" name field
    And Write "<email>" email field
    And write "<password>" password field
    And write "<passwordCheck>" passwordCheck field
    And click legalMarketingCheckBox
    When click record button
    Examples:
      | name | email | password | passwordCheck |
      | metin Tunçbilek | badat77691@devswp.com | 123456789 | 123456789 |


  @test2
  Scenario Outline:Go to amazon website and test invalid email
    Given go to record page
    And write "<name>" name field
    And Write invalid "<email>" email field
    And write "<password>" password field
    And write "<passwordCheck>" passwordCheck field
    And click legalMarketingCheckBox
    When click record button
    Then check the error email message
    Examples:
      | name | email | password | passwordCheck |
      | metin Tunçbilek | badat77691@devswp.hazır | 123456789 | 123456789 |


  @test3
  Scenario Outline:Go to amazon website and test invalid email
    Given go to record page
    And write "<name>" name field
    And Write "<email>" email field
    And write invalid "<password>" password field
    And write "<passwordCheck>" passwordCheck field
    And click legalMarketingCheckBox
    When click record button
    Then check the error password message
    Examples:
      | name | email | password | passwordCheck |
      | metin Tunçbilek | badat77691@devswp.com | 12345 | 12345 |

  @test4
  Scenario Outline:Go to amazon website and test invalid email
    Given go to record page
    And write "<name>" name field
    And Write recorded  "<email>" recorded email field
    And write "<password>" password field
    And write "<passwordCheck>" passwordCheck field
    And click legalMarketingCheckBox
    When click record button
    Then check the error recorded email message
    Examples:
      | name | email | password | passwordCheck |
      | metin Tunçbilek | tuncbilek.51metin@gmail.com | 123456789 | 123456789 |

  @test5
  Scenario Outline:Go to amazon website and test invalid email
    Given go to record page
    And write "<name>" name field
    And Write "<email>" email field
    And write "<password>" password field
    And write other "<passwordCheck>" passwordCheck field
    And click legalMarketingCheckBox
    When click record button
    Then check the error different password message
    Examples:
      | name | email | password | passwordCheck |
      | metin Tunçbilek | badat77691@devswp.com | 123456789 | 1234567890 |
