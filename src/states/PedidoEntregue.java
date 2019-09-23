package states;
import interfaces.Ecommerce;

public class PedidoEntregue implements Ecommerce {

	public PedidoEntregue() {
		super();
		entregue();
	}
	
	@Override
	public Ecommerce pedidoNovo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce aprovado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce emTranporte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce entregue() {
		infoEstado();
		System.out.println("Pedido entregue com sucesso!\n");
		return new PedidoFinalizado(1);
	}

	@Override
	public Ecommerce cancelado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce finalizado(int finalizado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pergunta(String confirmacao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void infoEstado() {
		System.out.println("Estado = Pedido Entregue");
	}

}
