package tarefa_1;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<String> aluno = new TreeSet<String>();
		
		String a = new String("alpha");
		String b = new String("echo");
		String c = new String("chralie");
		String d = new String("foxtrot");
		String e = new String("delta");
		String f = new String("zulu");
		String g = new String("yankie");
		String h = new String("wiskey");
		
		aluno.add(a);
		aluno.add(b);
		aluno.add(c);
		aluno.add(d);
		aluno.add(e);
		aluno.add(f);
		aluno.add(g);
		aluno.add(h);
		
		System.out.println(aluno);

	}

}
