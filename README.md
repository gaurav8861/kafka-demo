### kafka-demo

Follow below link to install Zookeper and Kafka Server
https://medium.com/@Ankitthakur/apache-kafka-installation-on-mac-using-homebrew-a367cdefd273
1. Install zookeper
2. Install kafka server
3. Start consumer app
4. Start producer app
5. Test api 
```
curl -X POST \
  'http://localhost:9000/kafka/publish?message=test123&limit=100' \
  -H 'content-type: application/json' \
  -d '{
}'
```
