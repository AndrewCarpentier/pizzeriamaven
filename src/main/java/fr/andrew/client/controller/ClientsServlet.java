package fr.andrew.client.controller;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.business.impl.ClientsBusinessImpl;
import fr.andrew.client.domain.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ClientsServlet",urlPatterns = "/clients")
public class ClientsServlet extends HttpServlet {
    private IClientsBusiness clientsBusiness = new ClientsBusinessImpl();
    private static Logger LOGGER = LoggerFactory.getLogger(ClientsServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Client> client = clientsBusiness.findAllBusiness();

        request.setAttribute("client",client);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/client/clients.jsp").forward(request,response);
    }
}
