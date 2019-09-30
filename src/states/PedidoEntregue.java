package states;
import java.util.Scanner;

import interfaces.Ecommerce;

public class PedidoEntregue implements Ecommerce {

	private Scanner ler;

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
		String confirmacao = "Seu pedido chegou de acordo como solicitado? Se não você poderá fazer a devolução";
		if(pergunta(confirmacao)) {
			return new PedidoFinalizado(1);
		}
		return new PedidoDevolucao();
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
		System.out.println("Estado = Pedido Entregue");
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
