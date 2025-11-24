package exercicio_quatro;

public class Cliente {

	private String nome;
	private String nif;
	private String telefone;
	private Endereco endereco;

	
	public Cliente(String nome, String nif, String telefone, Endereco endereco) {
		this.nome = nome;
		this.nif = nif;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public void atualizarTelefone(String novoTelefone) {
		telefone = novoTelefone;
	}
	
	public void atualizarEndereco(Endereco novoEndereco) {
		endereco = novoEndereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", nif=" + nif + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
