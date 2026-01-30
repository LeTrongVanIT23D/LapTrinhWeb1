# Stage 1: Build mã nguồn bằng Maven
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
# Copy toàn bộ code vào container
COPY . .
# Chạy lệnh build để tạo file .jar (bỏ qua chạy test để nhanh hơn)
RUN mvn clean package -DskipTests

# Stage 2: Chạy ứng dụng với môi trường JRE nhẹ hơn
FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
# Lấy file .jar vừa build được ở Stage 1 sang Stage 2
COPY --from=build /app/target/*.jar app.jar
# Mở cổng 8080 (cổng mặc định của Spring Boot)
EXPOSE 8080
# Lệnh khởi chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]