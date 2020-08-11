# Demo project

## [Open API Documents](https://springdoc.org/)
* http://localhost:8080/swagger-ui.html
* http://localhost:8080/v3/api-docs/

Config in file `build.gradle`
```
// Swagger
implementation 'org.springdoc:springdoc-openapi-ui:1.4.4'
```
![image](https://github.com/up1/demo-springboot-swagger-mongo/blob/master/sample-api.png)

## Working with MongoDB
* [Spring Data Mongo](https://docs.spring.io/spring-data/mongodb/docs/3.0.2.RELEASE/reference/html/#mongo-template)

Config in file `build.gradle`
```
implementation 'org.springframework.boot:spring-boot-starter-data-mongodb'
```
Custom configuration of Mongo Server
```
@Configuration
public class MongoConfig {
    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create("mongodb://128.199.225.70:27017");
    }

    public @Bean
    MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "demo");
    }
}
```

Manage data in Mongo Server with MongoRepository interface
```
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<User, String> {
}
```
