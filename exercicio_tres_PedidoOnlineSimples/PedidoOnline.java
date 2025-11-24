package exercicio_tres_PedidoOnlineSimples;

public class PedidoOnline {
	
	private String numeroPedido;
	private String descricaoProduto;
	private int quantidade;
	private double precoUnitario;
	private String estado;
	
	
	public PedidoOnline(String numeroPedido, String descricaoProduto, int quantidade, double precoUnitario) {
		this.numeroPedido = numeroPedido;
		this.descricaoProduto = descricaoProduto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.estado = "NOVO";
	}

	public double calcularTotal() {
		return quantidade * precoUnitario;
	}
	
	public void marcarComoPago() {
		estado = "PAGO";
	}
	
	public boolean marcarComoEnviado() {
		if(estado.equals("PAGO")) {
			estado = "ENVIADO";
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "PedidoOnline [numeroPedido=" + numeroPedido + ", descricaoProduto=" + descricaoProduto + ", quantidade="
				+ quantidade + ", precoUnitario=" + precoUnitario + ", estado=" + estado + ", calcularTotal()="
				+ calcularTotal() + ", marcarComoEnviado()=" + marcarComoEnviado() + "]";
	} 
	
	
	
	
}
