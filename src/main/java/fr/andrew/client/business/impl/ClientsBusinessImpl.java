package fr.andrew.client.business.impl;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.dao.IClientsDao;
import fr.andrew.client.dao.impl.ClientsDaoImpl;
import fr.andrew.client.domain.Client;

import java.util.ArrayList;

public class ClientsBusinessImpl implements IClientsBusiness {

    private IClientsDao clientsDao = new ClientsDaoImpl();

    @Override
    public ArrayList<Client> findAllBusiness() {
        ArrayList<Client> client = clientsDao.findAllDao();
        return client;
    }

    @Override
    public Client findOneByIdBusiness(Integer id) {
        Client client = clientsDao.findOneByIdDao(id);
        return client;
    }

    @Override
    public Void addClientBusiness(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email) {
       clientsDao.addClientDao(numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email);
        return null;
    }

    @Override
    public Void modifierClientBusiness(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email, Integer id) {
        clientsDao.modifierClientDao(numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email,id);
        return null;
    }

    @Override
    public Void deleteClientBusiness(Integer id) {
        clientsDao.deleteClientDao(id);
        return null;
    }
}
