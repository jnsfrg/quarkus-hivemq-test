# Quarkus HiveMq client Extension

## To Use via local Maven Repo
1. create a folder to be used als maven repo
2. ``mvn install``
3. in ./runtime run : 

```bash
mvn deploy:deploy-file -Durl=<Path to local maven repo folder created in 1.> -Dfile=pom.xml -Dpackaging=jar -DgroupId=org.test -DartifactId=quarkus-hivemq-parent -Dversion=1.0-SNAPSHOT
```     
4. in your maven project: 
  - add the repo to your pom file 
    ```xml
    <repositories>
         <repository>
             <id>local-repo</id>
             <name>Example Repository</name>
             <url>repo_path</url>
         </repository>
     </repositories>
    ```
- add the quarkus extension as dependency
    ```xml
        <dependency>
            <groupId>org.test</groupId>
            <artifactId>quarkus-hivemq</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    ```
