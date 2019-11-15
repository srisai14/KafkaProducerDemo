# KafkaProducerDemo

https://kafka.apache.org/quickstart

Zookeeper
=============
bin/zookeeper-server-start.sh config/zookeeper.properties

Kafka Broker
=============
bin/kafka-server-start.sh config/server.properties

Create a topic
===============
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test

Produce message
===============
bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test

Consume message
================
bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning

