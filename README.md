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
  -DartifactId=awsome-project \
  -DjavaVersion=11
```

## Update

In created project with this archetype, do check the versions and write back here.

```shell
mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
```
