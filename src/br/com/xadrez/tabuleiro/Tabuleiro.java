package br.com.xadrez.tabuleiro;

public class Tabuleiro {

	private Integer linha;
	private Integer coluna;
	private Peca[][] pecas;
	
	
	
	public Tabuleiro(Integer linha, Integer coluna) {

		if(linha < 1 || coluna < 1){
			throw new TabuleiroException("Error creating board: must be at least 1 row and 1 column.");
		}
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];
		
	}
	
	public Integer getLinha() {
		return linha;
	}

	public Integer getColuna() {
		return coluna;
	}
	
	public Peca	peca(Integer linha, Integer coluna) {
		if(!posicaoExiste(linha, coluna)){
			throw new TabuleiroException("Position not on the board.");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)){
			throw new TabuleiroException("Position not on the board.");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void posicionarPeca(Peca peca, Posicao posicao){
		if(temUmaPeca(posicao)){
			throw new TabuleiroException("There is already a piece on position " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean posicaoExiste(Integer linha, Integer coluna){
		return linha >= 0 && linha < this.linha && coluna >= 0 && coluna < this.coluna;
	}

	public boolean posicaoExiste(Posicao posicao){
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}

	public boolean temUmaPeca(Posicao posicao){
		if(!posicaoExiste(posicao)){
			throw new TabuleiroException("Position not on the board.");
		}
		return peca(posicao) != null;
	}
}
