FROM openjdk:11
VOLUME /tmp
RUN mkdir -p /opt/api/
COPY target/*.jar /opt/api/app.jar
ENTRYPOINT ["java","-Dserver.port=8080", "-jar","/opt/api/app.jar"]