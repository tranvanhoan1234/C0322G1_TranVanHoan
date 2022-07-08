package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import service.customer.ICustomerService;
import service.customer.ICustomerTypeService;
import service.customer.impl.CustomerService;
import service.customer.impl.CustomerTypeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerController", urlPatterns = "/customer")
public class CustomerController extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();
    private ICustomerTypeService iCustomerTypeService = new CustomerTypeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                editCustomer(request, response);
                break;
                case "create":
                createCustomer(request, response);
                break;
            default:
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String ten = request.getParameter("name");
        String ngaySinh = request.getParameter("dateOfBirth");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String cmnd = request.getParameter("idCar");
        String sdt = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("address");
        int type_id = Integer.parseInt(request.getParameter("type_id"));
        Customer customer = new Customer( ten, ngaySinh, gender, cmnd, sdt, email, diaChi, type_id);
        this.iCustomerService.create(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
//            String name= request.getParameter("name");
//            int gia= Integer.parseInt(request.getParameter("gia"));
//            String moTa= request.getParameter("moTa");
//            String hang= request.getParameter("hang");
//            int id=(int)(Math.random() *1000);
//            Product product =new Product(id,name,gia,moTa,hang);
//            this.iProductService.create(product);
//            // vá» Ä‘Æ°á»ng dáº«n > urlpattern
//            response.sendRedirect("/products");
//        }

    }
    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String ten = request.getParameter("name");
        String ngaySinh = request.getParameter("dateOfBirth");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String cmnd = request.getParameter("idCar");
        String sdt = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String diaChi = request.getParameter("address");
        int type_id = Integer.parseInt(request.getParameter("type_id"));
        Customer customer = new Customer(id, ten, ngaySinh, gender, cmnd, sdt, email, diaChi, type_id);
        this.iCustomerService.editCustomer(customer);
        try {
            response.sendRedirect("/customer");
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
                deleteCustomer(request, response);
                break;
                case "create":
                showCreateCustomer(request,response);
                break;
            case "edit":
                showEditCustomer(request, response);
                break;
                case "search":
                    searchByName(request, response);
                break;
            default:
                showList(request, response);
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameCustomer");
        request.setAttribute("customerList", iCustomerService.findByName(name));
        request.setAttribute("customerTypeList",iCustomerTypeService.findAll());
        try {
            request.getRequestDispatcher("view/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) {
        int idEdit = Integer.parseInt(request.getParameter("idEdit"));
        Customer customer = this.iCustomerService.findById(idEdit);
        List<CustomerType> customerTypeList = this.iCustomerTypeService.findAll();
        request.setAttribute("customer", customer);
        request.setAttribute("customerType", customerTypeList);
        try {
            request.getRequestDispatcher("view/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        this.iCustomerService.remove(idDelete);
        response.sendRedirect("/customer");
//        request.setAttribute("messeng","them moi thqnh cong");

    }


    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = this.iCustomerService.findAll();
        List<CustomerType> customerTypeList = this.iCustomerTypeService.findAll();
        request.setAttribute("customerList", customerList);
        request.setAttribute("customerTypeList", customerTypeList);
        request.getRequestDispatcher("view/list.jsp").forward(request, response);

    }
}
