package fr.andrew.client.controller;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.business.impl.ClientsBusinessImpl;
import fr.andrew.client.domain.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ClientServlet",urlPatterns = "/client")
public class ClientServlet extends HttpServlet {
    private IClientsBusiness clientsBusiness = new ClientsBusinessImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        Client client = clientsBusiness.findOneByIdBusiness(id);

        request.setAttribute("client", client);

        this.getServletContext().getRequestDispatcher("/WEB-INF/client/client.jsp").forward(request,response);
    }
}
