package Model;

import java.util.Arrays;

/**
 * Clase que representa un pastel de vainilla.
 * Hereda de Cake y define los ingredientes y la decoración específicos
 * para un pastel de vainilla.
 * 
 * @author Grupo C
 * @version 1.0
 */
public class VanillaCake extends Cake {

    /**
     * Constructor de la clase VanillaCake.
     * Establece el sabor del pastel como vainilla.
     */
    public VanillaCake() {
        this.flavour = "Vanilla";
    }

    /**
     * Decora el pastel de vainilla.
     * Este método se invoca como parte del proceso de creación del pastel.
     */
    @Override
    void decorateCake() {
        this.decoration = "Vanilla buttercream frosting and sprinkles.";
    }

    /**
     * Prepara los ingredientes específicos para un pastel de vainilla.
     * Limpia la lista de ingredientes predeterminada y agrega los ingredientes correctos
     * para la preparación de un pastel de vainilla.
     */
    @Override
    void prepareIngredients() {
        String[] vanillaCakeIngredients = {"Flour", "Sugar", "Baking powder", "Baking soda", "Salt", "Eggs", "Milk", "Vegetable oil", "Vanilla extract", "Butter", "Powdered sugar", "Water"};
        this.ingredients.clear();
        this.ingredients.addAll(Arrays.asList(vanillaCakeIngredients));
    }
}
