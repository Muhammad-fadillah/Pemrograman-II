package Solid.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import Solid.entity.Student;

public class InMemoryStudentRepository implements StudentRepository {

    private final List<Student> students = new ArrayList<>();

    @Override
    public void add(Student student) { students.add(student); }

    @Override
    public void removeByKeyword(String keyword) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getName().equalsIgnoreCase(keyword) || s.getNim().equalsIgnoreCase(keyword)) {
                it.remove();
                return;
            }
        }
    }

    @Override
    public List<Student> getAll() { return new ArrayList<>(students); }
}
