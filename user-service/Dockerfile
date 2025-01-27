# انتخاب تصویر پایه
FROM openjdk:17-jre-slim

# تنظیم دایرکتوری کاری
WORKDIR /app

# کپی کردن JAR فایل به داخل کانتینر
COPY target/user-service.jar user-service.jar

# پورت مورد نظر
EXPOSE 8082

# اجرای برنامه
CMD ["java", "-jar", "user-service.jar"]
