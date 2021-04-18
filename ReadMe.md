# Read Me First

In order to run this project you have maven to be installed.

This project is a testing project for the connections-statistics project. (alse in my Github account).

The project tests the REST API with TestNG and RestAssured frameworks.

In order to run this project - run the other project - instructions are in the sonnection-statistics readMe file.

When you have it running then open cmd in the main project folder (where the testng.xml is located)

and run: 


			mvn clean test -DsuiteXmlFile=testng.xml
			
			
You will see some messages and in the bottom lines:


			Tests run: 6, Failures: 0, Errors: 0, Skipped: 0


This project uses some of the TestNG functionality - as the parameter annotation and more -
We pass through the testng.xml - parameters for the tests to run.

In this projects the tests are valid only for input-3.json environment (see the REST API project for more details).

but it's easy to add more xmls to tests the other environments.


			
			
			