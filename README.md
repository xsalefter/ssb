# README

Run the application : `./mvnw spring-boot:run` (use mvnw.cmd if you use windows)
Test with these CURL commands:

```shell script
curl -X PUT --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{"userId": "001", "inputMethod": "JSON_FILE", "inputConnection": "Json file connection", "outputMethod": "AWS_S3", "outputConnection": "AWS S3 connection output"}' 'http://localhost:8080/api/users';echo;

curl -X PUT --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{"userId": "002", "inputMethod": "CHUNK", "inputConnection": "Chunk connection", "outputMethod": "POSTGRESQL", "outputConnection": "PostrgreSQL connection output"}' 'http://localhost:8080/api/users';echo;

curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{"userId": "002", "inputMethod": "CHUNK", "inputConnection": "Chunk connection input", "outputMethod": "POSTGRESQL", "outputConnection": "Postrgre SQL connection output"}' 'http://localhost:8080/api/users';echo;

curl -X DELETE --header 'Content-Type: application/json' --header 'Accept: application/json' 'http://localhost:8080/api/users/002';echo;
```