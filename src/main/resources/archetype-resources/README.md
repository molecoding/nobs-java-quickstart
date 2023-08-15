# App

## Build & Run

Package and run jar,

```shell
# Linux/macOS
./mvn package
# Windows
mvnw.cmd package

java -jar target/${artifactId}-${version}.jar
```

Or run a class directly,

```shell
# Linux/macOS
./mvnw exec:java -Dexec.mainClass=${package}.App

# Windows
mvnw.cmd exec:java -Dexec.mainClass=${package}.App
```
