package fr.andrew.client.controller;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.business.impl.ClientsBusinessImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteClientServlet",urlPatterns = "/deleteclient")
public class DeleteClientServlet extends HttpServlet {
    IClientsBusiness clientsBusiness = new ClientsBusinessImpl();
    private static Logger LOGGER = LoggerFactory.getLogger(DeleteClientServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("[CONTROLLER] Appelle du controller DeleteClientServlet [doPost]");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("[CONTROLLER] Appelle du DeleteClientServlet [doGet]");
        Integer id = Integer.valueOf(request.getParameter("id"));

        clientsBusiness.deleteClientBusiness(id);
        LOGGER.info("[CONTROLLER] Delete de l'utilisateur avec l'id : {}", id);
        response.sendRedirect("clients");
    }
}
