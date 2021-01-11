package edd_u5_shell;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(32);
        lista.add(6);
        lista.add(94);
        lista.add(0);
        lista.add(12);
        lista.add(19);
        lista.add(34);
        lista.add(1);
        System.out.println("Lista Original\n" + lista.toString());
        Shell(lista);
        System.out.println("Lista Ordenada\n" + lista.toString());
    }

    public static void Shell(List<Integer> l) {
        int i, j, k, salto, aux;
        salto = l.size() / 2;
        while (salto > 0) {
            for (i = salto; i < l.size(); i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (l.get(j) <= l.get(k)) {
                        j = -1;
                    } else {
                        aux = l.get(j);
                        l.set(j, l.get(k));
                        l.set(k, aux);
                        j -= salto;
                    }
                }
            }
            salto = salto / 2;
        }
    }
}
