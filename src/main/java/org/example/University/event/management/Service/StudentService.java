package org.example.University.event.management.Service;

import org.example.University.event.management.Model.Department;
import org.example.University.event.management.Model.Student;
import org.example.University.event.management.Repository.iStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    iStudentRepo iStudentrepo;

    public String addStudents(List<Student> students) {
        iStudentrepo.saveAll(students);
        return "Students added";
    }

    public Iterable<Student> getAllStudents() {
        return iStudentrepo.findAll();
    }

    public Optional<Student> getById(Integer id) {
        return iStudentrepo.findById(id);
    }

    public String deleteStudent(Integer id) {
        iStudentrepo.deleteById(id);
        return "Student deleted";
    }

    public String updateDept(Integer id, Department department) {
        Optional<Student> student = iStudentrepo.findById(id);
        Student check = null;

        if(student.isPresent())
        {
            check  = student.get();
        }
        else {
            return "Id not found";
        }

        check.setDepartment(department);
        iStudentrepo.save(check);

        return "Department updated";
    }
}
