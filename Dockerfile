FROM openjdk:14.0.2

RUN mkdir /app

WORKDIR /app

ADD ./build/libs/katalogRSO-0.0.1-SNAPSHOT.jar /app

EXPOSE 8087

ENTRYPOINT ["java", "-jar", "katalogRSO-0.0.1-SNAPSHOT.jar"]
#CMD java -jar image-catalog-api-1.0.0-SNAPSHOT.jar