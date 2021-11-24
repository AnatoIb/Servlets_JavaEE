package com.example.Servlets_JavaEE;

import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CreateServlet", value = "/CreateServlet")
public class CreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/png");
        Random random = new Random();

        int x = random.nextInt(256);
        int y = random.nextInt(256);
        int z = random.nextInt(256);

        Color color = new Color(x, y, z);
        Font font = new Font("Arial", 1, 72);

        BufferedImage bufferedImage = new BufferedImage(640, 120, 1);
        Graphics graphics = bufferedImage.getGraphics();
        graphics.setColor(color);
        graphics.setFont(font);
        graphics.drawString("Hello World!", 100, 100);

        ImageIO.write(bufferedImage, "png", new File("C:\\Это папка\\#]~&№$ Java\\Servlets_JavaEE\\target\\Servlets_JavaEE-1.0-SNAPSHOT\\image\\hello.png"));

        response.sendRedirect("/Servlets_JavaEE_war_exploded/hello-servlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
