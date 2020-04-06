/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.priorityqueue;

import java.util.PriorityQueue;

/**
 * Ejemplo de programación en vivo de la tutoría 2: uso de una cola de prioridad
 * en Java.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class PQTest {

    /**
     * Punto de entrada de ejecución del programa.
     * <b>Nota: por temas de simplicidad, este método está en la misma clase que
     * el modelo del mundo; Sin embargo, esto es una mala práctica de
     * programación. </b>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1. Se construye una cola de prioridad con un comparador personalizado.
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(new CustomIntegerComparator());

        // 2. Se agregan elementos a la cola de prioridad. En este caso, el mismo elemento (valor) es su llave.
        pq1.add(-10);
        pq1.add(10);
        pq1.add(20);
        pq1.add(1);
        pq1.add(50);
        pq1.add(3);

        // 3. Saca de la cola de prioridad el elemento con mayor prioridad, según el comparador.
        int mostPriorityInt = pq1.remove();
        
        // 4. Imprimir por consola el resultado.
        System.out.println("The most priority integer is " + mostPriorityInt);
    }
}
