package employee_manager.model;

import employee_manager.model.Person;

public class Student extends Person {
    private Integer point;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String gender, Integer point) {
        super(id, name, age, gender);
        this.point = point;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() +
                "point: " + point;
    }
}
