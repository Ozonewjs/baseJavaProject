package utils.myfastjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teacher {
    public String  teacherName;
    public int teacherAge;
    public Map<String,String> course;
    public List<Student> students;

    public Teacher() {
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }
    public void addCourse(String key, String value) {
        if (this.course == null) {
            this.course = new HashMap<>();
        }
        this.course.put(key, value);
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudents(Student student) {
        if (this.students == null) this.students = new ArrayList();
        this.students.add(student);
    }
}
