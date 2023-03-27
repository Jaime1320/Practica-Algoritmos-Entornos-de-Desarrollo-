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
 * Esta clase es para calcular numeros fibonacci,numeros factoriales y nimeros primos
 */
public abstract class algoritmos {
    
    /**
     * Recibe un número entero y devuelve el número de fibonacci de dicho número
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
    
}
