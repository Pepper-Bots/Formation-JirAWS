package javacore.chapter02.condition.exercise;

public class ObfuscatedCodeV1 {

    public static void main(String[] args) {

        int typeVehicule = 1; // Type de véhicule (1 = voiture, 2 = moto, 3 = camion)

        double distance = 100; // Distance

        boolean e = true; // condition à déterminer
        double d = 0.03;

        double prixCarburant = 0; // carburant ?

        if (typeVehicule == 1) {
            prixCarburant = distance * 0.10;
        }
        if (typeVehicule == 2) {
            prixCarburant = distance * 0.20;
        }
        if (typeVehicule == 3) {
            prixCarburant = distance * 0.35;
        }
        if (e) {
            prixCarburant = prixCarburant - (distance * d);
        }

        System.out.println("Pour le " + typeVehicule + " le prix du carburant s'élève à : " + prixCarburant + "€");

    }
}

// est ce qu'on essaie de calculer une vitesse ? -> selon le type de véhicule ?
// formule de calcul de la vitesse : d = v x t


