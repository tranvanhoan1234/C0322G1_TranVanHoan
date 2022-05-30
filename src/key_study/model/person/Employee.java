package key_study.model.person;

public class Employee extends Person {
    private Integer employeeCode;
    private String Level;
    private String position;
    private String salary;

    public Employee() {
    }

    @Override
    public String writerPerson() {
        return this.getFullName() + "," + this.getDateOfBirth() + "," + this.getGender()
                + "," + getCitizenId() + "," + this.getNumberPhone() + "," + this.getGmail() + "," + this.getEmployeeCode() + "," + this.getLevel() + "," +
                this.getPosition() + "," + this.getSalary();
    }

    public Employee(String fullName, String dateOfBirth, String gender, Integer citizenId, Long numberPhone, String gmail, Integer employeeCode, String level, String position, String salary) {
        super(fullName, dateOfBirth, gender, citizenId, numberPhone, gmail);
        this.employeeCode = employeeCode;
        Level = level;
        this.position = position;
        this.salary = salary;
    }

    public Integer getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Integer employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee : " + super.toString() +
                "employeeCode : " + employeeCode +
                ", Level : '" + Level + '\'' +
                ", position : '" + position + '\'' +
                ", salary : '" + salary + '\'' +
                '.';
    }
}
