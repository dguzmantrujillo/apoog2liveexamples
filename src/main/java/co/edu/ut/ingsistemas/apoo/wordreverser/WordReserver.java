/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ut.ingsistemas.apoo.wordreverser;

import java.util.Stack;

/**
 * Ejemplo de programación en vivo de la tutoría 2: programa que invierte los
 * caracteres de una palabra, usando una pila (Stack). Ejercicio 22.10 tomado de
 * (Deitel & Deitel, 2011, pág. 872 y 936)
 *
 * @author Diego Alejandro Guzmán Trujillo.
 */
public class WordReserver {

    /**
     * word - Palabra a invertir.
     */
    private String word;

    /**
     * stack - Estructura de datos usada para invertir la palabra.
     */
    private Stack<Character> stack;

    /**
     * Constructor que inicializa el invertidor de palabras.
     *
     * @param word Palabra a invertir.
     */
    public WordReserver(String word) {
        this.word = word;
        this.stack = new Stack<>();
    }

    /**
     * Método usado para invertir la palabra.
     *
     * @return Palabra invertida.
     */
    public String reverse() {
        // 1. Inicializa una variable de tipo carácter(character).
        char c;
        // 2. Ciclo para obtener uno a uno los caracteres de una palabra.
        for (int i = 0; i < this.word.length(); i++) {
            // 2.1 El método charAt(index) obtiene un carácter por un índice.
            c = this.word.charAt(i);
            // 2.2 Ingresa el carácter a la pila.
            this.stack.push(c);
        }
        // 3. Crea un objeto que se usa para concatenar cadenas de caracteres de forma eficiente.
        StringBuilder sb = new StringBuilder();
        // 4. Obtiene el tamaño de la pila antes de sacar elementos de esta.
        int size = this.stack.size();
        // 5. Itera de 1 al tamaño de la pila antes de sacar elementos de esta.
        for (int i = 1; i <= size; i++) {
            sb.append(this.stack.pop()); // 5.1 Sacar el elemento (carácter) de la pila y concatenarlo, para formar la palabra.
        }
        return sb.toString(); // 6. Retornar la palabra invertida.
    }

    /**
     * Punto de entrada de ejecución del programa.
     * <b>Nota: por temas de simplicidad, este método está en la misma clase que
     * el modelo del mundo; Sin embargo, esto es una mala práctica de
     * programación. </b>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear el objeto invertido de palabras. Se construye con una palabra a invertir.
        WordReserver wr = new WordReserver("hola mundo");

        // 2. Se llama (invoca) el método reverse (invertir) y lo almacena en una variable local.
        String reservedWord = wr.reverse();

        // 3. Se imprime por consola el resultado (variable local).
        System.out.println("The reversed word is " + reservedWord);
    }
}
