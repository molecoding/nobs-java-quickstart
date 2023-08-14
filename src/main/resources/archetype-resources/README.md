# App

## Build & Run

Package and run jar,

```shell
mvn package
java -jar target/${artifactId}-${version}.jar
```

Or run a class directly,

```shell
mvn exec:java -Dexec.mainClass=${package}.App
```
