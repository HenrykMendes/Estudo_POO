package atividades;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgressaoAritmetica PA = new ProgressaoAritmetica();
        int numero = sc.nextInt();
        for (int cont = 1;cont<=numero;cont++){
            System.out.println(PA.proximoTermo());
        }

    }
}
