package javacore.chapter02.condition.exercise;

public class CoinChangerV1 {

    public static void main(String[] args){

        // 18 - 52 - 76 - 160 - 384
        int totalBill = 384 ;
        int amountPaid = 90;

        int change = totalBill - amountPaid;
        int rendu = amountPaid - totalBill;

        // Ce que j'ai compris :
        // on a une facture (totalBill) que le client doit régler
         // on a un montant (amountPaid) que le client règle qui va être déduit du montant total de la facture
         // Lorsqu'il paie, la machine lui rend en coupure de 50 - 20 - 10 - 2 - 1 € seulement

        if ( amountPaid < totalBill){
            System.out.println("Il vous reste " + change + "€ à régler.");
        }

        else if (amountPaid > totalBill){
            System.out.println("Vous avez payé " + rendu + "€ en trop.");
            int nb50 = rendu / 50;
            int reste = rendu % 50;
            System.out.println("Nb de billets de 50€ à rendre : " + nb50);

            int nb20 = reste / 20;
            reste = reste % 20;
            System.out.println("Nb de billets de 20€ à rendre : " + nb20);

            int nb10 = reste / 10;
            reste = reste % 10;
            System.out.println("Nb de billets de 10€ à rendre : " + nb10);

            int nb2 = reste / 2;
            reste = reste % 2;
            System.out.println("Nb de pièces de 2€ à rendre : " + nb2);

            int nb1 = reste;
            System.out.println("Nb de pièces de 1€ à rendre : " + nb1);

        }

        else {
            System.out.println("Vous avez payé la totalité de votre facture");

        }



    }
}
