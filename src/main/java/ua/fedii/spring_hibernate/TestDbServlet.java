package ua.fedii.spring_hibernate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "TestDbServlet", value = "/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "postgres";
        String password = "321987z";

        String url = "jdbc:postgresql://localhost:5432/company";
        String driver = "org.postgresql.Driver";

        try {
            PrintWriter out = response.getWriter();
            out.println("connecting to db " + url);

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(url, user, password);

            out.println("YES");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}
