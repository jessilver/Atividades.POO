package pessoa;

public class Serasa {

	public static void main(String[] args) {
		PessoaFisica f = new PessoaFisica();
		PessoaJuridica j = new PessoaJuridica();
		
		f.setNome("Julio Alves Arborino");
		f.setIdade(21);
		f.setCpf("123.456.789-12");
		
		j.setNome("Dois Irmãos");
		j.setIdade(10);
		j.setCnpj("987.654.321-98");
		
		System.out.println("Pessoa juridica:");
		System.out.println("nome "+j.getNome());
		System.out.println("idade "+j.getIdade());
		System.out.println("cnpj "+j.getCnpj());
		System.out.println("Pessoa Fisica:");
		System.out.println("nome "+f.getNome());
		System.out.println("idade "+f.getIdade());
		System.out.println("cpf "+f.getCpf());

	}

}
