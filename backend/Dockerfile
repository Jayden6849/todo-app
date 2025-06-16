# OpenJDK 21 기반 이미지
FROM openjdk:21-jdk-slim

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR 파일 복사 (Gradle에서 빌드한 jar 경로 기준)
COPY build/libs/todo-app-0.0.1-SNAPSHOT.jar app.jar

# 애플리케이션 포트
EXPOSE 8080

# 실행 명령어
ENTRYPOINT ["java", "-jar", "app.jar"]