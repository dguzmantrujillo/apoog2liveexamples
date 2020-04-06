/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.reversinglinkedlists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Ejemplo de programación en vivo de la tutoría 1: programa que invierte los
 * elementos de una lista doblemente enlazada. Ejercicio 22.18 tomado de (Deitel
 * & Deitel, 2011, pág. 872).
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class LinkedListsReverser {

    /**
     * Punto de entrada de ejecución del programa.
     * <b>Nota: por temas de simplicidad, este método está en la misma clase que
     * el modelo del mundo; Sin embargo, esto es una mala práctica de
     * programación. </b>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 1. Crear una lista enlazada para almacenar los elementos a invertir.
        LinkedList<String> originalList = new LinkedList<>();

        // 2. Agregar elementos a la lista enlazada. Por simplicidad, van a estar hardcoded, en vez de ser solicitados por la CLI o interfaz gráfica.
        originalList.add("h");
        originalList.add("o");
        originalList.add("l");
        originalList.add("a");

        // 3. Imprimir la lista enlazada.
        System.out.println("The original linked list is " + originalList);

        // 4. Crear una lista enlazada, para almacenar los elementos en orden invertido.
        List<String> reversedList = new LinkedList<>();

        // 5. Obtener un Iterador en orden descendente de la lista enlazada original. Los iteradores de las listas, en Java, son bidireccionales.
        Iterator<String> iterator = originalList.descendingIterator();
        // 5.1 Iterar la lista original y guardar los elementos en una nueva lista enlazada.
        while (iterator.hasNext()) {
            reversedList.add(iterator.next());
        }

        // 6. Imprimir la nueva lista enlazada con los elementos en orden invertido.
        System.out.println("The reversed linked list is " + reversedList);
    }
}
