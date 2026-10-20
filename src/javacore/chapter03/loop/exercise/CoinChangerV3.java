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

//        int facture_totale = 150;
//        int montant_paye = 200;
//
//        int reste_a_payer = facture_totale - montant_paye;
//        int trop_paye_a_rendre = montant_paye - facture_totale;
//
//        if (reste_a_payer > facture_totale) {
//            System.out.println("Il vous reste à régler " + reste_a_payer + " sur le montant total de :" + facture_totale);
//        } else {
//            System.out.println("Vous avez payé " + trop_paye_a_rendre + " en trop sur la facture de : " + facture_totale);
//        }
//
//        while (trop_paye_a_rendre > facture_totale) {
//
//            if (trop_paye_a_rendre > montant_paye50){
//                trop_paye_a_rendre - montantBillet50
        // -> on reteste ? ou façon plus simple de déterminer si on a encore besoind de retirer 50

        // ici soustraire 50€ de la facture
        // ensuite on reverifie
        // on verifie à chaque itération
        // avant de passer au montant suivant de 20€
        // et à 10€, etc


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


// montant facture à payer
        // paiement -> suffisant ou pas ? -> trop ou pas assez
// si pas assez -> il manque tant (facture - paiement = reste à régler)

// IF
// si trop -> paiement - facture = trop perçu (montant à rendre)

// BOUCLES WHILE :
// trop perçu > billet de 50 ? -> while trop perçu > 50 -> trop perçu - 50 -> stocker valeur restante
// restant > 20 ? -> restant - 20 -> stocker valeur restante
// valeur restante > 10 ? -> - 10
// else :
// si pas

// -------------------

        // Données de test : 18 - 52 - 76 - 160 - 384
        int montantFacture = 50;
        int montantPaye = 52;

        int resteAPayer = montantFacture - montantPaye;
        int tropPercu = montantPaye - montantFacture;

        // Pour calcul du nombre de billets et pièces
        int nb50 = 0;
        int nb20 = 0;
        int nb10 = 0;
        int np2 = 0;
        int np1 = 0;

        // Cas où le client n'a pas payé assez
        if (montantPaye < montantFacture) {
            System.out.println("Votre facture s'élève à : " + montantFacture + "€.");
            System.out.println("Vous avez payé " + montantPaye + "€.");
            System.out.println("Il vous reste donc " + resteAPayer + "€ à régler.");
        }

        // Cas où le client a payé le montant exact de la facture
        else if (montantPaye == montantFacture){
            System.out.println("Vous avez réglé la totalité de la facture de " + montantFacture);
        }

        // Cas où le client a payé trop -> déterminer montant à rendre
        else {
            System.out.println("Pour un montant de facture de " + montantFacture + "€");
            System.out.println("Vous avez réglé un trop perçu de " + montantPaye + "€.");
            System.out.println("Nous devons donc vous rendre " + tropPercu + "€");

            // nb de billets de 50€ dans le montant à rendre
            while(tropPercu >= 50){
                tropPercu -= 50;
                nb50 ++;
            }
            System.out.println("Nb de billets de 50€ à rendre " + nb50);

            while(tropPercu >= 20){
                tropPercu -= 20;
                nb20 ++;
            }
            System.out.println("Nb de billets de 20€ à rendre " + nb20);

            while(tropPercu >= 10){
                tropPercu -= 10;
                nb10 ++;
            }
            System.out.println("Nb de billets de 10€ à rendre " + nb10);

            while(tropPercu >= 2){
                tropPercu -= 2;
                np2 ++;
            }
            System.out.println("Nb de pièces de 2€ à rendre " + np2);

            while(tropPercu >= 1){
                tropPercu -= 1;
                np1 ++;
            }
            System.out.println("Nb de pièces de 1€ à rendre " + np1);
        }

    }
}

