package states;
import java.util.Scanner;

import interfaces.Ecommerce;

public class PedidoDevolucao implements Ecommerce{

	private Scanner ler;
	
	public PedidoDevolucao() {
		super();
		devolucao();
	}

	@Override
	public Ecommerce pronto() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce devolucao() {
		infoEstado();
		String confirmacao = "Deseja prosseguir com a devolu��o?";
		if(pergunta(confirmacao)) {
			return new PedidoReembolso();
		}
		
		return new PedidoEntregue();
	}

	@Override
	public Ecommerce reembolso() {
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
		System.out.println("Estado = Pedido Devolu��o");
	}

}
