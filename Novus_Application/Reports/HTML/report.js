$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Create_Story.feature");
formatter.feature({
  "name": "To Publish A Story in NovusApplication",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To Create a story",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Have To Login The Novus Application",
  "rows": [
    {
      "cells": [
        "UserName",
        "abin.abraham@informa.com"
      ]
    },
    {
      "cells": [
        "Password",
        "D3lhi2023!"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Steps_Definition.user_Have_To_Login_The_Novus_Application(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Have To Navigate to The Author Tab",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Definition.user_Have_To_Navigate_to_The_Author_Tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Have To Create a New Story and Publish",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition.user_Have_To_Create_a_New_Story_and_Publish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Take The ScreenShot",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Definition.to_Take_The_ScreenShot()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:Login.feature");
formatter.feature({
  "name": "To Validate the Login Functionality Of Novus Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Login Function With Valid and Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Has To Launch IGM Application",
  "keyword": "Given "
});
formatter.step({
  "name": "User Has To Click Client Login button",
  "keyword": "When "
});
formatter.step({
  "name": "User Has To Enter Valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Has To Click The Signin button",
  "keyword": "And "
});
formatter.step({
  "name": "User Has To Verify Credential Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord"
      ]
    },
    {
      "cells": [
        "abin.abraham@informa.com",
        "D3lhi2023!"
      ]
    },
    {
      "cells": [
        "abin.abraham@informa.com",
        "D3lhi2222!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Login Function With Valid and Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Launch IGM Application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Launch_IGM_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Click Client Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Click_Client_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Enter Valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Enter_Valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Click The Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Click_The_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Verify Credential Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Verify_Credential_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Login Function With Valid and Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Launch IGM Application",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Launch_IGM_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Click Client Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Click_Client_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Enter Valid \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Enter_Valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Click The Signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Click_The_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Has To Verify Credential Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps_Definition.user_Has_To_Verify_Credential_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});