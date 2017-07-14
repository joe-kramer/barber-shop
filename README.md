# _Barber Shop_

#### By _**Joe Kramer**_

## Description

_This webpage simulates a program that a barbershop would use to keep track of its styliest and clients information_

## Specs
* _See a list of all barbers_
* _Select a barber and see their details, and list of clients that belong to them_
* _Need to add new barbers to system_
* _Need to update barbers details_
* _Need to add new clients to barber_
* _Need to update client and styliest details_
* _Delete client and barber_

## Database Setup
* _In PSQL_
* _CREATE DATABASE hair_salon_
* _\c hair_salon_
* _CREATE TABLE stylists (id serial PRIMARY KEY, name varchar, details varchar)_
* _CREATE TABLE clients (id serial PRIMARY KEY, stylistId int, name varchar, details varchar)_

## Technologies Used

_CSS, HTML, Java, Bootstrap, Spark_

Copyright (c) 2017 **_Joe Kramer_**
