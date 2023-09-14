package br.com.xadrez.xadrez.pecas;

import br.com.xadrez.tabuleiro.Tabuleiro;
import br.com.xadrez.xadrez.Cor;
import br.com.xadrez.xadrez.PecaXadrez;

public class Rei extends PecaXadrez {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
