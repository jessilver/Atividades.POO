package br.edu.uft2023.Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.edu.uft2023.Collections.list.Aluno;

/**
 *
 * É como um array cujo tamanho pode crescer.
 * A busca de um elemento é rápida, mas inserções e exclusões não são.
 *
 * @author wosley.arruda
 */
public class ExemploArrayList_001 {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaNomes ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Wosley Arruda");
        lista.add("Maria Você Me Mata");
        lista.add("Naida Navinda Navolta Pereira");
        lista.add("Dolores Fuertes de Barriga");
        System.out.println(lista);
        System.out.println("");
 
    }
    

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<String>();
        lista.add("Bernardo Mota");
        lista.add("Daniel Arruda");
        lista.add("Murilo Pereira");
        lista.add("Lucas Yudi");
        lista.add("Iago Arruda"); 
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
    
    private static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******"); 
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }
 
}
