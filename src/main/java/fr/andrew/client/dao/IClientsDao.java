package fr.andrew.client.dao;

import fr.andrew.client.domain.Client;

import java.util.ArrayList;

public interface IClientsDao {

     ArrayList<Client> findAllDao();
     Client findOneByIdDao(Integer id);
     Void addClientDao(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email);
     Void deleteClientDao(Integer id);
    Void modifierClientDao(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email, Integer id);

}
