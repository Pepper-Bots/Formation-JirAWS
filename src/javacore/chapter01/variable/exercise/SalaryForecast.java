package javacore.chapter01.variable.exercise;

public class SalaryForecast {

    public static void main(String[] args){

//        1 salarié :
//        - développeur - réside en France - statut cadre
//        - Taux horaire brut = 25€
//        - travaille 38,5 h/semaine -> 7,7 h/jour
//        - 1 mois de salaire = 4 semaines de travail - même nb de jours


//        On veut obtenir :
//        - Le salaire brut journalier.
//        - Le salaire brut hebdomadaire.
//        - Le salaire brut mensuel.
//        - Le salaire brut annuel.
//        - Le salaire net imposable mensuel.
//        - Le salaire net imposable annuel.
//        - Le salaire net mensuel, après impôt sur le revenu.
//        - Le salaire net annuel, après impôt sur le revenu.

        int TxHoraire = 25;
        float HeuresJour = 7.7F;
        float HeuresSemaine = 38.5F;

        // Salaires brut

        float salaireBrutJournalier = TxHoraire * HeuresJour;
        System.out.println("Le salaire brut journalier s'élève à " + salaireBrutJournalier);

        float salaireBrutHebdo = TxHoraire * HeuresSemaine;
        System.out.println("Le salaire brut hebdomadaire s'élève à " +salaireBrutHebdo);

        float salaireBrutMensuel = salaireBrutHebdo * 4;
        System.out.println("Le salaire brut mensuel s'élève à " + salaireBrutMensuel);

        float salaireBrutAnnuel = salaireBrutMensuel * 12;
        System.out.println("Le salaire brut annuel s'élève à " + salaireBrutAnnuel);

        // Salaires net imposables
    }
}
