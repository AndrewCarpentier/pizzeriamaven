package fr.andrew.pizza.controller;

import fr.andrew.pizza.business.IPizzaBusiness;
import fr.andrew.pizza.business.impl.PizzaBusinessImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddPizzaServlet",urlPatterns = "/addpizza")
public class AddPizzaServlet extends HttpServlet {
    IPizzaBusiness pizzaBusiness = new PizzaBusinessImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        String reference = request.getParameter("reference");
        Integer prix = Integer.valueOf(request.getParameter("prix"));
        String urlImage = request.getParameter("urlImage");

        pizzaBusiness.addPizzaBusiness(libelle,reference,prix,urlImage);

        response.sendRedirect("pizza");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/addpizza.jsp").forward(request,response);
    }
}
