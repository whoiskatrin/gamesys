Goal: 

Develop an automation program using Java and Cucumber-JVM that is executable using command line. Your submission must use Maven and include a README file with instructions on how to run the test(s) and the XML from the Response you received.

What to test:

Using the below API (GET call):

https://www.youtube.com/feeds/videos.xml?user=jackpotjoy

 

- Send the Request and Verify the Response code is 200

- Get the Response body and extract the following data from the XML feed and display in user friendly format:

- Verify one of the authors is called “The Batman” (this should fail but only display the failure once at the end of the run).

- Edit the URI and make the Request fail to achieve: 404 status code and 400 status code



HOW TO RUN:

1. Open the command prompt and cd until the project root directory.


2. First, let’s run all the Cucumber Scenarios from the command prompt. 
Since it’s a Maven project and we have added Cucumber in test scope dependency and all features are also added in src/test packages, run the following command in the command prompt: mvn test