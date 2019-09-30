package states;
import java.util.Scanner;

import interfaces.Ecommerce;

public class PedidoCancelado implements Ecommerce {

	private Scanner ler;
	
	public PedidoCancelado() {
		super();
		cancelado();
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
		infoEstado();
		String confirmacao = "Deseja realmente cancelar a compra?";
		if(pergunta(confirmacao)) {
			return new PedidoFinalizado(0);
		}
		return new PedidoPronto();
	}

	@Override
	public Ecommerce finalizado(int finalizado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pergunta(String confirmacao) {
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
		System.out.println("Estado = Pedido Cancelado");
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
