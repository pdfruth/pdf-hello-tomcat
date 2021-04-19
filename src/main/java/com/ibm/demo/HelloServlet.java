package com.ibm.demo;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implemetation class HelloServlet
 */
@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        String yourName = request.getParameter("yourName");
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello " + yourName + "</h1>");
        writer.close();
        */

        if (request.getParameter("Button1") != null) {
            System.out.println("Button1 clicked");
            //update button is clicked
            //Do the update action or forward the request to the servlet to do update action 
    
        } else if (request.getParameter("Button2") != null) {
            System.out.println("Button2 clicked");
              //delete button is clicked
              //Do the delete action or forward the request to the servlet to do delete action
        }

        // getServletContext().getRequestDispatcher("result.jsp").forward(request, response);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
 
        requestDispatcher.forward(request, response);

    }
}
