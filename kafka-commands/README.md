# kafka- commands

- Download kafka from the [link](https://kafka.apache.org/downloads)
Unzip and keep it in c folder.
 
- To start kafka server. start zookeeper
```sh
cd c:\kafka
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```
- Start the kafka server now.
```sh
bin\windows\kafka-server-start.bat config\server.properties
```
- To create topic

```shell
bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --topic test-topic --partitions 2 --replication-factor 1
```
- To send data to kafka

```shell
bin\windows\kafka-console-producer.bat -broker-list localhost:9092 -topic test-topic
```


- Inspecting message on kafka topic

```sh
bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic <topic-name> --from-beginning
```

