# DosmakhambetBaktiyar_Module_3_1

Application


For this project you will be using an open source Stocks feed API to provide incoming data. This API is open source and requires no authentication. The documentation (should you need to look at it) is here: https://iexcloud.io/docs/api/

You must create a Java Spring Boot project which has the following properties:
A non-web based Spring Boot application - which outputs messages to the console / terminal window.
On load – query the following stocks API: https://sandbox.iexapis.com/stable/ref-data/symbols?token=Tpk_ee567917a6b640bb8602834c9d30e571
This gives the symbols/names/state for each trading company.
Reference: [https://iexcloud.io/docs/api/#symbols]
Loop through each company that is enabled and put a request onto a queue for that company to get its data.
Have multiple threads processing the queue - downloading the current stock information for that company, using the following API: https://sandbox.iexapis.com/stable/stock/{stock code}/quote?token={token}
i.e. https://sandbox.iexapis.com/stable/stock/MSFT/quote?token=Tpk_ee567917a6b640bb8602834c9d30e571
Reference: https://iexcloud.io/docs/api/#quote
Save the data from each stock quote into a DB structure that can be queried.
The DB can be an In-Memory DB in the project or a Docker or local instance of MySQL / Postgres / Cassandra / MongoDB i.e. any data repository you prefer.
The console window should output at regular intervals (say every 5 seconds) the following stats:
The top 5 highest value stocks (in order – largest first, then order by company name). Use Volume or PreviousVolume field, depends on what available. 
The most recent 5 companies that have the greatest change percent in stock value. Use latestPrice to define change between previous response and current response. 
Once the process has completed (looped through all companies), it should start again and download the current stock information for each company again.
If the information has changed for a company, then this change needs to be recorded in the DB, i.e. a log for each company of the changes to their stocks over time. IMPORTANT
Application should be deployed to AWS
Related materials:
https://habr.com/ru/post/554608/
https://www.baeldung.com/java-completablefuture
https://www.baeldung.com/java-executor-service-tutorial
https://www.baeldung.com/rest-template
https://aws.amazon.com/ru/blogs/devops/ci-cd-on-amazon-eks-using-aws-codecommit-aws-codepipeline-aws-codebuild-and-fluxcd/
