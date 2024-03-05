FROM maven:latest
WORKDIR /FarToCel
COPY pom.xml /FarToCel
COPY . /FarToCel/
RUN mvn package
CMD ["java", "-jar", "target/FarToCel.jar"]
ENTRYPOINT ["java", "-jar", "target/FarToCel.jar"]

