package states;
import java.util.Scanner;

import interfaces.Ecommerce;

public class PedidoAprovado implements Ecommerce {

	private Scanner ler;
	
	public PedidoAprovado() {
		super();
		aprovado();
	}

	@Override
	public Ecommerce pedidoNovo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce aprovado() {
		infoEstado();
		String confirmacao = "Pedido Aprovado, deseja prosseguir com a compra?";
		if(pergunta(confirmacao)) {
			return new PedidoTransporte();
		}
		return new PedidoCancelado();
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
		System.out.println("Estado = Pedido Aprovado");
	}
	
}
