package LacosCondicional;

import java.util.Scanner;

//1-Faça um programa que receba três inteiros e diga qual deles é o maior.
public class MaiorInteiroEx_1 {
    public static void main(String[] args) {
        int n, n2, n3;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe 3 numeros: ");
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " é maior!");
        }else if (n2 > n3){
            System.out.println(n2 + "é maior!");
        }else {
            System.out.println(n3 + " é maior!");
        }
        System.out.println("Fim da execução!");
    }
}
