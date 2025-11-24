package exercicio_quatro;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cidade;
	private String pais;
	
	
	public Endereco(String rua, String bairro, String cidade, String pais) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", pais=" + pais + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}	
	
	
}
