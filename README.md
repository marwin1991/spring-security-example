# spring-security-example
Based on: https://spring.io/guides/tutorials/spring-security-and-angular-js/

### Start with downloading node
```shell
./mvnw generate-resources
```

### Install the CLI
```shell
chmod +x npm
./npm install @angular/cli
```

### Verify CLI version
```shell
chmod +x ng
./ng --version
```

### (You can build FrontEnd continuously with)

```shell
./ng build --watch
```

Updates are built (quickly) and pushed to target/classes where they can be picked up by Spring Boot. Your IDE might need
to be tweaked to pick up the changes automatically (Spring Tool Suite does it out of the box).

That’s it really, but we can quickly look into a couple of extra things that will get you off the ground quickly with
Spring Boot and Angular.

### Start project

```shell
mvn spring-boot:run
```

### Login

Visit [localhost:8080](http://localhost:8080) and login to test if everything works (checkout application.properties)

### Test with curl

```shell
curl localhost:8080/resource
```

What is the response?

### Remember

```
You might need to force your browser to reload the static resources 
after you change them. In Chrome (and Firefox with a plugin) 
you can use "developer tools" (F12), and that might be enough. 
Or you might have to use CTRL+F5.
```

### Now lets to really nice sing-in

Some more readings are here:
[click](https://spring.io/guides/tutorials/spring-security-and-angular-js/#_the_login_page_angular_js_and_spring_security_part_ii)

### Types of authorization

- https://blog.restcase.com/4-most-used-rest-api-authentication-methods/

### Basic

- https://medium.com/@mind_sFlight/basic-authentication-with-angular-7-and-spring-security-6fd140efc031
- https://www.baeldung.com/spring-security-jdbc-authentication

### JWT

- https://bezkoder.com/angular-11-spring-boot-jwt-auth/
- https://bezkoder.com/angular-11-jwt-auth/
- https://bezkoder.com/spring-boot-security-postgresql-jwt-authentication/

### Session

- https://spring.io/projects/spring-session
- https://www.baeldung.com/spring-session-jdbc

### Remember Me

- https://www.baeldung.com/spring-security-remember-me

### OAuth2 Login with Google/Facebook/GitHub

- https://spring.io/guides/tutorials/spring-boot-oauth2/
- https://www.baeldung.com/spring-security-5-oauth2-login
- https://www.codejava.net/frameworks/spring-boot/oauth2-login-with-google-example

### Let's generate !!!

- https://www.jhipster.tech/
- https://start.jhipster.tech/generate-application
- https://github.com/jhipster/generator-jhipster

### Beautify Your Github !!!

- https://dev.to/philiphaines/beautify-your-github-40hh
