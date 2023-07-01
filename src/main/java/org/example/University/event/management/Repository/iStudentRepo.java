package org.example.University.event.management.Repository;

import org.example.University.event.management.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iStudentRepo extends CrudRepository<Student, Integer> {
}
