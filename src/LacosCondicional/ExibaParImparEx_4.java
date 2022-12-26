package LacosCondicional;

import java.text.DecimalFormat;
import java.util.Scanner;

//4-Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
// Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
public class ExibaParImparEx_4 {
    public static void main(String[] args) {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("\nDigite  um numero qualquer: ");
        DecimalFormat teste = new DecimalFormat("0.0000");
        num = ler.nextFloat();

        if (num % 2 == 0) {
            double raiz = Math.sqrt(num);
            System.out.println(num + "é par e raiz quadrada: " + teste.format(raiz));
        }else {
            double quadrado = Math.pow(num, 2);
            System.out.println(num + " é impar  e o quadrado: " + teste.format(quadrado));
        }
    }
}
