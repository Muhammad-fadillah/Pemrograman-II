package Solid.repository;

import java.util.List;
import Solid.entity.Student;

public interface StudentRepository {
    void add(Student student);
    void removeByKeyword(String keyword);
    List<Student> getAll();
}
