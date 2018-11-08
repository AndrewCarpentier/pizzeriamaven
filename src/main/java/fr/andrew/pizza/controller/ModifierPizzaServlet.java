package fr.andrew.pizza.controller;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.business.impl.ClientsBusinessImpl;
import fr.andrew.pizza.business.IPizzaBusiness;
import fr.andrew.pizza.business.impl.PizzaBusinessImpl;
import fr.andrew.pizza.domain.Pizza;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifierPizzaServlet",urlPatterns = "/modifierpizza")
public class ModifierPizzaServlet extends HttpServlet {
    private IPizzaBusiness pizzaBusiness = new PizzaBusinessImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String libelle = request.getParameter("libelle");
        String reference = request.getParameter("reference");
        Integer prix = Integer.valueOf(request.getParameter("prix"));
        String urlImage = request.getParameter("urlImage");
        Integer id = Integer.valueOf(request.getParameter("id"));

        pizzaBusiness.modifierPizzaBusiness(libelle,reference,prix,urlImage,id);

        response.sendRedirect("pizza");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        Pizza pizza = pizzaBusiness.getPizzaByIdBusiness(id);

        request.setAttribute("pizza", pizza);

        this.getServletContext().getRequestDispatcher("/WEB-INF/pizza/modifierPizza.jsp").forward(request,response);
    }
}
