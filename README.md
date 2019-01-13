# Spring MVC Boilerplate

[![Build Status](https://travis-ci.org/RyanFleck/Spring-MVC-Boilerplate.svg?branch=master)](https://travis-ci.org/RyanFleck/Spring-MVC-Boilerplate)

Spring MVC Skeleton with Unit Tests, CI and a Heroku Container deployment.

**ToDo:**

- Research/Add robust MVC BP.
- Choose and implement View library.
- Improve Unit Testing BP.
- Add Bootstrap to View.
- Organize Scripts and Styles.

**Done:**

- Init Git project.
- Add Maven `pom.xml` and Spring, JUnit packages.
- Ensure simple Spring app can boot.
- Ensure simple JUnit tests can run.
- Add Travis CI.
- Deploy to Heroku container.

**Resources:**

1. <https://spring.io/guides/gs/serving-web-content/>
1. <https://junit.org/junit5/docs/current/user-guide/#writing-tests>
1. <https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-running-unit-tests-with-maven/>


**CI:**  <https://travis-ci.org/RyanFleck/Spring-MVC-Boilerplate>

**HKU:** <https://spring-mvc-boilerplate.herokuapp.com/>


## MVN Usage

After cloning the repository, the following commands can be used to develop, test and clean:

1. `mvn clean test` full rebuild of all files & run unit tests.
1. `mvn spring-boot:run` spring development run w/ reload after resources are modified.


## Development Standards

1. Every Java class must have a corresponding `ClassNameTest.java` file.
1. Format Java classes with `astyle Class.java` before committing.
