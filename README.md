# Spring-Boot-CRUD-APIs
> Spring-Boot APIs to perform CRUD operations in Student Details.

## Project Setup
   - Import project as maven project in your java IDE.
   - Create Database name as "rest-demo" or Create the database with you choice and update in the database
      url in /resources/application.yaml
   - give your Mysql password in application.yaml
## API List in Project
   Here use Postman tool to send the HTTP requests to test or use any other tool your choice. 
   - ### Create student ###
     > Method = `POST` URL = `localhost:8080/student/signup`
   - Example data in JSON for create student
     {
          "studentId" : "va58",
          "studentName" : "Rabi",
          "studentAddress" : "Amaiyagram",
          "studentPassword" : "1234"
      }
   - ### View Student by their ID ###
     > HTTP method = `GET` 
     URL = `localhost:8080/student/studentid`
   - ### View all Student Details. ###
     > HTTP method = `GET` 
     URL = `localhost:8080/student/getAll`
   - ### Update student ###
     For this give data in json format for all fields to update student details.
     > HTTP method = `PUT`
       URL = `localhost:8080/student/update`
   - ### Delete student by their ID ###
     > HTTP method = `DELETE`
       URL = `localhost:8080/student/studentID
   - ### Login ###
     First create student data using signup api and use this to login.
     > HTTP method = `GET`
       URL = `localhost:8080/student/login?username= your_username&password=yourpassword` or
       give username and password in form-date in postman.