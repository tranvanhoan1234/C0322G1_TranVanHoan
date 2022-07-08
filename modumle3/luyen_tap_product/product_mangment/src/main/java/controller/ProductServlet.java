package controller;

import model.Category;
import model.Product;
import service.ICategoryService;
import service.IProductService;
import service.impl.CategoryService;
import service.impl.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductService();
    private ICategoryService categoryService = new CategoryService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                editProduct(request, response);
                break;

            default:
                showListProduct(request, response);
                break;
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("idProduct"));
        String ten = request.getParameter("tenProduct");
        double gia = Double.parseDouble(request.getParameter("giaProduct"));
        int soLuong = Integer.parseInt(request.getParameter("soLuongProduct"));
        String mauSac = request.getParameter("mauSacProduct");
        String moTa = request.getParameter("moTaProduct");
        int idCategory = Integer.parseInt(request.getParameter("idCategory"));
        Product product = new Product(id, ten, gia, soLuong, mauSac, moTa, idCategory);
        this.productService.editProduct(product);
        response.sendRedirect("/product");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "edit":
                    showFormEdit(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchByName(request, response);
                break;
            default:
                showListProduct(request, response);
                break;
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("nameProduct");
        request.setAttribute("productList", productService.findByName(name));
        request.setAttribute("categoryList", categoryService.findAll());
        request.setAttribute("searchName", name);
        try {
            request.getRequestDispatcher("/view/list.jsp").forward(request, response);

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idEdit = Integer.parseInt(request.getParameter("idEdit"));
        Product product = this.productService.findById(idEdit);
        List<Category> categoryList = this.categoryService.findAll();
        request.setAttribute("product", product);
        request.setAttribute("categoryList", categoryList);
        request.getRequestDispatcher("view/edit.jsp").forward(request, response);
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int idDelete = Integer.parseInt(request.getParameter("idDelete"));
        this.productService.remove(idDelete);
        response.sendRedirect("/product");
    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = this.productService.findAll();
        List<Category> categoryList = this.categoryService.findAll();
        request.setAttribute("productList", productList);
        request.setAttribute("categoryList", categoryList);
        request.getRequestDispatcher("view/list.jsp").forward(request, response);
    }
}
