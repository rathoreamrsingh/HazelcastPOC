FROM openjdk:12-jdk-alpine
COPY hazelcast-0.0.1-SNAPSHOT.jar hazelcast-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","hazelcast-0.0.1-SNAPSHOT.jar"]