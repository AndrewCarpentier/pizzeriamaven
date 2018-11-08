package fr.andrew.client.dao.impl;

import fr.andrew.client.dao.IClientsDao;
import fr.andrew.client.domain.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClientsDaoImpl implements IClientsDao {

    @Override
    public ArrayList<Client> findAllDao() {
        ArrayList<Client> clients = new ArrayList<>();
        try{
            Class.forName("org.mariadb.jdbc.Driver");
                String url = "jdbc:mariadb://localhost:3306/pizzeria";
                String user = "root";
                String password = "andrew";
            Connection connection = DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM client");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                Integer numClient = resultSet.getInt("num_client");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String adresse = resultSet.getString("adresse");
                String telFixe = resultSet.getString("tel_fixe");
                String telPortable = resultSet.getString("tel_portable");
                String dateNaissance = resultSet.getString("date_naissance");
                String email = resultSet.getString("email");

                Client client = new Client(id,numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email);
                clients.add(client);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return clients;
    }

    @Override
    public Client findOneByIdDao(Integer id) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/pizzeria";
            String user = "root";
            String password = "andrew";
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM client WHERE id = ?");
                preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Integer idBD = resultSet.getInt("id");
                Integer numClient = resultSet.getInt("num_client");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String adresse = resultSet.getString("adresse");
                String telFixe = resultSet.getString("tel_fixe");
                String telPortable = resultSet.getString("tel_portable");
                String dateNaissance = resultSet.getString("date_naissance");
                String email = resultSet.getString("email");

                Client client = new Client(idBD,numClient,nom,prenom,adresse,telFixe,telPortable,dateNaissance,email);

                return client;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Void addClientDao(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email) {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root", "andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO client(num_client,nom,prenom,adresse,tel_fixe,tel_portable,date_naissance,email) VALUES(?,?,?,?,?,?,?,?)");
                preparedStatement.setInt(1,numClient);
                preparedStatement.setString(2,nom);
                preparedStatement.setString(3,prenom);
                preparedStatement.setString(4,adresse);
                preparedStatement.setString(5,telFixe);
                preparedStatement.setString(6,telPortable);
                preparedStatement.setString(7,dateNaissance);
                preparedStatement.setString(8,email);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Void modifierClientDao(Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email, Integer id) {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria","root","andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE client SET num_client = ?, nom = ?, prenom = ?, adresse = ?, tel_fixe = ?, tel_portable = ?, date_naissance = ?, email = ? WHERE id = ?");
                preparedStatement.setInt(1,numClient);
                preparedStatement.setString(2,nom);
            preparedStatement.setString(3,prenom);
            preparedStatement.setString(4,adresse);
            preparedStatement.setString(5,telFixe);
            preparedStatement.setString(6,telPortable);
            preparedStatement.setString(7,dateNaissance);
            preparedStatement.setString(8,email);
            preparedStatement.setInt(9,id);
        preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Void deleteClientDao(Integer id) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria","root","andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM client WHERE id = ?");
                preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
