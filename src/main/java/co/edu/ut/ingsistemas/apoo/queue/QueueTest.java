/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Ejemplo de programación en vivo de la asesoría 1: uso de colas en Java.
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class QueueTest {

    /**
     * Punto de entrada de ejecución del programa.
     * <b>Nota: por temas de simplicidad, este método está en la misma clase que
     * el modelo del mundo; Sin embargo, esto es una mala práctica de
     * programación. </b>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. Se declara y se crea una cola. En Java, no hay un objeto cola (Queue), 
        // pero se implementa con una lista doblemente enlazada.
        Queue<Integer> integers = new LinkedList<>();
        //2. Se agrega a la cola un entero.
        integers.add(9);
        //3. Se muestra el uso de los métodos isEmpty() y size().
        System.out.println("Is the queue empty? " + integers.isEmpty());
        System.out.println("The queue size is " + integers.size());

        //4. Dependiendo de si es vacía la cola, realizar una acción u otra.
        if (integers.isEmpty()) {
            System.out.println("En español");
        } else {
            System.out.println("In english");
        }

        //5. Generar números aleatorios para agregar a la cola.
        int randomInt;
        for (int i = 1; i <= 10; i++) {
            randomInt = (int) (1 + (Math.random() * 30)); // Random(1, 30)  => Intérvalo cerrado [1, 30]
            integers.add(randomInt);
        }
        //6. Se imprime el tamaño después de haber agregado más elementos a la cola.
        System.out.println("The queue size is " + integers.size());
        //7. Se muestra la cola después de haber agregado más elementos a la cola.
        System.out.println(integers);
        //8. Se saca de la cola el elemento siguiendo el principio FIFO.
        integers.remove(); // Es como el dequeue().
        //9. Se muestra el primer elemento, sin sacarlo de la cola.
        System.out.println("First element: " + integers.element());
        //10. Se muestra la cola.
        System.out.println(integers);
    }
}
