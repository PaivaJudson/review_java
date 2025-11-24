package exercicio_5;

/**
 * <strong>Modelagem entre um livro e a categoria a que pertence</strong> (por exemplo,
 * “Tecnologia”, “Romance”, ...), utilizando “tem um” para representar a classificação.
 * 
 * <p>Esta classe armazena o nome e uma breve descrição da categoria.
 * 
 * @author Judson Paiva
 * @version 1.0
 * @since 2025-11-24
 */

public class Categoria {
	
	/**
     * O nome da categoria (e.g., "Romance", "História").
     */
	private String nome;
	
	/**
     * Uma descrição mais detalhada da categoria.
     */
	private String descricao;
	
	/**
     * Construtor da classe Categoria.
     * Cria uma nova categoria com um nome e uma descrição definidos.
     *
     * @param nome O nome da categoria.
     * @param descricao Uma breve descrição do tipo de conteúdo que a categoria abrange.
     */
	public Categoria(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Categoria [nome=" + nome + ", descricao=" + descricao + "]";
	}
}
