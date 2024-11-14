package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "RandomNumberServlet", urlPatterns = {"/generateRandomNumber"})
public class RandomNumberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // Set response type to HTML
        response.setContentType("text/html");

        // Display the result
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Random Number Generator</h1>");
        out.println("<p>Generated Random Number: " + randomNumber + "</p>");
        out.println("<a href=\"index.jsp\">Generate Another Number</a>");
        out.println("</body></html>");
    }
}
