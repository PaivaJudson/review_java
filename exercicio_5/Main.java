package exercicio_5;

public class Main {

	public static void main(String[] args) {
		
		Categoria categoria_um = new Categoria("Tecnologia", "Livros técnicos e científicos na área de TI e Engenharia");
		Categoria categoria_dois = new Categoria("Gestão", "Livros de administração, gestão de pessoas e negócios");
		
		Livro livro_um = new Livro("Introdução a Banco de Dados", "Silberschatz", 2011, categoria_um);
		System.out.println(livro_um);
		
		livro_um.alterarCategoria(categoria_dois);
		System.out.println(livro_um);
	}

}
