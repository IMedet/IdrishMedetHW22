package kz.medet.idrishmedethw22;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "calcServlet", value = "/calc-servlet")
public class CalcServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = Integer.parseInt(req.getParameter("a"));
        int b = Integer.parseInt(req.getParameter("b"));
        String type = req.getParameter("type");
        int sum = 0;

        System.out.println(a + " " + b + " " + type + " " + sum);

        if ("+".equals(type)) {
            sum = a + b;
        } else if ("-".equals(type)) {
            sum = a - b;
        } else if ("*".equals(type)) {
            sum = a * b;
        } else if ("/".equals(type)) {
            sum = a / b;
        }

        req.setAttribute("sum", sum);

        if ("+".equals(type)) {
            req.getRequestDispatcher("plus.jsp").forward(req, resp);
        } else if ("-".equals(type)) {
            req.getRequestDispatcher("minus.jsp").forward(req, resp);
        } else if ("*".equals(type)) {
            req.getRequestDispatcher("multi.jsp").forward(req, resp);
        } else if ("/".equals(type)) {
            req.getRequestDispatcher("div.jsp").forward(req, resp);
        } else {
            resp.getWriter().println("Invalid operation");
        }
    }
}
