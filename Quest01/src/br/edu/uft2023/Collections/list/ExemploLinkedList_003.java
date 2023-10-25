package br.edu.uft2023.Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Ao contrário do ArrayList, as buscas são lentas e inserções e exclusões são rápidas.
 *
 * @author wosley.arruda
 */
public class ExemploLinkedList_003 {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = new LinkedList<>();
        lista.add("Wosley Arruda");
        lista.add("Maria Você Me Mata");
        lista.add("Naida Navinda Navolta Pereira");
        lista.add("Dolores Fuertes de Barriga");
        System.out.println(lista);
        System.out.println(""); 
        lista.remove(0);
        System.out.println(lista);
        
        boolean contem = lista.contains("Wosley Arruda");
        System.out.println(contem);
        
        System.out.println("------------------");
        for(String nome: lista) {
        	System.out.println(nome);
        }
        
        System.out.println("Valor específico na lista"+lista.get(0));
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new LinkedList<String>();
        lista.add("Wosley Arruda");
        lista.add("Maria Você Me Mata");
        lista.add("Naida Navinda Navolta Pereira");
        lista.add("Dolores Fuertes de Barriga");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
