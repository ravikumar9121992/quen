set projectLocation=C:\eclipse-workspace\MAVEN_PROJECT
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testsuit.xml
