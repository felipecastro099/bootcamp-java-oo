package aula1TT;

import java.util.ArrayList;
import java.util.List;

public class exercicioTres {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 10.99, 2);
        Produto feijao = new Produto("Feijão", 14.49, 1);
        Produto tomate = new Produto("Tomate", 9.99, 5);

        List<Produto> produtos = new ArrayList<Produto>();

        produtos.add(arroz);
        produtos.add(feijao);
        produtos.add(tomate);

        int i = 1;
        Double contador = 0.0;

        for (Produto produto: produtos) {
            System.out.println("Produto " + i);
            System.out.println(produto.getNome());
            System.out.println(produto.getValor());
            System.out.println("Quantidade: " + produto.getQuantidade() + "\n");

            i++;
            contador =+ produto.getValor() * produto.getQuantidade();
        }

        System.out.println("total: " + contador);
    }
}
