FROM openjdk:11
ADD target/architecture-software.jar architecture-software.jar
ENTRYPOINT ["java", "-jar","architecture-software.jar"]
