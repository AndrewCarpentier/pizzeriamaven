package fr.andrew.pizza.business;

import fr.andrew.pizza.domain.Pizza;

import java.util.ArrayList;

public interface IPizzaBusiness {

    public ArrayList<Pizza> getPizzaBusiness();
    public Pizza getPizzaByIdBusiness(Integer id);
    public Void addPizzaBusiness(String libelle, String reference, Integer prix, String urlImage);
    public Void deletePizzaBusiness(Integer id);
    public Void modifierPizzaBusiness(String libelle, String reference, Integer prix, String urlImage, Integer id);

}
