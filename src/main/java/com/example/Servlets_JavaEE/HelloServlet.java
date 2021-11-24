package com.example.Servlets_JavaEE;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public HelloServlet() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        for (int i = 0; i < 5; ++i) {
            out.println("<img src=\"image/hello.png\">");
        }

        out.println("<p>Click <a href=\"hello.png\">here</a> to create the image</p>");
        out.println("<p>Click <a href=\"download\">here</a> to download hello_image</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}