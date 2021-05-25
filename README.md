### kafka-demo

Follow below link to install Zookeper and Kafka Server
https://medium.com/@Ankitthakur/apache-kafka-installation-on-mac-using-homebrew-a367cdefd273
1. Install zookeper
2. Install kafka server
3. Uncomment line `listeners=PLAINTEXT://:9092` in `/usr/local/etc/kafka/server.properties`
4. Command to start zookeper in mac (Installed through brew) `zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties`
5. Command to start kafka server in mac `kafka-server-start /usr/local/etc/kafka/server.properties`
6. Start consumer app
7. Start producer app
8. Test api 
```
curl -X POST \
  'http://localhost:9000/kafka/publish?message=test123&limit=100' \
  -H 'content-type: application/json' \
  -d '{
}'
```
