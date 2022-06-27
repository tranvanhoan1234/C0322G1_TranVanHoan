import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String sanPham = request.getParameter("sanPham");
       int price = Integer.parseInt(request.getParameter("price"));
       int percent = Integer.parseInt(request.getParameter("percent"));

       double discount = price * percent * 0.1;

       request.setAttribute("sanPham", sanPham);
       request.setAttribute("price", price);
       request.setAttribute("percent", percent);
       request.setAttribute("discount", discount);

       request.getRequestDispatcher("display-discount.jsp").forward(request,response);
    }
}
