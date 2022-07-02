package controller;

import model.Product;
import service.IProductService;
import service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateProduct(request,response);
                break;
                case "delete":
                deleteProduct(request,response);
                break;
            default:

                break;
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                creatProduct(request, response);
                break;
            case "delete":
                showDeleteProduct(request,response);
            default:
                listProduct(request, response);
                break;
        }
    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = iProductService.findAll();
        request.setAttribute("products", productList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    private void creatProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create.jsp").forward(request,response);

    }
    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name= request.getParameter("name");
        int gia= Integer.parseInt(request.getParameter("gia"));
        String moTa= request.getParameter("moTa");
        String hang= request.getParameter("hang");
        int id=(int)(Math.random() *1000);
        Product product =new Product(id,name,gia,moTa,hang);
        this.iProductService.create(product);
        // về đường dẫn > urlpattern
        response.sendRedirect("/products");
    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product = iProductService.searchId(id);
        if (product==null){
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        }else {
            iProductService.delete(id);
            try {
                response.sendRedirect("/products");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product =iProductService.searchId(id);
        if (product==null){
            response.sendRedirect("errror-404.jsp");
        }else {
            request.setAttribute("product",product);
            request.getRequestDispatcher("delete.jsp");
        }
    }
}
