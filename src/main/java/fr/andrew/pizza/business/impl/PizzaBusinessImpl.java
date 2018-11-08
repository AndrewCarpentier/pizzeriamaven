package fr.andrew.pizza.business.impl;

import fr.andrew.pizza.business.IPizzaBusiness;
import fr.andrew.pizza.dao.IPizzaDao;
import fr.andrew.pizza.dao.impl.PizzaDaoImpl;
import fr.andrew.pizza.domain.Pizza;

import java.util.ArrayList;

public class PizzaBusinessImpl implements IPizzaBusiness {

    IPizzaDao pizzaDao = new PizzaDaoImpl();

    @Override
    public ArrayList<Pizza> getPizzaBusiness() {
        ArrayList<Pizza> pizza = pizzaDao.getPizzaDao();
        return pizza;
    }

    @Override
    public Pizza getPizzaByIdBusiness(Integer id) {
        Pizza pizza = pizzaDao.getPizzaByIdDao(id);
        return pizza;
    }

    @Override
    public Void addPizzaBusiness(String libelle, String reference, Integer prix, String urlImage) {
        pizzaDao.addPizzaDao(libelle, reference, prix, urlImage);
        return null;
    }

    @Override
    public Void modifierPizzaBusiness(String libelle, String reference, Integer prix, String urlImage, Integer id) {
        pizzaDao.modifierPizzaDao(libelle,reference,prix,urlImage,id);
        return null;
    }

    @Override
    public Void deletePizzaBusiness(Integer id) {
        pizzaDao.deletePizzaDao(id);
        return null;
    }

}
