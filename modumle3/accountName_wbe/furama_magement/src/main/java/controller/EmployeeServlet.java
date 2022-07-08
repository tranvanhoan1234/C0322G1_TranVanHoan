package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import model.employee.Division;
import model.employee.EducationDegree;
import model.employee.Employee;
import model.employee.Position;
import service.employee.IEmployeeService;
import service.employee.impl.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
                case "edit":
                editEmployee(request, response);
                
                break;
            default:

        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
            int id = Integer.parseInt(request.getParameter("employeeId"));
            String ten = request.getParameter("employeeName");
            String ngaySinh = request.getParameter("dateOfDay");
            String scmnd = request.getParameter("employeeIdCar");
            Double luong = Double.valueOf(request.getParameter("employeeSalary"));
            String sdt = request.getParameter("employeePhoneNumber");
            String email = request.getParameter("employeeEmail");
            String diaChi = request.getParameter("employeeAddress");
            int positionId = Integer.parseInt(request.getParameter("positionId"));
            int educationId = Integer.parseInt(request.getParameter("educationId"));
            int divisionId = Integer.parseInt(request.getParameter("divisionId"));
            Employee employee = new Employee(id, ten, ngaySinh,scmnd,luong, sdt, email, diaChi,positionId,educationId,divisionId );
            this.iEmployeeService.editEmployee(employee);
            try {
                response.sendRedirect("/employee");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String employeeName = request.getParameter("employeeName");
        String dateOfDay = request.getParameter("dateOfDay");
        String employeeIdCar = request.getParameter("employeeIdCar");
        double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhoneNumber = request.getParameter("employeePhoneNumber");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationId = Integer.parseInt(request.getParameter("educationId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        Employee employee = new Employee(employeeName, dateOfDay, employeeIdCar, employeeSalary, employeePhoneNumber, employeeEmail, employeeAddress, positionId, educationId, divisionId);
        iEmployeeService.create(employee);
 try {
     response.sendRedirect("/employee");
 } catch (IOException e) {
     e.printStackTrace();
 }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                deleteEmployee(request, response);
                break;
            case "create":
                showCreateEmployee(request, response);
                break;
                case "edit":
                showEditEmployee(request, response);
                break;

            default:
                showListEmployee(request, response);
        }
    }

    private void showEditEmployee(HttpServletRequest request, HttpServletResponse response) {
            int idEdit = Integer.parseInt(request.getParameter("idEdit"));
            Employee employeeList = this.iEmployeeService.findById(idEdit);
            List<Position>positionList = this.iEmployeeService.findAllPosition();
            List<EducationDegree>educationDegreeList = this.iEmployeeService.findAllEducation();
            List<Division>divisionList = this.iEmployeeService.findAllDivision();
            request.setAttribute("employeeList", employeeList);
            request.setAttribute("positionList",positionList);
            request.setAttribute("educationDegreeList",educationDegreeList);
            request.setAttribute("divisionList",divisionList);
            try {
                request.getRequestDispatcher("view/employee/edit.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
        }
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/employee/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        this.iEmployeeService.deleteEmployee(idDelete);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = this.iEmployeeService.findAll();
        List<EducationDegree> educationDegreesList = this.iEmployeeService.findAllEducation();
        List<Position> positionList = iEmployeeService.findAllPosition();
        List<Division> divisionList = this.iEmployeeService.findAllDivision();
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("educationDegreesList", educationDegreesList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("divisionList", divisionList);
        try {
            request.getRequestDispatcher("view/employee/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
