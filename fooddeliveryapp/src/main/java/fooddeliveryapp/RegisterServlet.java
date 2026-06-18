package fooddeliveryapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    public static String savedUser;
    public static String savedPass; 
   

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        savedUser = request.getParameter("username");
        savedPass = request.getParameter("password");

        response.getWriter().println("Account Created ✅ <br><a href='login.html'>Login Now</a>");
    }
}