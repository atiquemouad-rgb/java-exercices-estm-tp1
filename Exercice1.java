package ESTM;

            import java.util.Scanner;
            public class Exercice1 {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int min=0;int max = 0, somme = 0 ;
                    int v;
                    boolean ajout =true;
                    do {
                        System.out.print("Valeur (0 pour arrêter) : ");
                        v = sc.nextInt();
                        if(min == 0 & max ==0){
                            min=v;
                            max=v;
                            if(v==0) {
                                ajout  = false;
                                System.out.println("Aucune valuer saisie");}
                        }
                        if (v > max && v!=0) max = v;
                        if (v < min && v!=0) min = v;
                        somme +=v;
                    } while (v!= 0);
                    if(ajout){
                        System.out.println("Max = " + max + ", Min = " + min);
                        System.out.println("Somme = " + somme);
                    }
                }
            }


