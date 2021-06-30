package aula_3_ex_2;

public class exercicioDois {
    public static void main(String[] args) {
        Empresa x = new Empresa("x", 1.13);
        Empresa y = new Empresa("y", 18.4);

        for (int year = 2021; y.getValor() > x.getValor(); year++) {
            System.out.println("Empresa " + x.getNome() + " - " + "01/01/" + year + " - " + "valor da empresa: " + x.getValor());
            x.setValor(x.getValor() * 2.48);

            System.out.println("Empresa " + y.getNome() + " - " + "01/01/" + year + " - " + "valor da empresa: " + y.getValor());
            y.setValor(y.getValor() * 1.32);
        }
    }
}
