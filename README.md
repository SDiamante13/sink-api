```

```

Calls the slow SINQ Soap Web Service located at http://localhost:8091/ws/sink.wsdl

GitHub URL of server-side: [soapy-SINQ](https://github.com/SDiamante13/soapy-sinq)

Hit the endpoint locally with a GET request at http://localhost:8082/sink/{modelNumber}

#### Example model numbers
    KCH-1000
    VT3322G2
    
    
## Generating stubs for SOAP Contract

`wsimport` should be installed already since it's a part of the Java tool kit.

## Enter the following command to import the non-blocking contract:

    wsimport \
         -b src/main/resources/async_mapping.xml \
         -keep -s src/main/java/tech/pathtoprogramming/reactive \
         "http://localhost:8091/ws/sink.wsdl"
         
## Resources

> [Reactive Web Services Client](https://blog.godatadriven.com/jaxws-reactive-client) 

> [Redis Cache with Spring Boot](https://programmerfriend.com/ultimate-guide-to-redis-cache-with-spring-boot-2-and-spring-data-redis/)

## Cache Notes

* Cacheable objects must implement Serializable
* Each cacheName can have its own ttl controlled by properties 

## Docker

**Running Redis locally**

`docker run -d -p 6379:6379 --name redis-cache redis:alpine`

**Enter running container**

`docker exec -it redis-cache sh`

**Start redis cli**

> redis-cli

**Delete all values**

> FLUSHALL

**Get all keys**

> KEYS *

**Get value for a given key**

> MGET sinkResponse::VT3322G2       
 