FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

RUN chmod +x mvnw

RUN ./mvnw dependency:go-offline -B

# Ahora copiamos el código fuente
COPY src src

RUN ./mvnw clean package -DskipTests -Dfile.encoding=UTF-8

EXPOSE 8080

CMD ["java", "-jar", "target/Conflict-Tracker-API-0.0.1-SNAPSHOT.jar"]