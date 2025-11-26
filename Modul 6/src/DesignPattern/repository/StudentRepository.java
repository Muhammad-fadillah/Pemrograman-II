package DesignPattern.repository;
import DesignPattern.entity.Student;
import java.util.List;
public interface StudentRepository {
    void add(Student s);
    void remove(String keyword);
    List<Student> all();
}
