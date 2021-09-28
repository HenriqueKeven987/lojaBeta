package entities;

import java.sql.Date;

public class ordem {
	
	private Date date;
	private products produto;
	
	
	public ordem(Date date, products produto, String nome) {
		this.date = date;
		this.produto = produto;
		this.produto.nome = nome;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public products getProduto() {
		return produto;
	}


	public void setProduto(products produto) {
		this.produto = produto;
	}
	
	public String toString() {
		return "Data: " + date + "\n Produto: " + produto;
	}
	
	
	
	
}
