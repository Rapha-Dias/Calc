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

    @Override
    public double areaCirculo(double raio) throws RemoteException {
        return Math.PI*(raio*raio);
    }

    @Override
    public double areaTriangulo(double base, double altura) throws RemoteException {
        return (base*altura)/2;
    }

    @Override
    public double areaQuadrado(double lado1, double lado2) throws RemoteException {
        return lado1*lado2;
    }

    @Override
    public double areaTrapezio(double altura, double verificador, double baseMaior) throws RemoteException {
        double baseMenor=0;
        if (baseMaior > verificador) {
            baseMenor = verificador;
        }
        return (altura*(baseMenor+baseMaior))/2;
    }

    @Override
    public double areaLosango(double diagonalMaior, double verificador) throws RemoteException {
        double diagonalMenor=0;
        if (diagonalMaior > verificador) {
            diagonalMenor = verificador;
        }

            return (diagonalMaior * diagonalMenor) / 2;
    }

}
