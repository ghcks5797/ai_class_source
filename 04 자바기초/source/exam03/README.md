# JDBC API
- JAVA DataBase Connectivity Application Programming Interface
- 거의 대부분 인터페이스로 구성되어 있다.
- 자바의 모든 데이터베이스 연결 기술의 표준안
- 모든 데이터베이스 연결 기술 제공 업체는 이 표준에 따라서 통일된 방식으로 기술을 구현해야 한다.
- 설계 명세에 불과한 인터페이스 이므로 반드시 구현체가 따라온다.

## 의존성
MySQL Connector/J : JDBC API 구현체
lombok 

## DriverManager
- static Connection getConnection(String url, String user, String password)
- Connection 객체 (연결 객체) 를 생성하는 메서드