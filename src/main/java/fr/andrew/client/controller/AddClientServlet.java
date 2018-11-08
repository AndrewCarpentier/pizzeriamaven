package fr.andrew.client.controller;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.business.impl.ClientsBusinessImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddClientServlet",urlPatterns = "/addclient")
public class AddClientServlet extends HttpServlet {
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

        clientsBusiness.addClientBusiness(numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email);

        response.sendRedirect("clients");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/WEB-INF/client/addclient.jsp").forward(request,response);
    }
}
