import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int satir, bosluk, yildiz;
        System.out.print("Basamak sayısını giriniz : ");
        n = input.nextInt();

        for (satir = 0; satir <= n; satir++){
            for (bosluk = 0; bosluk <= satir; bosluk++){
                System.out.print(" ");
            }
            for (yildiz = 2*n-1; yildiz >= (2*satir+1); yildiz--){
                System.out.print("*");
            }
            System.out.println();
        }



    }

}







