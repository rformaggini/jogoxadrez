package br.com.xadrez.xadrez;

import br.com.xadrez.tabuleiro.Peca;
import br.com.xadrez.tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca{
	
	private Cor cor;
	
	
	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}
	/*
	public PecaXadrez(Tabuleiro tabuleiro) {
		super(tabuleiro);
	
	}
*/
	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}




	

}
