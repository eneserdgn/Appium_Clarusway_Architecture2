Feature: Man Women Page

  Scenario: Check Components
    Given user is on the Man Woman Page
    Then should see Image on Man Woman Page
    Then should see Close Button on Man Woman Page
    Then should see Text: "Sana en uygun ürünleri sunabilmemiz için bize yardımcı olur musun?" on Man Woman Page
    Then should see Man Button: "ERKEK" on Man Woman Page
    Then should see Woman Button: "KADIN" on Man Woman Page

  Scenario: Check Man Button Navigate to Offer Page
    Given user is on the Man Woman Page
    When click Man Button on Man Woman Page
    Then should see the Offer Page

  Scenario: Check Woman Button Navigate to Offer Page
    Given user is on the Man Woman Page
    When click Woman Button on Man Woman Page
    Then should see the Offer Page

  Scenario: Check Close Button Navigate to Home Page
    Given user is on the Man Woman Page
    When click Close Button on Man Woman Page
    Then should see the Home Page

