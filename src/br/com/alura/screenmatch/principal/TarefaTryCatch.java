package br.com.alura.screenmatch.principal;

import java.util.Scanner;

public class TarefaTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número que deja dividir");
        int numero1 = scanner.nextInt();

        System.out.println("Informe o segundo numero da divisão");
        int numero2 = scanner.nextInt();

        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão é: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro encontrado é : Dividir por zero não é permitido ");
        }
    }
}
