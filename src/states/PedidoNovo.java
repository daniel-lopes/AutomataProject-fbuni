package states;
import java.util.Scanner;
import interfaces.Ecommerce;

public class PedidoNovo implements Ecommerce{

	private Scanner ler;
	
	public PedidoNovo() {
		super();
		pedidoNovo();
	}

	@Override
	public Ecommerce pedidoNovo() {
		infoEstado();
		String confirmacao = "Pedido adicionado ao carrinho, deseja prosseguir com a compra?";
		if(pergunta(confirmacao)) {
			return new PedidoAprovado();
		}
		return new PedidoCancelado();
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pergunta(String confirmacao) {
		// TODO Auto-generated method stub
		System.out.println(confirmacao);
		ler = new Scanner(System.in);
		String resposta = ler.nextLine();
		if(resposta.trim().toLowerCase().charAt(0) == 's') {
			return true;
		}
		return false;
	}

	@Override
	public void infoEstado() {
		System.out.println("Estado = Pedido Novo");
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
