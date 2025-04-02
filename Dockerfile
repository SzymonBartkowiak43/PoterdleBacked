# Stage 1: Build
FROM eclipse-temurin:21-jdk-jammy AS builder
WORKDIR /build
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline
COPY src ./src
RUN ./mvnw clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:21-jre-jammy
WORKDIR /opt
COPY --from=builder /build/target/HaryPo*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]