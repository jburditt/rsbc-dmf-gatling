# rsbc-dmf-gatling
Gatling tests for RSBC DMF

# Prerequisites
Maven
JavaSDK
Metals VS code extension

# Setup
Reference: https://www.james-willett.com/gatling-vscode/
- Clone the repository https://github.com/jburditt/rsbc-dmf-gatling
- Install Java, you can verify with command `java -v`)
- Install VS code extensions
 - Open VS Code
 - navigate to Extensions and search for "Scala (Metals)"
 - Search and install extension "Maven for Java"

# How to run
mvn gatling:test

# Setup new project
- Add gatling archetype
 - open Command Pallette (View > Command Pallette) and select Maven: Update Maven Archetype Catalog
 - open Command Pallette and select "Maven: New Project" -> "more..." and then type "Gatling", then select "gatling-highcharts-maven-archetype", and finally select the latest version
- Navigate to extension "Metals"
 - VS code will prompt you to import new project, if not, select "Import Build" under "BUILD COMMANDS"
