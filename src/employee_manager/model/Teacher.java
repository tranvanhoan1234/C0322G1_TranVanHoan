package employee_manager.model;

import employee_manager.model.Person;

public class Teacher extends Person {
    private Integer salary;

    public Teacher() {
    }

    public Teacher(Integer id, String name, Integer age, String gender, Integer salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString() +
                "salary: " + salary;
    }
}
