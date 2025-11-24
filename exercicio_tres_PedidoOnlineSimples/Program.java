package exercicio_tres_PedidoOnlineSimples;

public class Program {

	public static void main(String[] args) {
		
		PedidoOnline pedido = new PedidoOnline("PED-2025-001", "Headset Bluetooth", 3, 15000.0);
		System.out.println(pedido);
		
		pedido.marcarComoPago();
		System.out.println(pedido);
		
		pedido.marcarComoEnviado();
		System.out.println(pedido);
		
	}

}
