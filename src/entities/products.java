package entities;

public class products {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public products () {
		
	}
	
	public products (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public products (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		quantidade = 0;
	}
	
	public void setNomePreco(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double totalValue() {		
		return preco * quantidade;
	}
	
	public void addStock(int quantidade) {
		this.quantidade += quantidade;		
	}
	
	public void rmStock(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		
		return nome + ", $" + String.format("%.2f",preco) + ", Qtd " + quantidade + " Total: $" + String.format("%.2f",totalValue());
	}
	
}
