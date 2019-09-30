package states;
import interfaces.Ecommerce;

public class PedidoFinalizado implements Ecommerce{

	public PedidoFinalizado(int finalizado) {
		super();
		finalizado(finalizado);
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
		infoEstado();
		if(finalizado == 1) {
			System.out.println("Compra concluida com sucesso! Agradecemos a preferência!");
		} else {
			System.out.println("Pedido finalizado, compra cancelada!");
		}
		return this;
	}

	@Override
	public boolean pergunta(String confirmacao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void infoEstado() {
		System.out.println("Estado = Pedido Finalizado");
	}

	@Override
	public Ecommerce pronto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce devolucao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce reembolso() {
		// TODO Auto-generated method stub
		return null;
	}

}
