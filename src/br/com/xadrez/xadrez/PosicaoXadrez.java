package br.com.xadrez.xadrez;

import br.com.xadrez.tabuleiro.Posicao;
import br.com.xadrez.xadrez.exception.XadrezException;

public class PosicaoXadrez {

    private char coluna;
    private Integer linha;

    public PosicaoXadrez(char coluna, Integer linha) {
        if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8){
            throw new XadrezException("Error Chess Position. Values must to be between a1 to h8");
        }
        this.coluna = coluna;
        this.linha = linha;
    }

    public char getColuna() {
        return coluna;
    }

    public Integer getLinha() {
        return linha;
    }

    protected Posicao convPosicao(){
        return new Posicao((8 - linha), (coluna - 'a'));
    }

    protected static PosicaoXadrez convXadrezPosicao(Posicao posicao){
        return new PosicaoXadrez((char) ('a' - posicao.getColuna()), (8 - posicao.getLinha()));
    }

    @Override
    public String toString() {
        return "" + coluna + linha;
    }
}
