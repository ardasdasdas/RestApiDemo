This project is a simple Spring Boot CRUD Appliacation.
Main Goal is:
* Create a Spring Boot Project
* To learn using annotations such as @Repository, @Service, @RestController, @GetMapping, @PostMapping, @DeleteMapping, @PutMapping

## How to Create a Spring Starter Project?

In Eclipse,
> File -> New -> Spring Starter Project

as shown below.

![new-starter-project-screen](https://user-images.githubusercontent.com/53192718/95268153-6f684b80-083f-11eb-918d-7ac8cc5c777b.jpg)


After creating project let's code!

## Model Package
Firstly, we're starting with creating model classes. My topic is Student-Course relation so I create two model classes that are [Student.java](https://github.com/ardasdasdas/RestApiDemo/blob/main/src/main/java/com/restapidemo/model/Student.java) and [Course.java](https://github.com/ardasdasdas/RestApiDemo/blob/main/src/main/java/com/restapidemo/model/Course.java). In this model students has a course list.

## Repository Package
After that, we're creating Repository classes. So let's learn @Repository annotation. @Repository annotation indicates that an annotated class is a "Repository", originally defined byDomain-Driven Design (Evans, 2003) as "a mechanism for encapsulating storage,retrieval, and search behavior which emulates a collection of objects". This project we're not using DataBase so we have two private variables that are studentList and courseList. They're our repository. We're implementing CRUD operations for the lists(studentList and courseList).

## Service Package
Now, let's create Service classes. So, what is @Service annotation? @Service annotation is used with classes that provide some business functionalities. It indicates that an annotated class is a "Service", originally defined by Domain-DrivenDesign (Evans, 2003) as "an operation offered as an interface that stands alone in themodel, with no encapsulated state."  This classes has variables. The variables' types are from repository package.

## Controller Package
In this package, we use @RestController annotation. This annotation takes care of mapping request data to the defined request handler method. Once response body is generated from the handler method, it converts it to JSON or XML response.

We can use all HTTP Request with @Restcontroller. See [StudentController.java](https://github.com/ardasdasdas/RestApiDemo/blob/main/src/main/java/com/restapidemo/controller/StudentController.java).

## Let's Run The Application and Test HTTP Requests
> Note: I use Postman to send request. 
* Student in JSON Format:
```
{
    "id": 125,
    "studentName": "Arda",
    "courses":[
        {
            "courseName": "Math"
        }
    ]
}
```
* Course in JSON Format:
```
{
    "courseName": "English"
}
```
### 1-Post Method 
Endpoints:
* http://localhost:8080/add/student
* http://localhost:8080/add/course

![post-method](https://user-images.githubusercontent.com/53192718/95264936-e3ebbc00-0838-11eb-8dd9-e6d654a3ed5d.jpg)

### 2-Get Method
Endpoints:
* http://localhost:8080/list/students
* http://localhost:8080/list/students/{id}
* http://localhost:8080/list/courses
* http://localhost:8080/list/courses/{courseName}

![get-method](https://user-images.githubusercontent.com/53192718/95265056-17c6e180-0839-11eb-82d9-cbee8358c260.jpg)

### 3-Put Method
Endpoint:
* http://localhost:8080/update/student/{id}

![update-method](https://user-images.githubusercontent.com/53192718/95265158-55c40580-0839-11eb-9153-68d0cb13708d.jpg)

### 4-Delete Method
Endpoints:
* http://localhost:8080/delete/students
* http://localhost:8080/delete/students/{id}
* http://localhost:8080/delete/courses
* http://localhost:8080/delete/courses&{courseName}

![delete-method](https://user-images.githubusercontent.com/53192718/95265619-2e216d00-083a-11eb-967d-88e3e3b4b63a.jpg)

## You can test the other endpoints. You can also change the endpoints and make practise.
