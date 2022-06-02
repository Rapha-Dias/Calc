package br.uam.bmoritani.exemplormi;

import java.rmi.Naming;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Carregando o cliente.");
        
        try{
            InterMath objRemoto = 
                (InterMath) Naming.lookup("rmi://LOCALHOST:1099/calcula");
            
            double resp = objRemoto.soma(12, 6);
            
            System.out.println("Soma = " + resp);
            
        }catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
}
