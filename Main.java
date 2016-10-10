/**
 * Created by Jakub on 2016-10-10.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a1,n,an,suma;
            System.out.println("Podaj pierwszy wyraz ciągu: ");
        Scanner zmiennaA1 = new Scanner(System.in);
        Scanner zmiennaN = new Scanner(System.in);
        a1 = zmiennaA1.nextInt();
            System.out.println("Podaj liczbe elementow: ");
        n = zmiennaN.nextInt();
        Random r = new Random();
        int roznica = r.nextInt(10)+1; // tutaj można podać zakres losowanych liczb, "+1", ponieważ różnica nie może wynosić 0
        an = a1;
        for (int i =1; i < n; i++){
            an+=roznica;
        }
        suma = (a1 + an)/2 * n; // wzór na sume ciągu
        System.out.println("Pierwszy element ciągu to: "+a1+", różnica ciągu arytmetycznego to "+roznica+", a suma ciągu to "+suma);

    }
}
