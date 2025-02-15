Install the archetype to local maven repository.
```
java MavenArchetypeRunner.java
cd project\target\generated-sources\archetype
mvn install
```

Generate a new project from the archetype.
```
mkdir /tmp/archetype
cd /tmp/archetype
mvn archetype:generate -DarchetypeCatalog=local
```

Run the project.
```
cd /tmp/archetype/myapp
mvn javafx:run
```
