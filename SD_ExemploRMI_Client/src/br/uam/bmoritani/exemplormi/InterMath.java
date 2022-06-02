package br.uam.bmoritani.exemplormi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterMath extends Remote{
    
    public double soma(double a, double b) throws RemoteException;
    
}
