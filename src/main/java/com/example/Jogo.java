package com.example;

public class Jogo {

    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuiCartaParaJogador(Jogador jogador) {
        if (jogador.parou()) {
            return null;
        }
        Carta carta = monte.virar();
        if (carta != null) {
            jogador.receberCarta(carta);
        }
        return carta;
    }

    public boolean acabou() {
        boolean alguemEstourou = jogador.getPontos() > 21 || computador.getPontos() > 21;
        boolean ambosParam = jogador.parou() && computador.parou();
        return alguemEstourou || ambosParam;
    }

    public String resultado() {
        int pontosJogador = jogador.getPontos();
        int pontosComputador = computador.getPontos();

        if (pontosJogador > 21 && pontosComputador > 21 || pontosJogador == pontosComputador) {
            return "EMPATE";
        }
        if (pontosJogador > 21 || (pontosComputador <= 21 && pontosComputador > pontosJogador)){
            return "VOCÊ PERDEU!";
        }
        return "VOCÊ GANHOU!!!";
    }

    public Computador getComputador() {
        return computador;
    }

    public Jogador getJogador() {
        return jogador;
    }
}
