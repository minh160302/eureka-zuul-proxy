FROM openjdk:8-jdk-alpine
EXPOSE 8762
VOLUME /tmp
ADD /build/libs/cloud-balancer-0.0.1-SNAPSHOT.jar cloud-balancer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cloud-balancer-0.0.1-SNAPSHOT.jar"]
