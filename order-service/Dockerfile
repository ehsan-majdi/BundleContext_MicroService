# انتخاب تصویر پایه
FROM openjdk:17-jre-slim

# تنظیم دایرکتوری کاری
WORKDIR /app

# کپی کردن JAR فایل به داخل کانتینر
COPY target/order-service.jar order-service.jar

# پورت مورد نظر
EXPOSE 8083

# اجرای برنامه
CMD ["java", "-jar", "order-service.jar"]
