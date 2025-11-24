package exercicio_5;

/**
 * Representa um livro, armazenando seu título, autor, ano de
 * publicação e sua categoria.
 * 
 * <p>Esta classe faz parte do exercício 5 e demonstra o uso de
 * classes, construtores e métodos para encapsulamento de dados.
 * 
 * @author Judson Paiva
 * @version 1.0
 * @since 24-11-2025
 * @see Categoria
 */
public class Livro {
	/**
	 * O titulo do livro
	 */
	private String titulo;
	
	/**
	 * O nome do autor do livro
	 */
	private String autor;
	
	/**
	 * o ano de publicacao do livro
	 */
	private int ano;
	
	/**
	 * A categoria à qual o livro pertence (e.g., Ficção, Não-Ficção).
	 * Este é um objeto da classe {@code Categoria}
	 */
	private Categoria categoria;
	
	/**
	 * Construtor da classe Livro.
	 * Inicializa um novo objeto Livro com todos os seus atributos definidos.
	 * 
	 * @param titulo O título do livro.
	 * @param autor O nome do autor.
	 * @param ano O ano de publicação.
	 * @param categoria A categoria do livro.
	 */
	public Livro(String titulo, String autor, int ano, Categoria categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.categoria = categoria;
	}
	
	/**
	 * Altera a categoria atual do livro para uma nova categoria.
	 * 
	 * @param categoria A nova categoria a ser atribuída ao livro.
	 */
	public void alterarCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", categoria=" + categoria + "]";
	}
}
