package org.example.University.event.management.Controller;

import jakarta.validation.Valid;
import org.example.University.event.management.Model.Department;
import org.example.University.event.management.Model.Student;
import org.example.University.event.management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class StudentController {

    @Autowired
    StudentService studentService;

    //Post mapping to add students
    @PostMapping("add")
    public String addStudents(@RequestBody @Valid List<Student> students)
    {
        return studentService.addStudents(students);
    }


    //Get mapping to see students
    @GetMapping("getStudents")
    public Iterable<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }


    //Get mapping to see students by id
    @GetMapping("getById/{Id}")
    public Optional<Student> getById(@PathVariable Integer Id)
    {
        return studentService.getById(Id);
    }


    //Delete mapping to delete student
    @DeleteMapping("deleteStudent/{Id}")
    public String deleteStudent(@PathVariable Integer Id)
    {
        return studentService.deleteStudent(Id);
    }


    //Put mapping to update student department
    @PutMapping("UpdateDept/{Id}/{department}")
    public String updateDept(@PathVariable Integer Id, @PathVariable Department department)
    {
        return studentService.updateDept(Id, department);
    }

}
