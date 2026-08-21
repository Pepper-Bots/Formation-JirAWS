package javacore.chapter03.loop.exercise;

public class CoinChangerV3 {

    public static void main(String[] args) {

        // Ce que j'ai compris :
        // on a une facture (totalBill) que le client doit régler
        // On a un montant (amountPaid) que le client règle qui va être déduit du montant total de la facture
        // Lorsqu'il paie, la machine lui rend en coupure de 50 - 20 - 10 - 2 - 1 € seulement.

        // RAPPEL :
        // Le montant à rendre sera forcément un nombre entier, sans virgule.
        //
        //La machine ne peut rendre que les coupures suivantes : 50€, 20€, 10€, 2€ et 1€.

// ---------------------------------------------------------------------------------------

        // ETAPES

        // tester :
        //
        // * si montant réglé < montant de la facture ⇒ résultat = change / FIN TRAITEMENT (if ?)

        // * si le montant payé > montant facture >> montant à rendre (rendu) : (boucle for ?)

        // Rendu à découper suivant montant billet :
        // (boucle while ?) >> tant que rendu >= bill -> reste -= bill -> gérer chgt valeur de bill en sortie de boucle
        // 1) -50
        // 2) -20
        // 3) -10
        // 4) -2
        // 5) -1



        int facture_totale = 150;
        int montant_paye = 200;

        int reste_a_payer = facture_totale - montant_paye;
        int trop_paye_a_rendre = montant_paye - facture_totale;


        if (reste_a_payer > facture_totale) {
            System.out.println("Il vous reste à régler " + reste_a_payer + " sur le montant total de :" + facture_totale);
        }
        else {
            System.out.println("Vous avez payé " + trop_paye_a_rendre + " en trop sur la facture de : " + facture_totale);
        }

        while (trop_paye_a_rendre > facture_totale){

            // ici soustraire 50€ de la facture
            // ensuite on reverifie
            // on verifie à chaque itération
            // avant de passer au montant suivant de 20€
            // et à 10€, etc
        }

        // (TANT QUE) montant à rendre > à billet1 de 50€ ?
        // montant payé - montant billet1
        // combien reste t'il ? => montant restant (pour effectuer calcul suivant)
        // (BREAK)

        // (TANT QUE) montant restant > à billet2 de 20€ ?
        // montant restant - billet2
        // montant restant2
        // (BREAK)

        // (TANT QUE) montant restant2 > à billet3 de 10€ ? => montant restant3
        // (TANT QUE) montant restant3 > à billet4 de 2€ ? => montant restant4
        // (TANT QUE) montant restant4 > à billet2 de 1€ ? => montant restant5

        // montant restant5 == 0 ?
        // System.out.println("Vous avez payé la totalité de votre facture");

    }


    }

