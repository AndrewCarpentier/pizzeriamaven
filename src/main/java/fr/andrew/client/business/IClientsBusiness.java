package fr.andrew.client.business;

import fr.andrew.client.domain.Client;

import java.util.ArrayList;

public interface IClientsBusiness {

     ArrayList<Client> findAllBusiness();
     Client findOneByIdBusiness(Integer id);
     Void addClientBusiness(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email);
     Void deleteClientBusiness(Integer id);
     Void modifierClientBusiness(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email, Integer id);

}
