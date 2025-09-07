Feature: Validating Place API's

Scenario: Verify if Place is being successfully added using AddPlaceAPI
Given Add Place Payload
When user calls "AddPlaceAPI" with Post http request
Then the API call got success with status code 200
And "status" is response body is "OK"
And "scope" in response body is "app"
And "scope" in response body is "app1"
And "scope" in response body is "app2"
And "scope" in response body is "app3"
And "scope" in response body is "app4"
And "scope" in response body is "app5"
And "scope" in response body is "app5"
And "scope" in response body is "app6"
And "scope" in response body is "app7"
And "scope" in response body is "app8"
And "scope" in response body is "app9"
And "scope" in response body is "app10"
And "scope" in response body is "app611"
And "scope" in response body is "app12"
And "scope" in response body is "app13"
And "scope" in response body is "app14"