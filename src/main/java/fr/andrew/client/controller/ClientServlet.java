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

@WebServlet(name = "ClientServlet",urlPatterns = "/client")
public class ClientServlet extends HttpServlet {
    private IClientsBusiness clientsBusiness = new ClientsBusinessImpl();
    private static Logger LOGGER = LoggerFactory.getLogger(ClientServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("[CONTROLLER] Appelle du controller ClientServlet [doPost]");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("[CONTROLLER] Appelle du controller ClientServlet [doGet]");
        Integer id = Integer.valueOf(request.getParameter("id"));

        Client client = clientsBusiness.findOneByIdBusiness(id);

        request.setAttribute("client", client);

        LOGGER.info("[CONTROLLER] id,nom,prenom client : {} {} {}", client.getId(), client.getNom(), client.getPrenom());
        this.getServletContext().getRequestDispatcher("/WEB-INF/client/client.jsp").forward(request,response);
    }
}
