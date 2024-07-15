# Code coverage with Java and Sonarcloud

mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

mvn package

java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App

mvn test

We use https://github.com/actions/upload-artifact to upload our newly created Jar to artifacts of the current GitHub repository
