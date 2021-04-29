# mooapis-java

Java protocol files for our services and apis, generated from mooapis 

# Usage

To use any of the apis, you first need to add our repository to your `pom.xml`:

```xml
<repositories>
  <repository>
    <id>cow-releases</id>
    <url>https://maven.cow.network/releases</url>
  </repository>
</repositories>
```

Then choose an api of your liking and add the dependency. For our example we choose `indigo/v1` which correlates to the following:

```xml
<dependencies>
  <dependency>
    <groupId>network.cow.mooapis</groupId>
    <artifactId>indigo</artifactId>
    <version>v1</version>
  </dependency>
</dependencies>
```
