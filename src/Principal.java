import pedido.Pedido;
import states.PedidoPronto;

public class Principal {

	public static void main(String[] args) {
		Pedido pedido = new Pedido("2 kg de pão", 1, 100);
		pedido.setState(new PedidoPronto());
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												

}
