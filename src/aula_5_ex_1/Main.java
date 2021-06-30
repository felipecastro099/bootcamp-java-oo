package aula_5_ex_1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Felipe", "232392039");
        Pessoa p2 = new Pessoa("Gabriel", "2039203921");
        Pessoa p3 = new Pessoa("Renam", "59404390");
        Pessoa p4 = new Pessoa("Carlos", "3298329832");
        Pessoa p5 = new Pessoa("Andre", "93829382938");

        Pessoa[] arr = {p1, p2, p3, p4, p5};

        SortUtil.sort(arr);

        for(Pessoa p : arr) {
            System.out.println(p);
        }

        Celular c1 = new Celular("083","98885-8434");
        Celular c2 = new Celular("011", "91234-5678");
        Celular c3 = new Celular("082", "99434-5623");
        Celular c4 = new Celular("013","99134-2343");
        Celular c5 = new Celular("064","93423-6784");

        Celular[] celulares = {c1, c2, c3, c4, c5};

        SortUtil.sort(celulares);

        for(Celular c : celulares) {
            System.out.println(c);
        }
    }
}
