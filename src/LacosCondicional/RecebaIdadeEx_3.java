package LacosCondicional;


//3-Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto


import java.util.Scanner;

public class RecebaIdadeEx_3 {
    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner entrada = new Scanner(System.in);
        System.out.println("\nQual sua idade? ");
        idade = entrada.nextInt();

        entrada.nextLine(); //limpar o buffer de entrada(Scanner)
        System.out.println("\nQual seu nome? ");
        nome = entrada.nextLine();

        if(idade > 0 && idade <=14) {
            System.out.println(nome + " categoria infantil pois sua idade é: " + idade + " anos");
        } else if (idade >= 15 && idade < 18) {
            System.out.println(nome + " categoria juvenil pois sua idade é: " + idade + " anos");
            // } else if (idade >= 18) {
            //System.out.println(nome + " categoria adulto pois sua idade: " + idade + " anos!");
        } else {
            System.out.println(nome + " categoria adulto pois sua idade é: " + idade + " anos");
        }
    }
}