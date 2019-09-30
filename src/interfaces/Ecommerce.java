package interfaces;

public interface Ecommerce {
	Ecommerce pronto();
	Ecommerce pedidoNovo();
	Ecommerce aprovado();
	Ecommerce emTranporte();
	Ecommerce entregue();
	Ecommerce cancelado();
	Ecommerce finalizado(int finalizado);
	Ecommerce devolucao();
	Ecommerce reembolso();
	boolean pergunta(String confirmacao);
	void infoEstado();
}
