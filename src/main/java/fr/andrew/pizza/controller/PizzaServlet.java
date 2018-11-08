package fr.andrew.pizza.controller;

import fr.andrew.pizza.business.IPizzaBusiness;
import fr.andrew.pizza.business.impl.PizzaBusinessImpl;
import fr.andrew.pizza.domain.Pizza;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PizzaServlet",urlPatterns = "/pizza")
public class PizzaServlet extends HttpServlet {
    IPizzaBusiness pizzaBusiness = new PizzaBusinessImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Pizza> pizza = pizzaBusiness.getPizzaBusiness();

        request.setAttribute("pizza", pizza);

        this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/pizza.jsp").forward(request,response);
    }
}
