package fr.andrew.pizza.controller;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.business.impl.ClientsBusinessImpl;
import fr.andrew.pizza.business.IPizzaBusiness;
import fr.andrew.pizza.business.impl.PizzaBusinessImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeletePizzaServlet",urlPatterns = "/deletepizza")
public class DeletePizzaServlet extends HttpServlet {
    IPizzaBusiness pizzaBusiness = new PizzaBusinessImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        pizzaBusiness.deletePizzaBusiness(id);

        response.sendRedirect("pizza");
    }
}
