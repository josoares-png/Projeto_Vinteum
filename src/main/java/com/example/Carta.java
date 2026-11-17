package com.example;

public class Carta {

    private int numero;
    private  Naipe naipe;

    public Carta(int numero, Naipe naipe){
        this.naipe = naipe;
        this.numero = numero;
    }

    public String imagePath(){
        String numeroCarta = String.valueOf(numero);

        if (numero == 1){
            numeroCarta = "Ace";
        } else if (numero == 11) {
            numeroCarta = "Jack";
        } else if (numero == 12) {
            numeroCarta = "Queen";
        } else if (numero == 13) {
            numeroCarta = "King";
        }
        return "classic-cards/" + numeroCarta + this.naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
}
