FROM openjdk:11
ADD target/architecture_software.jar architecture_software.jar
ENTRYPOINT ["java", "-jar","architecture_software.jar"]
