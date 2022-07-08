package service.employee.impl;

import model.employee.Division;
import model.employee.EducationDegree;
import model.employee.Employee;
import model.employee.Position;
import repository.employee.IEmployeeReposition;
import repository.employee.impl.EmployeeReposition;
import service.employee.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
   private IEmployeeReposition iEmployeeReposition =new EmployeeReposition();

    @Override
    public List<Employee> findAll() {
        return iEmployeeReposition.findAll();
    }

    @Override
    public List<Position> findAllPosition() {
        return iEmployeeReposition.findAllPosition();
    }

    @Override
    public List<EducationDegree> findAllEducation() {
        return iEmployeeReposition.findAllEducation();
    }

    @Override
    public List<Division> findAllDivision() {
        return iEmployeeReposition.findAllDivision();
    }

    @Override
    public void deleteEmployee(int idDelete) {
        iEmployeeReposition.deleteEmployee(idDelete);
    }

    @Override
    public void create(Employee employee) {
        iEmployeeReposition.create(employee);
    }

    @Override
    public Employee findById(int idEdit) {
        return iEmployeeReposition.findById(idEdit);
    }

    @Override
    public void editEmployee(Employee employee) {
        iEmployeeReposition.editEmployee(employee);
    }
}
