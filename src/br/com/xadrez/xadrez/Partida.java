package br.com.xadrez.xadrez;

import br.com.xadrez.tabuleiro.Posicao;
import br.com.xadrez.tabuleiro.Tabuleiro;
import br.com.xadrez.xadrez.pecas.Rei;
import br.com.xadrez.xadrez.pecas.Torre;

public class Partida {
	
	private Tabuleiro tabuleiro;

	public Partida() {
		tabuleiro = new Tabuleiro(8, 8); configPartidaInicial();
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

	private void configPartidaInicial(){
		tabuleiro.posicionarPeca(new Torre(tabuleiro,Cor.BRANCO), new Posicao(2,1));
		tabuleiro.posicionarPeca(new Rei(tabuleiro,Cor.PRETO), new Posicao(0,4));
		tabuleiro.posicionarPeca(new Rei(tabuleiro,Cor.BRANCO), new Posicao(7,4));
	}
}
