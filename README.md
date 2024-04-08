# rsbc-dmf-gatling
Gatling tests for RSBC DMF

# Prerequisites
Maven
JavaSDK
Metals VS code extension

# References
Setup: https://www.james-willett.com/gatling-vscode/
Docs: https://docs.gatling.io/
Gatling Github: https://github.com/gatling/gatling

# Setup
This will setup using Maven and Scala but there are other combinations e.g. sbt, Kotlin, Java
- Clone the repository https://github.com/jburditt/rsbc-dmf-gatling
- Install Java, you can verify with command `java -v`
- Install Scala, you can verify with command `scale -version`
- Install Maven, you can verify with command `mvn -v`. On Windows 11, add the "bin" folder to the environment variables
- Install VS code extensions
 - Open VS Code
 - navigate to Extensions and search for "Scala (Metals)"
 - Search and install extension "Maven for Java"

# How to run
- Run all `mvn gatling:test`
- Run test `gatling:test -Dgatling.simulationClass=computerdatabase.BasicSimulation`

# Setup new project
- Add gatling archetype
 - open Command Pallette (View > Command Pallette) and select Maven: Update Maven Archetype Catalog
 - open Command Pallette and select "Maven: New Project" -> "more..." and then type "Gatling", then select "gatling-highcharts-maven-archetype", and finally select the latest version
 - NOTE below steps assume you entered project "test" but you can replace with your own project name
- Navigate to extension "Metals"
 - VS code will prompt you to import new project, if not, select "Import Build" under "BUILD COMMANDS"
 - Add a file to "test/src/scala", see Gatling documentation for examples or use the example in the reference url above
