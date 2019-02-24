# AssurityAPI
Acceptance Criteria validation from API

Click AssurityAPI folder inside the AssurityAPI repository to view files

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
1. Click on "Clone or Download" inside Github repository
2.Click on "Download ZIP" to download the project "AssurityAPI-master.zip"
3. Unzip project : "AssurityAPI-master" will be displayed
4. Double Click AssurityAPI-master.
5. Right click AssurityAPI and copy the folder path (project folder path which contains pom.xml)
6. Open Terminal (in MAC) or Command Prompt (in Windows)
7. Navigate to the Project folder inside the terminal by typing: cd <AssurityAPI folder path as copied in step 5> and pressing ENTER Key
8. Inside the terminal enter : mvn test and click ENTER to run the script 

-------
Note: testng.xml is included . Further test cases can be added and the run can be modified using testng.xml

#OUTPUT

Apples-MacBook-Pro:AssurityAPI apple$ mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< apiTest:AssurityAPI >-------------------------
[INFO] Building AssurityAPI 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ AssurityAPI ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/apple/git/Assurity/AssurityAPI/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ AssurityAPI ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/apple/git/Assurity/AssurityAPI/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ AssurityAPI ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/apple/git/Assurity/AssurityAPI/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ AssurityAPI ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/apple/git/Assurity/AssurityAPI/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:3.0.0-M3:test (default-test) @ AssurityAPI ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestSuite
Response : {"CategoryId":6327,"Name":"Carbon credits","Path":"\/Business-farming-industry\/Carbon-credits","CanListAuctions":true,"CanListClassifieds":true,"CanRelist":true,"LegalNotice":"Compliance Declaration\u000aI confirm that these carbon credits are certified and registered with a carbon credits registry. ","DefaultDuration":14,"AllowedDurations":[2,3,4,5,6,7,10,14],"Fees":{"Bundle":15.0000,"EndDate":0.2500,"Feature":10.0000,"Gallery":2.0000,"Listing":29.0000,"Reserve":0.2500,"Subtitle":0.5500,"TenDays":0.2500,"ListingFeeTiers":[{"MinimumTierPrice":0,"FixedFee":29.00}],"SecondCategory":0.9900},"FreePhotoCount":20,"MaximumPhotoCount":20,"IsFreeToRelist":true,"Promotions":[{"Id":1,"Name":"Basic","Description":"Lowest position in category","Price":0.0000,"MinimumPhotoCount":0},{"Id":2,"Name":"Gallery","Description":"Good position in category \u000a2x larger image in desktop site search results","Price":2.0000,"OriginalPrice":2.0000,"MinimumPhotoCount":0},{"Id":3,"Name":"Feature","Description":"Better position in category \u000a4x larger image in desktop site search results","Price":10.0000,"OriginalPrice":10.0000,"Recommended":true,"MinimumPhotoCount":0},{"Id":4,"Name":"Feature Combo","Description":"Best position in category \u000aIncludes benefits of Feature \u000aHighlights listing in search results","Price":15.0000,"OriginalPrice":15.0000,"MinimumPhotoCount":0}],"EmbeddedContentOptions":[],"MaximumTitleLength":80,"AreaOfBusiness":1,"DefaultRelistDuration":7}
ACCEPTANCE CRITERIA 1 PASS: GIVEN  Name:=Carbon credits
ACCEPTANCE CRITERIA 2 PASS: GIVEN  CanRelist:= true
ACCEPTANCE CRITERIA 3 PASS WHEN 'Promotion Element Name'=Gallery THEN Description: Good position in category 
2x larger image in desktop site search results
 API TEST PASS 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.852 s - in TestSuite
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.906 s
[INFO] Finished at: 2019-02-24T18:34:41+13:00
[INFO] ------------------------------------------------------------------------
