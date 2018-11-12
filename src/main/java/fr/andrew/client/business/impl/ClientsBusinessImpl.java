package fr.andrew.client.business.impl;

import fr.andrew.client.business.IClientsBusiness;
import fr.andrew.client.dao.IClientsDao;
import fr.andrew.client.dao.impl.ClientsDaoImpl;
import fr.andrew.client.domain.Client;
import fr.andrew.client.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class ClientsBusinessImpl implements IClientsBusiness {
    private static Logger LOGGER = LoggerFactory.getLogger(ClientsBusinessImpl.class);

    private IClientsDao clientsDao = new ClientsDaoImpl();

    @Override
    public ArrayList<Client> findAllBusiness() {
        LOGGER.info("[BUSINESS] Appelle du Business findAllBusiness()");

        ArrayList<Client> client = clientsDao.findAllDao();
        LOGGER.info("[BUSINESS]nombre de client : {}", client.size());
        return client;
    }

    @Override
    public Client findOneByIdBusiness(Integer id) {
        LOGGER.info("[BUSINESS] Appelle du Business findOneByIdBusiness()");

        Client client = clientsDao.findOneByIdDao(id);
        Utils.verifierEmail(client.getEmail());
        LOGGER.info("[BUSINESS] INFO client {} | {} | {} | {} | {} | {} | {} | {} | {}", client.getId(), client.getNumClient(), client.getNom(), client.getPrenom(), client.getAdresse(), client.getTelFixe(), client.getTelPortable(), client.getDateNaissance(), client.getEmail());
        return client;
    }

    @Override
    public Void addClientBusiness(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email) {
        LOGGER.info("[BUSINESS] Appelle du Business addClientBusiness()");

       clientsDao.addClientDao(numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email);
        return null;
    }

    @Override
    public Void modifierClientBusiness(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email, Integer id) {
        LOGGER.info("[BUSINESS] Appelle du Business modifierClientBusiness()");

        clientsDao.modifierClientDao(numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email,id);
        return null;
    }

    @Override
    public Void deleteClientBusiness(Integer id) {
        LOGGER.info("[BUSINESS] Appelle du Business deleteClientBusiness()");

        clientsDao.deleteClientDao(id);
        return null;
    }
}
