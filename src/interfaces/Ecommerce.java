package interfaces;

public interface Ecommerce {
	Ecommerce pedidoNovo();
	Ecommerce aprovado();
	Ecommerce emTranporte();
	Ecommerce entregue();
	Ecommerce cancelado();
	Ecommerce finalizado(int finalizado);
	boolean pergunta(String confirmacao);
	void infoEstado();
}
