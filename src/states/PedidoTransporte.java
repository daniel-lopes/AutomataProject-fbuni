package states;
import interfaces.Ecommerce;

public class PedidoTransporte implements Ecommerce{

	public PedidoTransporte() {
		super();
		emTranporte();
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
		infoEstado();
		System.out.println("Pedido em transporte, por favor aguarde!\n");
		return new PedidoEntregue();
	}

	@Override
	public Ecommerce entregue() {
		// TODO Auto-generated method stub
		return null;
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
		System.out.println("Estado = Pedido em Transporte");
	}

}
