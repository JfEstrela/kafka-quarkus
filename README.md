# kafka-quarkus

## Creating the Maven project Quarkus
First, we need a new project. Create a new project with the following command

```
mvn io.quarkus:quarkus-maven-plugin:0.17.0:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=kafka-quickstart \
    -Dextensions="kafka"
    
```


## Reference Documentation
For further reference, please consider the following sections:

* [QUARKUS - USING APACHE KAFKA WITH REACTIVE MESSAGING](https://quarkus.io/guides/kafka-guide)
* [Kafka Quickstart](https://kafka.apache.org/quickstart)
