package tarefa_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

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
		
		//a interface Map.Entry fornece métodos para obter e modificar a chave e o valor de uma entrada
		
		System.out.println("Grupo masculino:\n");
		
		for (Entry<String, String> entry : grupo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(value.equals("m"))
            System.out.println(key);
		}
		
		System.out.println("\n");
		System.out.println("Grupo feminino:\n");
		
		for (Entry<String, String> entry : grupo.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if(value.equals("f"))
            System.out.println(key);
		}
	}
}
