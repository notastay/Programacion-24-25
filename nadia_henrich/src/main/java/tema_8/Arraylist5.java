package tema_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
/*Realizar un programa que cree un ArrayList con 10.000 números aleatorios entre 1 y 6
(como si fuese lanzar un dado). Utilizando los métodos estáticos de la clase Collections
guarda en otro ArrayList la distribución de resultados obtenidos (cuantas veces ha salido
el uno, cuantas veces ha salido el dos, etc…) y muestra su contenido. Finalmente,
también mediante métodos de Collections, mostrar la diferencia de veces entre el
número que más ha salido y el que menos ha salido. */

public class Arraylist5 {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar 10,000 lanzamientos de un dado (valores entre 1 y 6)
        ArrayList<Integer> dados = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            // Generar un número aleatorio entre 1 y 6 y añadirlo al ArrayList
            dados.add(ThreadLocalRandom.current().nextInt(1, 7));
        }

        // Crear un ArrayList con 6 elementos para contar la cantidad de veces que aparece cada número (1 a 6)
        // Inicializar todos los elementos a 0 utilizando Collections.nCopies
        ArrayList<Integer> distribucion = new ArrayList<>(Collections.nCopies(6, 0));

        // Recorrer los lanzamientos y contar cuántas veces aparece cada número
        for (int num : dados) {
            // Incrementar el contador correspondiente en el ArrayList 'distribucion'
            // El índice es (num - 1) porque los índices en el ArrayList comienzan en 0
            distribucion.set(num - 1, distribucion.get(num - 1) + 1);
        }

        // Mostrar la distribución de resultados
        System.out.println("Distribución de resultados:");
        for (int i = 0; i < distribucion.size(); i++) {
            // Mostrar cuántas veces salió cada número (1 a 6)
            System.out.println("Número " + (i + 1) + ": " + distribucion.get(i) + " veces");
        }

        // Calcular el número que más ha salido (máximo) y el que menos ha salido (mínimo)
        int max = Collections.max(distribucion); // Máximo valor en la distribución
        int min = Collections.min(distribucion); // Mínimo valor en la distribución

        // Mostrar la diferencia entre el número que más ha salido y el que menos ha salido
        System.out.println("Diferencia entre el número que más ha salido y el que menos ha salido: " + (max - min));
    }
}

