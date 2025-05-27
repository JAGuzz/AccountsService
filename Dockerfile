FROM openjdk:21-jdk-slim

LABEL author = "jaguzz"

COPY target/accounts-0.0.1-SNAPSHOT.jar accountsService.jar

ENTRYPOINT [ "java", "-jar", "accountsService.jar" ]