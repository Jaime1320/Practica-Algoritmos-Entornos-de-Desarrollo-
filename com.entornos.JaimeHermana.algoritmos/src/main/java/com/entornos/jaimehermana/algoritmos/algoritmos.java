/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entornos.jaimehermana.algoritmos;

/**
 *
 * @author Jaime
 *
 * Version1.0
 *
 * Esta clase es para calcular numeros fibonacci,numeros factoriales y nimeros
 * primos
 */
public abstract class algoritmos {
    
    /**
     * Recibe un número entero y devuelve el número de fibonacci de dicho número
     *
     * @param posicion
     * @return numero fibonacci de dicho numero
     */
    
    public static int fibonacci(int posicion) {
        int siguiente = 1, actual = 0, temporal = 0;
        for (int i = 1; i <= posicion; i++) {
            // Si no quieres imprimirla, comenta la siguiente línea:
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
        }
        // Si no quieres imprimirla, comenta la siguiente línea:
        return actual;
    }

    /**
     * Recibe un número entero y devuelve el factorial de dicho número
     *
     * @param numero
     * @return numero factorial de dicho numero
     */
    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
    
    /**
     * Recibe un número entero y devuelve true o false en función de si es primo o no
     * 
     * @param numero
     * @return Devuelve si el numero es primo o no
     */
    public static boolean Numeroprimo (int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }

}
