/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.priorityqueue;

import java.util.Comparator;

/**
 * Comparador personalizado de enteros: los números mayores serán los de menor
 * peso (más prioritarios).
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class CustomIntegerComparator implements Comparator<Integer> {

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        // 1. Si entero o1 es mayor que o2, se retornará -1 (menor peso); 
        // si son iguales, 0; si el entero o1 es menor, 1.
        if (o1 > o2) {
            return -1;
        } else if (o1 == o2) {
            return 0;
        } else {
            return 1;
        }
    }
}
