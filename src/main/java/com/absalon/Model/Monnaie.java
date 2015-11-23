package com.absalon.Model;

/**
 * Created by Absalon DEEL on 23/11/2015.
 */
public class Monnaie {
    private String devise;
    private double value;

    public Monnaie(String devise, double value) {
        this.devise = devise;
        this.value = value;
    }

    public Monnaie(String devise){
        this.devise = devise;
    }

    public String getDevise() {
        return this.devise;
    }

    public double getValue() {
        return this.value;
    }

    public String conversionMonnaie(Monnaie m2){
        double valeurDeSortie = 0;

        switch (this.devise){
            case "Euro":
                if(m2.getDevise() == "Livre Sterling") {
                    valeurDeSortie = this.value * 1.43;
                }
                else if (m2.getDevise() == "Dollar Canadien") {
                    valeurDeSortie = this.value * 1.42;
                }
                else if (m2.getDevise() == "Dollar des Etats Unis"){
                    valeurDeSortie = this.value*1.06;
                }
                else if(m2.getDevise() == "Franc Suisse"){
                    valeurDeSortie = this.value*1.08;
                }
                else if(m2.getDevise() == "Dirham Marocain") {
                    valeurDeSortie = this.value*10.65;
                }
                else valeurDeSortie = 6;
                break;
        }

        String temp = String.valueOf(valeurDeSortie);
        return temp;

    }


}
