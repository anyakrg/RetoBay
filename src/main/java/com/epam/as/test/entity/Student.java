package com.epam.as.test.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {
    private final static Logger log = LoggerFactory.getLogger(Student.class);
    private String name;
    private int id;
    private int groupId;
    private static int idcounter = 0;

    public Student(String name, int groupId) {
        this.name = name;
        this.groupId = groupId;
        this.id = idcounter++;
        log.info("Student created name:" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", groupId=" + groupId +
                '}';
    }
}
