## Spring Boot Course and Catalog App
** Two Spring Boot application interecting with each other connecting with sqlite database**

## Prerequisites
* Java 11
* Maven
* spring boot

## PORTS
1. Course app port: 9001
2. Catalog app port: 9002

## To check for the database
1. Go to the directory folder and run this command sqlite3 futurexcourse.db
2. 
### Database Schema
## for sqlite to create table
1. CREATE TABLE
2. course
2.  (
4.  courseid BIGINT NOT NULL,
5.  coursename VARCHAR,
6.  author VARCHAR,
7.  PRIMARY KEY (courseid)
8. );
  
  
## To insert a row
1. INSERT INTO course (courseid, coursename, author) VALUES (1, BY course, Shubham);

## To get all the rows
1. Select * from course
