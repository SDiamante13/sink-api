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
 