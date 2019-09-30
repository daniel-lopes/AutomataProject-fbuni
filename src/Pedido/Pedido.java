package Pedido;
import interfaces.Ecommerce;

public class Pedido {
	private String nome;
	private int qtd;
	private float preco;
	private Ecommerce state;
	
	public Pedido(String nome, int qtd, float preco) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public Ecommerce getState() {
		return state;
	}
	
	public void setState(Ecommerce state) {
		this.state = state;
	}
	
}
