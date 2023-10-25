package br.edu.uft2023.Collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wosley.arruda
 */
public class ExemploArrayListAluno_002 {

    public static void main(String args[]) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("****** exemploListaSimplesOrdenadaClasseExterna ******");
        
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Bernardo Mota", "POO", 0);
        Aluno b = new Aluno("Daniel Arruda", "POO", 0);
        Aluno c = new Aluno("Murilo Pereira", "POO", 0);
        Aluno d = new Aluno("Lucas Yudi", "POO", 0);
        Aluno e = new Aluno("Iago Arruda", "POO", 0);
        Aluno f = new Aluno("Guilherme Thomaz", "Empreendedorismo e inovação", 0);
        Aluno g = new Aluno("Marcos Freire de Melo", "Empreendedorismo e inovação", 0);
 

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("****** exemploListaSimplesOrdenadaComparatorAluno ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Bernardo Mota", "POO", 30);
        Aluno b = new Aluno("Daniel Arruda", "POO", 31);
        Aluno c = new Aluno("Murilo Pereira", "POO", 25);
        Aluno d = new Aluno("Lucas Yudi", "POO", 23);
        Aluno e = new Aluno("Iago Arruda", "POO", 35);
        Aluno f = new Aluno("Guilherme Thomaz", "Empreendedorismo e inovação", 20);
        Aluno g = new Aluno("Marcos Freire de Melo", "Empreendedorismo e inovação", 10);
 

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);
        lista.add(g);
        //lista.add("teste");
        //lista.add(10);
        //toString
        System.out.println("Lista sem ordenação" + lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenação" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota" + lista);

        System.out.println("");
    }
}
