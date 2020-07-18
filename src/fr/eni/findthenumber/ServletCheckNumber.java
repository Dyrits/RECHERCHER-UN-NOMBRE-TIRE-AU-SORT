package fr.eni.findthenumber;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;

@WebServlet(
        urlPatterns = "/CheckNumber/ServletCheckNumber",
        initParams = {
                @WebInitParam(name= "Minimum", value= "10"),
                @WebInitParam(name= "Maximum", value= "20")
        }
)
public class ServletCheckNumber extends HttpServlet {
    private static int randomNumber;
    private int minValue = 0, maxValue = 10;

    @Override
    public void init() throws ServletException {
        super.init();
        String minimum = this.getInitParameter("Minimum");
        String maximum = this.getInitParameter("Maximum");
        if (minimum != null && !minimum.isEmpty()) { this.minValue = Integer.parseInt(minimum); }
        if (maximum != null && !maximum.isEmpty()) { this.maxValue = Integer.parseInt(maximum); }
        randomNumber = new Random().nextInt(this.maxValue - this.minValue) + this.minValue;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guess = Integer.parseInt(request.getParameter("number"));
        response.sendRedirect(guess == randomNumber ? "./success.html" : "./fail.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
