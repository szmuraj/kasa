package com.szmurajcode;

import java.util.Scanner;

public class Main {

    static double[] pln = {500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
    static int[] plnAmount = {0,0,0,0,0,0,1,3,5,10,20,200,100,100,10_000};

    public static void main(String[] args) {

        System.out.println("Podaj kwotę reszty: ");
        amount();
    }

    public static double amount() {

        Scanner scanner = new Scanner(System.in);
        double amount = 0;
        int cash = 0;

        try {
             amount = scanner.nextDouble();
            System.out.println("Aby wypłacić " + amount + " potrzebujesz wyjąć z kasy ");
             for(int i=0; i<15; i++) {
                 if (amount/pln[i] >= 1 && plnAmount[i] > 0) {
                     while(plnAmount[i] > 0 && amount > 0) {
                         amount -= pln[i];
                         plnAmount[i] --;
                         cash++;
                     }
                     System.out.println(pln[i] + " * " + cash);
                     cash = 0;
                 }
             }


        } catch (Exception e) {
            System.out.println("Przepraszam nie rozumiem spróbuj ponownie: ");
            amount();
        }
        return amount;
    }

}