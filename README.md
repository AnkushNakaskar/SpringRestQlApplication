* This project of spring restQL with generaralisation of query results example.
* First ,I would suggest read the difference between graphQL and restQL 
    * https://medium.com/clover-platform-blog/building-a-microservice-with-spring-boot-and-spring-cloud-1c8275d7d229
    * https://github.com/B2W-BIT/restQL-java
    * http://docs.restql.b2w.io/#/restql/getting-started
    
* You can observed the below details in this project
    * check the configuration yml
        * I have mentioned all the micro services which would be used in this API fetch.
        * I have made it generic so that ,you can add the new service ,you just have to update the configuration.
            * Right now,You will have to relaod the application context,because bean is created ,How ever you can override it,by providing API of cache it or database it.
        
        * Check TestController
            * You can see the request object will have input query and aurguments to it. Which will be used by RestQL.
        * I have attached the postman json.
        * Most important, The configuration api,i have proviced are sample API from tutorial,You can use your services  from backend.
        
* In this project,I have not used hard mapping of below services and pojo of response.
    * so you can add any service in backend can run the query on it.will give it back the response in json.
* Follow things you should check now.
    * Authentications
    * CDN
    * Call below API with some input param and authentication with outh2(Token)
             