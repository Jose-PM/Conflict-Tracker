FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copiamos primero Maven wrapper y pom para cacheo de dependencias
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Dar permisos al wrapper
RUN chmod +x mvnw

# Descargar dependencias (mejora cache Docker)
RUN ./mvnw dependency:go-offline -B

# Ahora copiamos el código fuente
COPY src src

# Build limpio
RUN ./mvnw clean package -DskipTests -Dfile.encoding=UTF-8

EXPOSE 8080

CMD ["java", "-jar", "target/Conflict-Tracker-API-0.0.1-SNAPSHOT.jar"]