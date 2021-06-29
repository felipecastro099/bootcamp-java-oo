package saveTheRopa;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        Vestuario camiseta = new Vestuario("ADIDAS", "Azul");
        Vestuario tenis = new Vestuario("NIKE", "Jordan");

        Vestuario calca = new Vestuario("Rutra", "jeans");

        List<Vestuario> roupas = Arrays.asList(new Vestuario[]{camiseta, tenis});

        System.out.println("------------ Guarda roupa ---------------");

        guardaRoupa.guardarVestuario(roupas);
        System.out.println();
        guardaRoupa.mostrarVestuarios();

        System.out.println("------------ Guarda roupa depois das peças retiradas ---------------");

        guardaRoupa.devolverVestuario(1);

        guardaRoupa.mostrarVestuarios();
    }
}
