package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que define la plantilla para la creación de pasteles.
 * Proporciona los métodos necesarios para preparar los ingredientes,
 * hornear, decorar y empaquetar un pastel.
 * 
 * @author Grupo C
 * @version 1.0
 */
public abstract class Cake {

    /** Sabor del pastel */
    protected String flavour;

    /** Lista de ingredientes del pastel */
    protected List<String> ingredients = new ArrayList<>();

    /** Indica si el pastel está horneado */
    protected Boolean baking = false;

    /** Decoración del pastel */
    protected String decoration = "Not set";

    /** Indica si el pastel está empaquetado */
    protected Boolean packaging = false;

    /**
     * Constructor de la clase Cake.
     * Inicializa la lista de ingredientes con un valor predeterminado.
     */
    Cake() {
        this.ingredients.add("Not set");
    }

    /**
     * Método abstracto para preparar los ingredientes del pastel.
     * Debe ser implementado por las subclases con los ingredientes específicos
     * de cada tipo de pastel.
     */
    abstract void prepareIngredients();

    /**
     * Hornea el pastel y actualiza el estado de horneado.
     */
    protected void bakeCake() {
        this.baking = true;
    }

    /**
     * Método abstracto para decorar el pastel.
     * Debe ser implementado por las subclases con la decoración específica
     * de cada tipo de pastel.
     */
    abstract void decorateCake();

    /**
     * Empaca el pastel y actualiza el estado de empaquetado.
     */
    protected void packCake() {
        this.packaging = true;
    }

    /**
     * Método final que sigue el proceso completo para hacer un pastel.
     * Este método sigue el patrón plantilla, ejecutando los pasos necesarios
     * en orden: preparar los ingredientes, hornear el pastel, decorarlo y empaquetarlo.
     * 
     * @return el pastel listo con todos los pasos completados.
     */
    public final Cake makeCake() {
        prepareIngredients();
        bakeCake();
        decorateCake();
        packCake();
        return this;
    }

    /**
     * Devuelve una representación en cadena de las propiedades del pastel,
     * incluyendo los ingredientes, estado de horneado, decoración y empaquetado.
     * 
     * @return una cadena con los detalles del pastel
     */
    @Override
    public final String toString() {
        StringBuilder listedIngredients = new StringBuilder();
        for (String ingredient : ingredients) {
            listedIngredients.append("- ").append(ingredient).append("\n");
        }
    
        String outputString = String.format(
            "Cake flavour: %s\nCake ingredients:\n%sIs baked?: %s\nDecoration: %s\nIs packaged?: %s",
            flavour,
            listedIngredients.toString(), 
            baking, 
            decoration, 
            packaging
        );
        
        return outputString;
    }
}
