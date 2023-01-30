# Java Spring REST API Design Doc

## Overview

This is a practice of developing a REST API for a real case (school management system).
There are two types of entities, "Student" and "Professor". As a management system,
it supports common CRUD operations, and all operations are reflected in tables in the database.
The main difference between the two entities is that "Professor" implements soft deletion,
which means that deleted records will still remain in the database. 
For the user, they look the same. Once they delete any record. They can not retrieve it again. 
But the administrator can still find the deleted "Professor" records in database.

## Environment Setup

* Java 17
* PostgreSQL
* Database Management GUI (optional)
* Postman

## Tutorial

Download the whole repo and use an IDE to open. 
Generally the IDE will download dependencies automatically.
Then, create a local database and config the `application.properties` 

File path: `~/class-management/src/main/resources/`

Config database connection by modifying these lines:

`spring.datasource.url` = *jdbc:postgresql://localhost:5432/{name_of_database}*

`spring.datasource.username` = *{username}*

`spring.datasource.password` = *{password}*

## Schema

**Student**
* id (auto-generated)
* name
* gender
* score
* create time
* update time

**Professor**
* id (auto-generated)
* name
* gender
* subject
* create time
* update time
* delete status

## REST API Testing

### POST

**Request url:** localhost:8080/student

**Request body:** raw json format
```json
{
  "name": "Brian",
  "gender": "M",
  "score": 95
}
```
**Respond:**
```json
{
  "id": 1,
  "name": "Brian",
  "gender": "M",
  "score": 95
}
```

**Request url:** localhost:8080/professor

**Request body:** raw json format
```json
{
  "name": "Alice",
  "gender": "F",
  "subject": "Intro to CS"
}
```
**Respond:**
```json
{
  "id": 1,
  "name": "Alice",
  "gender": "F",
  "subject": "Intro to CS"
}
```

### GET

**Request url:** localhost:8080/student

**Request body:** none

**Respond:**
```json
[
  {
    "id": 1,
    "name": "Brian",
    "gender": "M",
    "score": 95
  }
]
```

### PUT

**Request url:** localhost:8080/student

**Request body:** raw json format
```json
{
  "id": 1,
  "name": "Brian",
  "gender": "M",
  "grade": 100
}
```
**Respond:**
```json
{
  "id": 1,
  "name": "Brian",
  "gender": "M",
  "grade": 100
}
```


### DELETE

**Request url:** localhost:8080/student/1

**Request body:** none

**Respond:** (blank)

**Request url:** localhost:8080/professor/1

**Request body:** none

**Respond:** (blank)

### GET

**Request url:** localhost:8080/student/1

**Request body:** none

**Respond:** student not found with provided id: 1 (Status: 404 Not Found)

```
classdb=# select * from student;
 stu_id | create_time | stu_gender | stu_name | stu_score | update_time
--------+-------------+------------+----------+-----------+-------------
(0 rows)

```

**Request url:** localhost:8080/professor/1

**Request body:** none

**Respond:** professor not found with provided id: 1 (Status: 404 Not Found)

```
classdb=# select * from professor;
 prof_id |       create_time       | deleted | prof_gender | prof_name | prof_subject |       update_time
---------+-------------------------+---------+-------------+-----------+--------------+-------------------------
       1 | 2023-01-14 16:28:14.147 | t       | F           | Alice     | Intro to CS  | 2023-01-14 16:31:23.381
(1 row)
```