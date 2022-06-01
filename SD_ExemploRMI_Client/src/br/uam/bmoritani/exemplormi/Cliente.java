package br.uam.bmoritani.exemplormi;

import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Carregando o cliente.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o Calculo");

        System.out.printf("1-Circulo \n2-Triangulo \n3-Quadrado \n4-Trapezio \n5-Losango");
        int n = sc.nextInt();

        while (n < 0 && n > 6){

            switch (n) {

                case 1:
                    System.out.println("1");

                    break;

                case 2:
                    System.out.println("2");
                    break;

                 case 3:
                     System.out.println("3");
                    break;

                case 4:
                    System.out.println("4");
                    break;

                 case 5:
                     System.out.println("5");
                    break;

                default:
                    System.out.println("Erro escolha entre 1 a 5");
            }
        }

        try{
            InterMath objRemoto = 
                (InterMath) Naming.lookup("rmi://LOCALHOST:1099/calcula");
            
 //           double resp = objRemoto.soma(12, 6);

//              System.out.println("Soma = " + resp)
            
        }catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
