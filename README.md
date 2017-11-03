# demoapi


## Overview
This is example  API to   provide customer CRUD  operation.

Follwoing are mandatory traits to access API service



ServiceID  : This  value uniquely indentifies   service consumer

Token : A token or pass   provided by the service provider after succesfull authentication  and valid   based on the providers policy. When expired  consumer need to be authenticated  first  and  a new token will be provided

#sample URL's:

http://localhost:8080/api/customers
http://localhost:8080/api/customers/{id}
http://localhost:8080/api/customers/{id}/addresses/
http://localhost:8080/api/customers/{id}/addresses/{id}

#API Requirement

Build a Customer API to perform
	List all customer
	Create new customer
	Update a Customer
	Deletes a Customer
Return proper HTTP Status code
API access over HTTPs
Use Header to pass security token or user credential for authentication authorization.
Token will be expired after specified time


#Case 1
A consumer may periodically (every 5 minutes) consume the API to enable it (the consumer) to maintain a copy of the provider API's customers (the API represents the system of record)

Considerations
List customers API will restrict how many records to be returned on each call with a query parameter ‘limit’. Default and maximum configuration is required. 
Another query parameter ‘start’ is required to keep track of index to return next block of records.
Furthermore a mandatory datetime parameter ‘changeSince’ should be provided by the client to retrieve and return resources modified after ‘changeSince’ value


#Case 2
A mobile application used by customer service representatives that uses the API to retrieve and update the customers details

Considerations
To access create/update/delete customer record each request require authentication, hence for this demo I have considered basic authentication. Username:password with base64 encoding required to passed ‘authorization’ parameter in header  

#Case 3
Simple extension of the API to support future resources such as orders and products
Considerations
Hypertext Linking is used to connect related resources. For Example,
Customer resource returns Customer record with address resource link. If user require to add orders for customer and want to find the orders for customer with Hyper text linking  it will be easy to extend the API.



