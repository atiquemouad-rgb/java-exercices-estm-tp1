package ESTM;
import java.util.Scanner;
public class Carnet_note {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int nb_note;
        boolean quit = false;
        do {
            System.out.print("Nombre de note superieur a 0 : (enter -1 pour quitter )");
            nb_note =scanner.nextInt();
            if(nb_note==-1){
                quit=true;
                break;
            }

        }while(nb_note<0);
        double note=0;
        int somme =0;
        double min =0 ,max=0;
        char symbole='*';
        for(int i=0;i<nb_note;i++){
            System.out.print("Note "+(i+1)+" : ");

            do{
                note = scanner.nextDouble();
                if(note==-1){
                    quit=true;
                    break;

                }
                if(note<0 || note>20){
                    System.out.print("note invalid (0 a 20) (-1 pour quitter le programme !!les notes vous avez deja entrer au debut ils auront supprimer )");
                }else{
                    for(int j=0 ; j<(int)note;j++){
                        System.out.print(symbole);
                    }
                    System.out.println();
                }
            }while(note<0 || note>20);
            if (quit){
                break;
            }
            somme +=note;
            if(min == 0 && max ==0){
                min =note;
                max =note;
            }
            if(min>note){
                min =note;
            }
            if(max<note){
                max = note;
            }

        }
        if(!quit && nb_note>0) {
            double moyenne = somme / nb_note;
            System.out.printf("Nombre de notes %d :\n", nb_note);
            System.out.println("Moyenne :" + moyenne);
            System.out.println("Meilleurre note :" + max);
            System.out.println("Plus faible :" + min);
            if (moyenne < 10) System.out.println("Mention : Inssufisante");
            else if (moyenne < 12) System.out.println("Mention : Passable");
            else if (moyenne < 14) System.out.println("Mention : Assez bien");
            else if (moyenne < 16) System.out.println("Mention : Bien");
            else System.out.println("Mention : Excellent");
        }
    }
}
