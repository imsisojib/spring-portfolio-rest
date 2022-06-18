<div id="top"></div>

<!--
Used Template: https://raw.githubusercontent.com/othneildrew/Best-README-Template/master/README.md
-->

<!-- ABOUT THE PROJECT -->
## Spring-Portfolio-Rest

This is self learning and practicing project for Java Spring Boot. The main focus will be on REST API's.

Topics will be covered here:
* Project Initiate
* Handling Controllers, Mapping
* Handling Services, Repositories
* Postgresql, MySQL Database
* Handling JWT Token
* Handling API Headers



### Built With

* [Spring Boot](https://start.spring.io/)
* [Heroku](https://heroku.com/)



<!-- GETTING STARTED -->
## Getting Started


### Prerequisites

To start coding you may need an IDE, along side your pc need to be compatible with Java Environment.
* Install JDK (in this prject Java 11 Used)
* Intellij/STS/Eclipse (in this project Intellij Ultimate Used)
* Github Account
* Heroku Account

### Project Initiate

In this project I've created a new project from Spring Boot website. You may also create a new maven project from your IDE manually too.

1. Go to [https://start.spring.io/](https://start.spring.io/)
2. Select Maven Project
3. Select Java Langage
4. Select Spring Boot Version (used 2.7.0)
5. Provide Project Metadata: (used as below)<br>
    Group: com.imsisojib<br>
    Artifact: portfolio<br>
    Name: portfolio<br>
    Package Name: com.imsisojib.portfolio
    Packaging: Jar
    Java: 11
6. Add Following Dependencies: <br>
    Spring Web<br>
    Spring Data JPA<br>
    PostgreSQL Driver (used)<br>
7. Now Generate and Download the zip file.

## Open Project with IDE

Unzip the downloaded project and import the project ast Maven project in IDE. Wait until project building. Make sure you have internet connection ON. Cause maven will download files to setup the project. 

Project Folder Structure will discuss later.


## Usages of Annotations
```$xslt
@Controller ----> use to annotate Classes as Controller
@RestController ---> use to annotate Classes as dedicated RestController
@Service ---> use to annotate Classes as Service
@Repository ---> use to annotate Classes as Repository
@Entity ---> use to annotate Classes as Database Table
@AutoWired ---> use to initialize any object that is mentioned as Service/Repository. It acutally handled by framework to initiaze specific Class object.
```

## Sudo: Framework Working System
```$xslt
Any request get/post/put etc are at first handled by Controller class.

Then Controller class hit/calls Service classes to fetch data or do some task.

Then Service class calls Repository classess to fetch/write some data to Database. Repository class uses Entity classes as Database Table to CRUD operations.
```

## Connect Postgresql Database
- Login to Heroku
- Create New App
- Go to resouce
- From Add-on add Heroku Postgresql database to project
- After database attached to project, open database credentials tab and add the required credentials in `application.properties` as below:
```$xslt
spring.datasource.url=jdbc:postgresql://hostname/databasename
spring.datasource.username=username
spring.datasource.password=password
spring.jpa.show-sql=true

## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update
```
- Whenever new table is used in project which is empty, that table will be created when project will run

## Deploy
- To deploy follow Heroku deploy instructions in already created app
- Or, push project to your github
- Then connect github in heroku
- Then select repository in heroku to deploy


## Keep Going
- continue learning