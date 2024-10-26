import Model.ChocolateCake;
import Model.VanillaCake;

public class App {
    public static void main(String[] args) throws Exception {

        ChocolateCake chocCake = new ChocolateCake();
        chocCake.makeCake();

        VanillaCake vanCake = new VanillaCake();
        vanCake.makeCake();

        String output = chocCake.toString();
        System.out.println(output);

        System.out.println("\n");

        output = vanCake.toString();
        System.out.println(output);
    }
}
