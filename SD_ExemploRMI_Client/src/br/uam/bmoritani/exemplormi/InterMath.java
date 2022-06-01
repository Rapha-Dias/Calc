package br.uam.bmoritani.exemplormi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterMath extends Remote{
    
    public double soma(double a, double b) throws RemoteException;
    public double areaCirculo(double raio) throws RemoteException;
    public double areaTriangulo(double base, double altura) throws RemoteException;
    public double areaQuadrado(double lado1, double lado2) throws RemoteException;
    public double areaTrapezio(double altura, double verificador, double baseMaior) throws RemoteException;
    public double areaLosango(double diagonalMaior, double verificador) throws RemoteException;

    
}
