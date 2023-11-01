package tarefa_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String op = new String();
		String nome = new String();
		String sexo = new String();
		
		Map<String, String> grupo = new HashMap<String, String>();
		
		while(true) {
			
			System.out.println("Deseja adiconar um novo elmento?\nDigite sim ou nao: ");
			op=sc.next();
			
			if(op.equals("n"))break;
			
			System.out.println("digite o nome: ");
			nome=sc.next();
			
			System.out.println("digite o sexo: ");
			sexo=sc.next();
			
			grupo.put(nome, sexo);
				
		}
		
		System.out.println("Grupo masculino:\n");
		for(String i : grupo.keySet()) {
			if(grupo.containsValue("m")) {
				System.out.println(i);
			}
		}
		
		System.out.println("\n");
		System.out.println("Grupo feminino:\n");
		for(String i : grupo.keySet()) {
			if(grupo.containsValue("f")) {
				System.out.println(i);
			}
		}
	}
}
