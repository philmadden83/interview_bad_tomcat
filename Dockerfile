FROM maven:3.5.2-jdk-7 as maven

COPY . .
RUN mvn clean install

FROM tomcat:8.5.28-jre7

ARG environment=development
ENV ENVIRONMENT=$environment

RUN rm -rf /usr/local/tomcat/webapps/ROOT

COPY --from=maven target/servlet-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
ADD docker/tomcat/server.xml /usr/local/tomcat/conf/server.xml
ADD docker/tomcat/setenv.sh /usr/local/tomcat/bin/setenv.sh

