# spring-security-example

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

### You can build continuously with
```shell
./ng build --watch
```
Updates are built (quickly) and pushed to target/classes where they can be 
picked up by Spring Boot. Your IDE might need to be tweaked to pick up the 
changes automatically (Spring Tool Suite does it out of the box).

That’s it really, but we can quickly look into a couple of extra things that 
will get you off the ground quickly with Spring Boot and Angular.
