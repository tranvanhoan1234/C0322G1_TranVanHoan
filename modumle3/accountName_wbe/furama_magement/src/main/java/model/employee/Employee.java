package model.employee;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String dateOfDay;
    private String employeeIdCar;
    private Double employeeSalary;
    private String employeePhoneNumber;
    private String employeeEmail;
    private String employeeAddress;
    private Integer positionId;
    private Integer educationId;
    private Integer divisionId;

    public Employee() {
    }

    public Employee(String employeeName, String dateOfDay, String employeeIdCar, Double employeeSalary, String employeePhoneNumber, String employeeEmail, String employeeAddress, Integer positionId, Integer educationId, Integer divisionId) {
        this.employeeName = employeeName;
        this.dateOfDay = dateOfDay;
        this.employeeIdCar = employeeIdCar;
        this.employeeSalary = employeeSalary;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.positionId = positionId;
        this.educationId = educationId;
        this.divisionId = divisionId;
    }

    public Employee(Integer employeeId, String employeeName, String dateOfDay, String employeeIdCar, Double employeeSalary, String employeePhoneNumber, String employeeEmail, String employeeAddress, Integer positionId, Integer educationId, Integer divisionId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dateOfDay = dateOfDay;
        this.employeeIdCar = employeeIdCar;
        this.employeeSalary = employeeSalary;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.positionId = positionId;
        this.educationId = educationId;
        this.divisionId = divisionId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDateOfDay() {
        return dateOfDay;
    }

    public void setDateOfDay(String dateOfDay) {
        this.dateOfDay = dateOfDay;
    }

    public String getEmployeeIdCar() {
        return employeeIdCar;
    }

    public void setEmployeeIdCar(String employeeIdCar) {
        this.employeeIdCar = employeeIdCar;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }
}
