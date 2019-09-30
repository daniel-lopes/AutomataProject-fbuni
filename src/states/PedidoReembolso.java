package states;
import java.util.Scanner;

import interfaces.Ecommerce;

public class PedidoReembolso implements Ecommerce {

	private Scanner ler;

	public PedidoReembolso() {
		super();
		reembolso();
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ecommerce reembolso() {
		infoEstado();
		String confirmacao = "O produto chegou danificado?";
		if(pergunta(confirmacao)) {
			System.out.println("Lamentamos o ocorrido, será debitado 100% do valor na sua conta");
			return this;
		}
		System.out.println("Lamentamos o ocorrido, será debitado 50% do valor na sua conta");
		return this;
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
		System.out.println("Estado = Pedido Reembolso");		
	}

}
