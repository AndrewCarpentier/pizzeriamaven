package fr.andrew.pizza.dao;

import fr.andrew.pizza.domain.Pizza;

import java.util.ArrayList;

public interface IPizzaDao {

    public ArrayList<Pizza> getPizzaDao();
    public Pizza getPizzaByIdDao(Integer id);
    public Void addPizzaDao(String libelle, String reference, Integer prix, String urlImage);
    public Void deletePizzaDao(Integer id);
    public Void modifierPizzaDao (String libelle, String reference, Integer prix, String urlImage, Integer id);

}
