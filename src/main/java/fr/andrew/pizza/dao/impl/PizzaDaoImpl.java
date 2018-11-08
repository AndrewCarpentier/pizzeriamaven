package fr.andrew.pizza.dao.impl;

import fr.andrew.pizza.dao.IPizzaDao;
import fr.andrew.pizza.domain.Pizza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PizzaDaoImpl implements IPizzaDao {

    @Override
    public ArrayList<Pizza> getPizzaDao() {
        ArrayList<Pizza> pizza = new ArrayList<>();
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria", "root","andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM pizza");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String libelle = resultSet.getString("libelle");
                String reference = resultSet.getString("reference");
                Integer prix = resultSet.getInt("prix");
                String url_image = resultSet.getString("url_image");

                Pizza p = new Pizza(id,libelle,reference,prix,url_image);

                pizza.add(p);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return pizza;
    }

    @Override
    public Pizza getPizzaByIdDao(Integer id) {

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria","root","andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM pizza WHERE id = ?");
                preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer idBD = resultSet.getInt("id");
                String libelle = resultSet.getString("libelle");
                String reference = resultSet.getString("reference");
                Integer prix = resultSet.getInt("prix");
                String url_image = resultSet.getString("url_image");

                Pizza p = new Pizza(idBD,libelle,reference,prix,url_image);

                return p;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Void addPizzaDao(String libelle, String reference, Integer prix, String urlImage) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria","root","andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO pizza(libelle, reference, prix, url_image) VALUES(?,?,?,?)");
                preparedStatement.setString(1,libelle);
                preparedStatement.setString(2,reference);
                preparedStatement.setInt(3,prix);
                preparedStatement.setString(4,urlImage);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Void modifierPizzaDao(String libelle, String reference, Integer prix, String urlImage, Integer id) {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria","root","andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE pizza SET libelle = ? ,reference = ? , prix = ? , url_image = ? WHERE id = ?");
                preparedStatement.setString(1,libelle);
                preparedStatement.setString(2,reference);
                preparedStatement.setInt(3,prix);
                preparedStatement.setString(4,urlImage);
                preparedStatement.setInt(5,id);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Void deletePizzaDao(Integer id) {
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pizzeria","root","andrew");
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM pizza WHERE id = ?");
                preparedStatement.setInt(1,id);
            preparedStatement.executeQuery();

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
