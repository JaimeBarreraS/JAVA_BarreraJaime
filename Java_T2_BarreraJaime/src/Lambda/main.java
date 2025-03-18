package Lambda;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Jaime Barrera
 */
public class main {
    public static void main(String[] args) {
        // Funciones lambda
        // Las funciones lambda son funciones o métodos en Java que se representarán de manera anónima 
        // pues se definen en línea donde se vayan a utilizar. Dichas funciones pueden recibir cero o 
        // más argumentos y devolver uno o ningún valor de retorno. 

        // Sintaxis
        // (parámetros) -> { cuerpo de la función }

        // Parámetros: Son los valores de entrada de la función. 
        // Operador ->: Separa los parámetros de la implementación. 
        // Cuerpo de la función: Es el código que se ejecutará. 

        // Las expresiones lambda solo funcionan con interfaces funcionales, es decir, 
        // interfaces que tienen un único método abstracto. Algunas interfaces funcionales predefinidas en java.util.function incluyen:

        // Function<T, R> → Recibe un argumento y devuelve un resultado. 
        // Consumer<T> → Recibe un argumento y no devuelve nada. 
        // Supplier<T> → No recibe argumentos, pero devuelve un resultado. 
        // Predicate<T> → Recibe un argumento y devuelve true o false. 

        // Consumer es una interfaz funcional que representa una operación que acepta un solo argumento de entrada y no devuelve ningún resultado. 
        // La interfaz Consumer se utiliza comúnmente para realizar acciones o efectos secundarios sobre un objeto, como imprimirlo en la consola, 
        // agregarlo a una colección, o cualquier otra operación que no requiera devolver un valor.

        // Creación de un Consumer<String> usando una expresión lambda
        Consumer<String> consumidor = saludo -> {

            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo concatenado con una cadena adicional
            System.out.println(saludo + " ¡Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del Consumer con un argumento "Hola Pepe"
        consumidor.accept("Hola Pepe");  

        // Creación de un BiConsumer<String, String> usando una expresión lambda
        BiConsumer<String, String> consumidor2 = ( nombre, saludo) -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo, nombre y una cadena adicional
            System.out.println(saludo + " " + nombre + " ¡Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del BiConsumer con dos argumentos "Pepe" y "Hola"
        consumidor2.accept("Pepe", "Hola");
        
        /*
        La interfaz funcional Supplier<T> pertenece al paquete java.util.function y se utiliza para representar un proveedor de resultados. 
        Esta interfaz no toma ningún argumento y produce un resultado de tipo T. Es decir, se utiliza cuando se necesita generar o 
        proporcionar un valor, pero no se tiene ningún argumento para hacerlo. Se puede pensar en ello como una fábrica que suministra datos.
        */

        // Supplier que suministra un número aleatorio entre 1 y 100
        Supplier<Integer> generadorAleatorio = () -> new Random().nextInt(100) + 1;

        // Obtener el resultado del Supplier
        int numeroAleatorio = generadorAleatorio.get();

        System.out.println("Número aleatorio: " + numeroAleatorio);
        
        /*
        La interfaz funcional Function<T, R> pertenece al paquete java.util.function y se utiliza 
        para crear un método no explícito, que reciba parámetros y retorne un valor.
        */

        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };

        String mensaje = "Holiisss!!";
        int longitud = sizeOf.apply(mensaje);

        System.out.println("Longitud del mensaje: " + longitud);

        /*
        La interfaz funcional Predicate<T> pertenece al paquete java.util.function y se utiliza 
        para retornar un valor booleano: True or False.
        */

        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        System.out.println("¿4 es par? : " + esPar.test(4));
        System.out.println("¿7 es par? : " + esPar.test(7));

        
    }   
}
