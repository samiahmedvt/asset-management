FROM eclipse-temurin:11-jdk-jammy as build
WORKDIR /workspace/app

COPY * .

RUN ./gradlew clean test bootJar

FROM eclipse-temurin:11-jre-jammy
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target/dependency
COPY --from=build /workspace/app/build/libs/collibra-interview-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]