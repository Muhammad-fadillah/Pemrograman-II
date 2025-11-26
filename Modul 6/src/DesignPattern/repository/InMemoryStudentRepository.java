package DesignPattern.repository;
import DesignPattern.entity.Student;
import java.util.*;
public class InMemoryStudentRepository implements StudentRepository{
    private List<Student> list = new ArrayList<>();
    public void add(Student s){ list.add(s); }
    public void remove(String k){ list.removeIf(s->s.getName().equalsIgnoreCase(k)||s.getNim().equalsIgnoreCase(k)); }
    public List<Student> all(){ return new ArrayList<>(list); }
}
