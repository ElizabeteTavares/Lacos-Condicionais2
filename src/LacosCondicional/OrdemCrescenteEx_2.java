package LacosCondicional;


//2-Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class OrdemCrescenteEx_2 {
    public static void main(String[] args) {
        int n1, n2, n3, cont;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nInforme 1 numero: ");
        n1 = entrada.nextInt();
        System.out.println("\nInforme 2 numero: ");
        n2 = entrada.nextInt();
        System.out.println("\nInforme 3 nmero: ");
        n3 = entrada.nextInt();

        if (n1 > n2){
            //estrutura faz a troca de valores:
            cont = n2;
            n2 = n1;
            n1 = cont;
            System.out.println("cont1: " + cont);
        }
        System.out.println("cont2: " + n3 + " " + n1);
        if(n1 > n3) {
            cont = n3;
            n3 = n2;
            n2 = cont;
            System.out.println("cont3: " + cont);
        }
        System.out.println("cont3: " + n3 + " " + n1);
        //mostrando numeros em ordem crescente.
        System.out.println("cont3: " + " " + n2 + " " + n3);
    }
}
