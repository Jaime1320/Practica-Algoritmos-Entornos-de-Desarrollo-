
package com.entornos.jaimehermana.algoritmos;

public class Principal{

    public static void main(String[] args) {
        int numeros[]=new int[5];
        int resultadoFibonacci[] = new int[5];
        int resultadoFactorial[] = new int [5];
        boolean resultadoPrimos[] = new boolean [5];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*20+1);
        }
        for (int i=0;i<numeros.length;i++){
            resultadoFibonacci[i]= algoritmos.fibonacci(numeros[i]);
        }
        for (int i=0;i<numeros.length;i++){
            resultadoFactorial[i]= algoritmos.factorial(numeros[i]);
        }
        for (int i=0;i<numeros.length;i++){
            resultadoPrimos[i]= algoritmos.Numeroprimo(numeros[i]);
        }
        
        
    }
    
}
