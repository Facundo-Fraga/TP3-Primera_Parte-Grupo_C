package Model;

import java.util.Arrays;

/**
 * Clase que representa un pastel de chocolate.
 * Hereda de Cake y define los ingredientes y la decoración específicos
 * para un pastel de chocolate.
 * 
 * @author Grupo C
 * @version 1.0
 */
public class ChocolateCake extends Cake {

    /**
     * Constructor de la clase ChocolateCake.
     * Establece el sabor del pastel como chocolate.
     */
    public ChocolateCake() {
        this.flavour = "Chocolate";
    }

    /**
     * Decora el pastel de chocolate.
     * Este método se invoca como parte del proceso de creación del pastel.
     */
    @Override
    void decorateCake() {
        this.decoration = "Chocolate ganache, crashed nuts and strawberries.";
    }

    /**
     * Prepara los ingredientes específicos para un pastel de chocolate.
     * Limpia la lista de ingredientes predeterminada y agrega los ingredientes correctos
     * para la preparación de un pastel de chocolate.
     */
    @Override
    void prepareIngredients() {
        String[] chocolateCakeIngredients = {"Flour", "Sugar", "Cocoa powder", "Baking powder", "Baking soda", "Salt", "Eggs", "Milk", "Vegetable oil", "Vanilla extract", "Water", "Butter", "Powdered sugar", "Chocolate chips", "Chocolate ganache", "Strawberries", "Nuts"};
        this.ingredients.clear();
        this.ingredients.addAll(Arrays.asList(chocolateCakeIngredients));
    }
}
