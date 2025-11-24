package exercicio_5;

/**
 * <strong>Modelagem entre um livro e a categoria a que pertence (por exemplo,
 * “Tecnologia”, “Romance”, ...), utilizando “tem um” para representar a classificação.
 * 
 * @author Judson Paiva
 * @version 1.0
 * @since 2025-11-24
 */

public class Categoria {
	
	private String nome;
	private String descricao;
	
	
	public Categoria(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", descricao=" + descricao + "]";
	}
}
