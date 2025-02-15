java MavenArchetypeRunner.java
cd project\target\generated-sources\archetype
mvn install

mkdir /tmp/archetype
cd /tmp/archetype
mvn archetype:generate -DarchetypeCatalog=local