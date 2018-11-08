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

@WebServlet(name = "ModifierClientServlet",urlPatterns = "/modifierclient")
public class ModifierClientServlet extends HttpServlet {
    private IClientsBusiness clientsBusiness = new ClientsBusinessImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

        response.sendRedirect("clients");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        Client client = clientsBusiness.findOneByIdBusiness(id);

        request.setAttribute("client", client);

        this.getServletContext().getRequestDispatcher("/WEB-INF/client/modifierclient.jsp").forward(request,response);
    }
}
