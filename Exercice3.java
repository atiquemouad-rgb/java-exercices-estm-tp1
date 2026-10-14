package ESTM;
import java.util.Scanner;
public class Exercice3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int montant ;
        int total =0;
        int bi_divide = 100;
        int i=0;
        boolean retire = true;
        do {
            System.out.println("montant a retire en (DH) : (entrer 0 pour quitter)");
            montant = scanner.nextInt();
            if(montant==0){
                retire=false;
                System.out.println("quitter le programme");
                break;
            }
            if(montant<10 || montant >5000 || montant%10 !=0){
                System.out.println("Montant invalide (multiple de 10, entre 10 et 5000).");
            }else{
                    System.out.println("vous recevez "+montant+" DH"   );
            }
        }while(montant<10 || montant >5000 || montant%10 !=0);
        int q =montant/200;
        int r=montant%200;
        if(q!=0){
            System.out.println(q+" billet(s) de 200 DH");
            total+=q;
        }
        while(r!=0){
            q = r/bi_divide;
            r=r%bi_divide;
            total+=q;
            if(q!=0 && bi_divide!=10) {
                System.out.println(q + " billet(s) de  " + bi_divide +" DH");

            }
            if(q!=0 && bi_divide==10){
                System.out.println(q + " pieces(s) de  " + bi_divide +" DH");
            }
            if (i==0) {
                bi_divide=50;
                i++;
            }else if(i==1){
                bi_divide=20;
                i++;
            }else{
                bi_divide=10;
            }
        }
        if(retire) {
            System.out.println("Total: " + total + " billet(s) et piece(s)");
        }
    }

}
