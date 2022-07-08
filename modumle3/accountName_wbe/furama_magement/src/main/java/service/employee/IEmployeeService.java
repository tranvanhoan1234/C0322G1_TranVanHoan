package service.employee;

import model.employee.Division;
import model.employee.EducationDegree;
import model.employee.Employee;
import model.employee.Position;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    List<Position> findAllPosition();

    List<EducationDegree> findAllEducation();

    List<Division> findAllDivision();

    void deleteEmployee(int idDelete);

    void create(Employee employee);

    Employee findById(int idEdit);

    void editEmployee(Employee employee);

}
