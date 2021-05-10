$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/K D Pandey/eclipse-workspace/OnlineCucumberSeleniumTest/src/main/java/Features/Register.feature");
formatter.feature({
  "line": 2,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_on_the_homepage()"
});
formatter.result({
  "duration": 12459471300,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 6828488400,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Create a New User",
  "description": "",
  "id": "registration;create-a-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user fills registration email textbox with \"email_address\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user clicks create an account button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters the following details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Password",
        "Address",
        "City",
        "Zip Code",
        "MobilePhone",
        "AddressAlias"
      ],
      "line": 12
    },
    {
      "cells": [
        "Chitrali",
        "Sharma",
        "Inquiry@1234",
        "Balagere, Varthur",
        "Bangalore",
        "00000",
        "8105839545",
        "My Address"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks register button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "validate user firstname and lastname is displayed in dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user click on signout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "email_address",
      "offset": 44
    }
  ],
  "location": "Register.user_fills_with(String)"
});
formatter.result({
  "duration": 4442391200,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_clicks()"
});
formatter.result({
  "duration": 2148942700,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_enters_the_following_details(DataTable)"
});
formatter.result({
  "duration": 3513534300,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_click_register_button()"
});
formatter.result({
  "duration": 5326992100,
  "status": "passed"
});
formatter.match({
  "location": "Register.validate_user_firstname_lastname()"
});
formatter.result({
  "duration": 68675500,
  "status": "passed"
});
formatter.match({
  "location": "Register.click_signout()"
});
formatter.result({
  "duration": 5100472200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Login with user credentials",
  "description": "",
  "id": "registration;login-with-user-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user enter \"\u003cemail_address\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on Signin button.",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user move cursor over Womens link and click on sub menu T-shirts",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Get Name/Text of the first product displayed on the page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click on Add product to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Proceed to the checkout page and continue till payments",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Validate on the payments page if the product details are correct.",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "registration;login-with-user-credentials;",
  "rows": [
    {
      "cells": [
        "email_address",
        "password"
      ],
      "line": 30,
      "id": "registration;login-with-user-credentials;;1"
    },
    {
      "cells": [
        "firstname766@gmail.com",
        "Inquiry@1234"
      ],
      "line": 31,
      "id": "registration;login-with-user-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_on_the_homepage()"
});
formatter.result({
  "duration": 9713814000,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_clicks_on_Sign_in_button()"
});
formatter.result({
  "duration": 4806916400,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Login with user credentials",
  "description": "",
  "id": "registration;login-with-user-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user enter \"firstname766@gmail.com\" and \"Inquiry@1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user click on Signin button.",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user move cursor over Womens link and click on sub menu T-shirts",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Get Name/Text of the first product displayed on the page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "click on Add product to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Proceed to the checkout page and continue till payments",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Validate on the payments page if the product details are correct.",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "firstname766@gmail.com",
      "offset": 12
    },
    {
      "val": "Inquiry@1234",
      "offset": 41
    }
  ],
  "location": "Register.user_enter_email_password(String,String)"
});
formatter.result({
  "duration": 911580900,
  "status": "passed"
});
formatter.match({
  "location": "Register.click_signin_button()"
});
formatter.result({
  "duration": 3672474400,
  "status": "passed"
});
formatter.match({
  "location": "Register.move_cursor_womens_link_click_Tshirts()"
});
formatter.result({
  "duration": 5418426200,
  "status": "passed"
});
formatter.match({
  "location": "Register.get_product_details()"
});
formatter.result({
  "duration": 2352033200,
  "status": "passed"
});
formatter.match({
  "location": "Register.add_product_to_cart()"
});
formatter.result({
  "duration": 12422408900,
  "status": "passed"
});
formatter.match({
  "location": "Register.proceed_checkout_continue_payment()"
});
formatter.result({
  "duration": 13751921800,
  "status": "passed"
});
formatter.match({
  "location": "Register.validate_payments_page_product_details_correct()"
});
formatter.result({
  "duration": 5573821700,
  "status": "passed"
});
});