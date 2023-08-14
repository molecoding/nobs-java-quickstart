# Modern Java Quickstart Archetype

## Build and install local

```shell
./mvn install
```

## Usage

Create new project using this archetype.

```shell
mvn archetype:generate \
  -DgroupId=me.jerryshang.playground \
  -DartifactId=blah \
  -DarchetypeGroupId=com.molecoding.nobs \
  -DarchetypeArtifactId=nobs-java-quickstart \
  -DarchetypeVersion=1.0-SNAPSHOT \
  -DinteractiveMode=false \
  -DarchetypeCatalog=local \
  -DjavaVersion=11
```
