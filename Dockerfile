# Usamos una imagen oficial y ligera de Java 17 (ajústala si usas Java 21)
FROM eclipse-temurin:21-jdk-jammy

# Exponemos el puerto en el que corre Spring Boot por defecto
EXPOSE 8080

# Copiamos el archivo .jar que generó Maven en la etapa de Build
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]