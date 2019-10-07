* This project of spring restQL with generaralisation of query results example.
* First ,I would suggest read the difference between graphQL and restQL 
    * https://medium.com/clover-platform-blog/building-a-microservice-with-spring-boot-and-spring-cloud-1c8275d7d229
    * https://github.com/B2W-BIT/restQL-java
    * http://docs.restql.b2w.io/#/restql/getting-started
    * https://github.com/B2W-BIT/restQL-manager
    
* You can observed the below details in this project
    * check the configuration yml
        * I have mentioned all the micro services which would be used in this API fetch.
        * I have made it generic so that ,you can add the new service ,you just have to update the configuration.
            * Right now,You will have to relaod the application context,because bean is created ,How ever you can override it,by providing API of cache it or database it.
        
        * Check TestController
            * You can see the request object will have input query and aurguments to it. Which will be used by RestQL.
        * I have attached the postman json.
        * Most important, The configuration api,i have proviced are sample API from tutorial,You can use your services  from backend.
        
* read DOC : http://docs.restql.b2w.io/#/restql/query-language
    * In this document,You will find the answer to below questions
        * How to provide headers like  authorization  to sub-sequent(underline) API call
        * How to convert call from get to (POST,DELET,PUT...) to underline system(API) like "from" clause will lead to GET API call.
        
        
* In this project,I have not used hard mapping of below services and pojo of response.
    * so you can add any service in backend can run the query on it.will give it back the response in json.
* Use project : https://github.com/AnkushNakaskar/SpringRestQLSamplePRojectUsedInside
    * For usermanagement queries and do more updates on this.
* Follow things you should check now.
    * Pagination : https://github.com/B2W-BIT/restQL-http/blob/master/docs/restql/faq.md
        * With Pagination ,We can use the "with" clause ,In this case, We can set page info like after and first param and use those in pagination in Under API. 
    * Authentications
    * CDN
    * Call below API with some input param and authentication with outh2(Token)
             
