# Modern Java Quickstart Archetype

## Build and install local

```shell
./mvnw install
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
  -DgroupId=com.molecoding.nobs \
  -DartifactId=awesome-project \
  -DjavaVersion=11
```

## Update

After created project with this archetype, do check if there are new versions for the dependencies and feed back to this project.

```shell
mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
```

## Todo

- [ ] spotless
- [ ] utility libs like jackson?
