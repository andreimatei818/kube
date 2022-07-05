FROM openjdk:11
COPY target/demo-0.0.1-SNAPSHOT.jar /home/target/app.jar

ENTRYPOINT java -jar /home/target/app.jar