#Camel Spring Boot Application Archetype

Author: [Omar Alles](https://github.com/oalles)

###DESCRIPTION
This Maven archetype generates a simple Spring Boot application supporting Camel as a
single module Maven project.
It is intended for small projects and demos.

###USING THE ARCHETYPE:
1. Install [Maven](http://maven.apache.org).

2. Generate the project from the archetype as follows:

	```bash
    mvn archetype:generate
        -DarchetypeGroupId=es.neivi
        -DarchetypeArtifactId=camel-boot-archetype-application
        -DarchetypeVersion=0.0.1-SNAPSHOT
        -DgroupId=your.company
        -DartifactId=project-name
        -Dversion=0.0.1-SNAPSHOT
        -Dpackaging=jar
    ```

3. Build the project. In the created project root, execute a Maven build as follows.
	```bash
        mvn install
    ```

4. Run generated project
	```bash
        mvn spring-boot:run
    ``` 