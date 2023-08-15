# Modern Java Quickstart Archetype

## Build and install local

```shell
./mvn install
```

## Usage

Create new project using this archetype.

```shell
mvn archetype:generate \
  -DinteractiveMode=false \
  -DarchetypeCatalog=local \
  -DarchetypeGroupId=com.molecoding.nobs \
  -DarchetypeArtifactId=nobs-java-quickstart \
  -DarchetypeVersion=9999-SNAPSHOT \
  -DgroupId=me.jerryshang.playground \
  -DartifactId=owsome-project \
  -DjavaVersion=11
```
