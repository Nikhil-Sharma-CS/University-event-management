# University-Event-Management

This is the code for University-Event-Management which uses various types of **Validation** for **Spring Boot**.
This also uses **H2 database** and **JPA** for as data source

- **Validation** : These are the types of annotation which are used to validate data to a certain type.


## 🚀 About Me
*Hi, My name is Nikhil Sharma*,

I'm a full stack developer trainee at Geekster. I have knowledge of Java, OOPs, Maven, APIs, DSA, SpringBoot.


# Data Flow

## Controller
-   *This section contains 2 classes which uses APIs as mentioned below* :

* ### StudentController Class

    * @PostMapping("add")
    * @GetMapping("getStudents")
    * @GetMapping("getById/{Id}")
    * @DeleteMapping("deleteStudent/{Id}")
    * @PutMapping("UpdateDept/{Id}/{department}")
       
* ### EventController Class

    * @PostMapping("addEvents")
    * @PutMapping("updateLocation/{Id}/{location}")
    * @DeleteMapping("deleteEvent/{Id}")
    * @GetMapping("eventsByDate/{Date}")
    * @GetMapping("Events")

## Services
-  *This section contains 2 classs with functions that helps API to perform their specific tasks* : 

* ### StudentService Class

    * String addStudents(List<Student> students) 
    * Iterable<Student> getAllStudents()
    * Optional<Student> getById(Integer id)
    * String deleteStudent(Integer id)
    * String updateDept(Integer id, Department department)

* ### EventService Class

    * String addEvents(List<Event> eventList)
    * String deleteEvent(Integer id)
    * Iterable<Event> eventsByDate(String date)
    * Iterable<Event> events()
    * String updateLocation(Integer Id, String location)

## Model
- *This section contains 2 models as required by project named **Student** and **Event**. Both have their relative datamembers in them which will be used as columns to store their respective data*.    

##  Repository
- *This section contains 2 **Interfaces** named iEventRepo and iStudentRepo which extends the **CRUDRepository** of JPA which defines various funtionality of interface and by extension via object of this interface we can access CRUDRepository methods to provide funtionality to our project*.


## Database Design
- *In this section we used a Job class which is used as a table to store data*.
- *It also uses H2 database and JPA to create datastructure*.

## Data Structure Used

- *We used **H2 database** along with **JPA** as the data source in this project*.
- *H2 database is a temporary **In-Memory** database. Which stores data in structured format(In form of tables and databases)*.
- *The data created in this is temporary and is lost as soon as the program is terminated*.
## Summary

*This project performs the task of managing Student & Event data with various types of API's like **Get, Post, Put, Delete***.

*This project shows the implementation of various types of **validations** that are used in **SpringBoot**. Such as **Size()**, **NotNull()**, **Pattern()**, etc.*

*We used **MVC Architecture** to create this project. 
And this is created in **SpringBoot** using **Maven** and **Java**.*


## 🔗 Links
[![Github](https://img.shields.io/badge/Github-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Nikhil-Sharma-CS)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/nikhil-sharma-cse)
