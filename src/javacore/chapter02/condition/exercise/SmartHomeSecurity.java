package javacore.chapter02.condition.exercise;

public class SmartHomeSecurity {

    public static void main (String[] args){

        //Le mode "sécurisé" s'active seulement si certaines conditions spécifiques sont remplies.
        //Voici les critères que le programme doit vérifier :
        //
        //La maison est vide OU le propriétaire est endormi.
        //
        //Toutes les portes et fenêtres sont fermées.
        //
        //L'alarme principale est activée.

        boolean isHouseEmpty = true; // Est ce que la maison est vide ?
        boolean isOwnerAsleep = true; // Est ce que le propriétaire dort ?
        boolean areAlleDoorsAndWindowsClosed = true; // Est ce que ttes les portes et fenetres sont fermées ?
        boolean isAlarmActivated = true; // Est ce que l'alarme est activée ?

        boolean isSafeModeActivated = isHouseEmpty && isOwnerAsleep && areAlleDoorsAndWindowsClosed && isAlarmActivated;

        if (isSafeModeActivated == true) {
            System.out.println("Le mode 'sécurisé' est activé");
        }
        else {
            System.out.println("Le mode 'sécurisé' est inactif");
        }



    }
}
