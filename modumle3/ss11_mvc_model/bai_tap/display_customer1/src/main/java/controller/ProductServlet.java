package controller;

import model.product.Product;
import model.service.ProductService;
import model.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet" , urlPatterns ="/products")
public class ProductServlet extends HttpServlet {

    private ProductService productService = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "update":
                updateProduct(request, response);
                break;
            case "detail":
                detailProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
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
                showCreateProduct(request, response);
                break;
            case "delete":
                showDeleteProduct(request, response);
                break;
            case "update":
                showUpdateProduct(request, response);
                break;
            case "detail":
                showDetailProduct(request, response);
                break;
            case "search":
                showSearchProduct(request, response);
                break;
            default:
                listProduct(request, response);
                break;
        }

    }
    private void listProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = productService.findAll();
        request.setAttribute("products",productList);
        request.getRequestDispatcher("view/product/list.jsp").forward(request,response);
    }

    private void showSearchProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name = request.getParameter("search");
        Product product = this.productService.search(name);
        System.out.println(product);
        if(product == null){
            response.sendRedirect("error-404.jsp");
        }
        else{
            request.setAttribute("products", product);
            request.getRequestDispatcher("view/product/search.jsp").forward(request, response);
            response.sendRedirect("view/product/delete.jsp");
        }

    }
    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("search");
        Product product = this.productService.search(name);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        }
        else{
            request.setAttribute("products",product);
            request.getRequestDispatcher("view/product/search.jsp").forward(request, response);
        }

    }

    private void showDetailProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.searchId(id);
        if(product == null){
            response.sendRedirect("error-404.jsp");
        }
        else{
            request.setAttribute("products", product);
            request.getRequestDispatcher("view/product/detail.jsp").forward(request, response);
//            response.sendRedirect("product/delete.jsp");
        }

    }
    private void detailProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.searchId(id);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        }
        else{
            response.sendRedirect("/products");
        }
    }
    private void showUpdateProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.searchId(id);
        System.out.println(id);
        if(product == null){
            response.sendRedirect("error-404.jsp");
        }
        else{
            request.setAttribute("products", product);
            request.getRequestDispatcher("view/product/update.jsp").forward(request, response);
        }

    }
    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        Integer price = Integer.parseInt(request.getParameter("price"));
        String descriptionOfThe = request.getParameter("descriptionOfThe");
        String producer = request.getParameter("producer");
        Product product = productService.searchId(id);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        }
        else{
            product.setName(name);
            product.setPrice(price);
            product.setDescriptionOfThe(descriptionOfThe);
            product.setProducer(producer);
            this.productService.update(id, product);
            response.sendRedirect("/products");
        }
    }
    private void showDeleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.searchId(id);
        if(product == null){
            response.sendRedirect("error-404.jsp");
        }
        else{
            request.setAttribute("products", product);
            request.getRequestDispatcher("/view/product/delete.jsp").forward(request, response);
//            response.sendRedirect("product/delete.jsp");
        }

    }
    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Product product =productService.searchId(id);
        if(product == null){
            request.getRequestDispatcher("error-404.jsp").forward(request, response);
        }
        else{
          productService.delete(id);
            try{
                response.sendRedirect("/products");
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    private void showCreateProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("view/product/create.jsp").forward(request, response);

    }
    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");
        Integer price = Integer.parseInt(request.getParameter("price"));
        String descriptionOfThe = request.getParameter("descriptionOfThe");
        String producer = request.getParameter("producer");
        int id = (int) (Math.random()* 1000);
        Product product = new Product(id, name, price, descriptionOfThe, producer);
        this.productService.create(product);
        response.sendRedirect("view/product/create.jsp");
    }
}
