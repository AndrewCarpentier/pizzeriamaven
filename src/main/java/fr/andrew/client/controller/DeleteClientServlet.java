package fr.andrew.client.controller;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.business.impl.ClientsBusinessImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteClientServlet",urlPatterns = "/deleteclient")
public class DeleteClientServlet extends HttpServlet {
    IClientsBusiness clientsBusiness = new ClientsBusinessImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        clientsBusiness.deleteClientBusiness(id);

        response.sendRedirect("clients");
    }
}
