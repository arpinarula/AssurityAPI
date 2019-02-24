# ASSURITY ASSIGNMENT
The provided project  validates API Values against a given Acceptance Criteria as a part of assessment for Assurity

The test is supposed to validate the following ACCEPTANCE CRITERIA:
Name = "Carbon credits"
CanRelist = true
The Promotions element with Name = "Gallery" 
has a Description that contains the text "2x larger image"\

#API URL:
https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

------------------------------------------
#CONTRIBUTOR: Arpi Narula
-----------------------------------------
#BUILT WITH: Maven

Dependency (Included in pom.xml)
JSON
TESTNG
SUREFIREPLUGIN

Prerequisite:
Java jdk 1.7+
Maven : apache-maven-3.6.0-bin   : https://maven.apache.org/download.cgi 
Any IDE (for viewing the code or modifying testng.xml or dependencies in pom.xml)

---------------------------------------------------------------------
#TEST CASE
Class : APITest
Test case Location: /AssurityAPI/src/test/java/apiTest/AssurityAPI/APITest.java

#PRE-SETUP
1. Download the latest Java JDK and set the JAVA_HOME Environment variable.
2. Download the latest Apache Maven, extract (unzip) it and place it in a folder.
3. Set $M2_HOME path Environment variable as the path of the apache maven folder location as in step 2
4. Set $PATH Environment variable as M2_HOME/bin path.
5. Open Terminal (in MAC) or Command Prompt (in Windows)
6. Go to the path where Apache Maven is present and enter "mvn -version" to check whether maven is successfully installed
7. Enter the setup command 'mvn eclipse:eclipse' if you want to run the Maven project from Eclipse

#RUNNING THE TEST:
1. Download the project from the GITHUB repository.
2. Place it in any folder.
3. Open Terminal (in MAC) or Command Prompt (in Windows)
4. Navigate to the Project folder inside the terminal where pom.xml is present.
5. enter the command : mvn test to run the script

#OUTPUT:
Test Results file: /Assurity_Assigment/test-output/index.html

-------
Note: testng.xml is included . Further test cases can be added and the run can be modified using testng.xml