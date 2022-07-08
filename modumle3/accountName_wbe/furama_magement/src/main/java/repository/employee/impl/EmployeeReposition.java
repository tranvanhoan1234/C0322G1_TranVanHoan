package repository.employee.impl;

import db_conection.DBConnect;
import model.customer.Customer;
import model.employee.Division;
import model.employee.EducationDegree;
import model.employee.Employee;
import model.employee.Position;
import repository.employee.IEmployeeReposition;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReposition implements IEmployeeReposition {
    private static final String SELECT_ALL = "SELECT * FROM employee; ";
    private static final String SELECT_ALL_POSITION = "SELECT * FROM `position`; ";
    private static final String SELECT_ALL_EDUCATION = "SELECT * FROM education_degree; ";
    private static final String SELECT_ALL_DIVISION = "SELECT * FROM division; ";
    private static final String DELETE_EMPLOYEE = " delete from employee where employee_id = ?; ";
    private static final String INSERT_INTO_EMPLOYEE = "insert into employee (employee_name,employee_date_of_birth,employee_id_car,employee_salary,employee_phone_number,employee_email, " +
            " employee_address,position_id,education_degree_id,division_id) " +
            " value(?,?,?,?,?,?,?,?,?,? ) ";
    private static final String SEARCH_BY_ID_EMPLOYEE = " SELECT * FROM employee " +
            "where employee_id = ?; ";
//    private static final String UPDATE_EMPLOYEE = "update employee " +
//            "set employee_name =? ,employee_date_of_birth=?  ,employee_id_car = ? ,employee_salary=? ,employee_phone_number=?,employee_email=? " +
//            "employee_address=? ,position_id=? ,education_degree_id= ? ,division_id= ? " +
//            "where (employee_id =? ); ";
    private static final String UPDATE_EMPLOYEE = "UPDATE `resort_furama`.`employee` SET " +
            "`employee_name` = ?, `employee_date_of_birth` = ?, " +
            "`employee_id_car` = ?, `employee_salary` = ?, `employee_phone_number` = ?," +
            " `employee_email` = ?, `employee_address` = ?, `position_id` = ?," +
            " `education_degree_id` = ?, `division_id` = ? WHERE (`employee_id` = ?);\n ";

    DBConnect dbConnect = new DBConnect();

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("employee_id");
                String name = resultSet.getString("employee_name");
                String ngaySinh = resultSet.getString("employee_date_of_birth");
                String cmnd = resultSet.getString("employee_id_car");
                double luong = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone_number");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int position = resultSet.getInt("position_id");
                int education = resultSet.getInt("education_degree_id");
                int division = resultSet.getInt("division_id");
                Employee employee = new Employee(id, name, ngaySinh, cmnd, luong, phone, email, address, position, education, division);
                employeeList.add(employee);


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return employeeList;
    }

    @Override
    public List<Position> findAllPosition() {
        List<Position> positionList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();
        try {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_POSITION);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("position_id");
                    String name = resultSet.getString("position_name");
                    Position position = new Position(id, name);
                    positionList.add(position);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return positionList;
    }

    @Override
    public List<EducationDegree> findAllEducation() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();
        try {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EDUCATION);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("education_degree_id");
                    String name = resultSet.getString("education_degree_name");
                    EducationDegree educationDegree = new EducationDegree(id, name);
                    educationDegreeList.add(educationDegree);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return educationDegreeList;
        }

    }

    @Override
    public List<Division> findAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        Connection connection = dbConnect.getConnection();
        try {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_DIVISION);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("division_id");
                    String name = resultSet.getString("division_name");
                    Division division = new Division(id, name);
                    divisionList.add(division);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return divisionList;
    }

    @Override
    public void deleteEmployee(int idDelete) {
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
            preparedStatement.setInt(1, idDelete);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void create(Employee employee) {
        try {
            Connection connection = dbConnect.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getDateOfDay());
            preparedStatement.setString(3, employee.getEmployeeIdCar());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhoneNumber());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEducationId());
            preparedStatement.setInt(10, employee.getDivisionId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Employee findById(int idEdit) {
        Employee employee = new Employee();
        Connection connection = dbConnect.getConnection();
        try {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_ID_EMPLOYEE);
                preparedStatement.setInt(1, idEdit);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("employee_id");
                    String name = resultSet.getString("employee_name");
                    String ngaySinh = resultSet.getString("employee_date_of_birth");
                    String cmnd = resultSet.getString("employee_id_car");
                    double luong = resultSet.getDouble("employee_salary");
                    String phone = resultSet.getString("employee_phone_number");
                    String email = resultSet.getString("employee_email");
                    String address = resultSet.getString("employee_address");
                    int position = resultSet.getInt("position_id");
                    int education = resultSet.getInt("education_degree_id");
                    int division = resultSet.getInt("division_id");
                    employee = new Employee(id, name, ngaySinh, cmnd, luong, phone, email, address, position, education, division);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


        return employee;
    }

    @Override
    public void editEmployee(Employee employee) {
        Connection connection = dbConnect.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1, employee.getEmployeeName());
            preparedStatement.setString(2, employee.getDateOfDay());
            preparedStatement.setString(3, employee.getEmployeeIdCar());
            preparedStatement.setDouble(4, employee.getEmployeeSalary());
            preparedStatement.setString(5, employee.getEmployeePhoneNumber());
            preparedStatement.setString(6, employee.getEmployeeEmail());
            preparedStatement.setString(7, employee.getEmployeeAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getEducationId());
            preparedStatement.setInt(10, employee.getDivisionId());
            preparedStatement.setInt(11, employee.getEmployeeId());


            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}