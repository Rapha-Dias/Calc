package br.uam.bmoritani.exemplormi;

import java.rmi.RemoteException;

public class Matematica implements InterMath {
    
    public Matematica() throws RemoteException{
        super();
        System.out.println("Novo Servidor Math disponível.");
    }
    
    @Override
    public double soma(double a, double b) throws RemoteException{
        System.out.println("Calculei " + a + " + " + b);
        return a + b;
    }
    
}
