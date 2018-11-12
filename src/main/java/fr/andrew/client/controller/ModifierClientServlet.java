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

@WebServlet(name = "ModifierClientServlet",urlPatterns = "/modifierclient")
public class ModifierClientServlet extends HttpServlet {
    private IClientsBusiness clientsBusiness = new ClientsBusinessImpl();
    private static Logger LOGGER = LoggerFactory.getLogger(ModifierClientServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("[CONTROLLER] Appelle du controller ModifierClientServlet [doPost]");

        Integer numClient = Integer.valueOf(request.getParameter("numClient"));
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        String telFixe = request.getParameter("telFixe");
        String telPortable = request.getParameter("telPortable");
        String dateNaissance = request.getParameter("dateNaissance");
        String email = request.getParameter("email");
        Integer id = Integer.valueOf(request.getParameter("id"));

        clientsBusiness.modifierClientBusiness(numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email,id);

        LOGGER.info("[CONTROLLER] NOUVELLE INFO du client {} | {} | {} | {} | {} | {} | {} | {} | {}", id, numClient, nom, prenom, adresse, telFixe, telPortable, dateNaissance, email);
        response.sendRedirect("clients");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("[CONTROLLER] Appelle du controller ModifierClientServlet [doGet]");
        Integer id = Integer.valueOf(request.getParameter("id"));

        Client client = clientsBusiness.findOneByIdBusiness(id);

        request.setAttribute("client", client);
        LOGGER.info("[CONTROLLER] INFO du client {} | {} | {} | {} | {} | {} | {} | {} | {}", client.getId(), client.getNumClient(), client.getNom(), client.getPrenom(), client.getAdresse(), client.getTelFixe(), client.getTelPortable(), client.getDateNaissance(), client.getEmail());
        this.getServletContext().getRequestDispatcher("/WEB-INF/client/modifierclient.jsp").forward(request,response);
    }
}
