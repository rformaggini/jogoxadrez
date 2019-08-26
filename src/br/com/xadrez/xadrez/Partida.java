package br.com.xadrez.xadrez;

import br.com.xadrez.tabuleiro.Tabuleiro;

public class Partida {
	
	private Tabuleiro tabuleiro;

	public Partida() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] matriz = new PecaXadrez [tabuleiro.getLinha()][tabuleiro.getColuna()];
		
		for(int i =0; i < tabuleiro.getLinha(); i++) {
			for(int j =0; j < tabuleiro.getColuna(); j++) {
				matriz[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			
			}
		}
		return matriz;
	}
	
}
