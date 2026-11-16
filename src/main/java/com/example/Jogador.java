package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;

    public void receberCarta(Carta carta){
        cartas.add(carta);
        if (carta.getNumero() > 10){
            pontos += 10;
        }
    }
}
