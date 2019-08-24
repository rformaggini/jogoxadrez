package br.com.xadrez.tabuleiro;

public class Posicao {
	
	private Integer row;
	private Integer column;
	
	
	public Posicao() {
		
	}
	
	public Posicao(Integer row, Integer column) {
		super();
		this.row = row;
		this.column = column;
	}
	
	public Integer getRow() {
		return row;
	}
	
	public void setRow(Integer row) {
		this.row = row;
	}
	
	public Integer getCollum() {
		return column;
	}
	public void setCollum(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return "Posicao " + row + ", " + column ;
	}
	
	
	
	
}
