package Dia3;

/**
 *
 * @author Jaime Barrera
 */
import java.util.Scanner;

public class Ejercicios_Java {
    
    // complemento ejercicio 18
    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // complemento ejercicio 23
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("\nSeleccione una opción del 1 al 45 para ver el ejercicio:");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Ingrese su elección: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 0) break;

            switch (opcion) {
                case 1:
                    System.out.println("1. Imprimir todos los números naturales del 1 al n.");
                    System.out.print("Ingrese un número n: ");
                    int n = scanner.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    break;    
                case 2:
                    System.out.println("2. Imprimir todos los números naturales en orden inverso.");
                    System.out.print("Ingrese un número n: ");
                    int b = scanner.nextInt();
                    for (int i = b; i >= 1; i--) {
                        System.out.print(i + " ");
                    }
                case 3:
                    System.out.println("3. Imprimir tablas de multiplicar.");
                    System.out.print("Ingrese un número: ");
                    int a = scanner.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(a + " x " + i + " = " + (a * i));
                    }
                    break;
                case 4:
                    System.out.println("4. Imprimir tablas de multiplicar en orden inverso.");
                    System.out.print("Ingrese un número: ");
                    int c = scanner.nextInt();
                    for (int i = 10; i >= 1; i--) {
                        System.out.println(c + " x " + i + " = " + (c * i));
                    }
                    break;
                case 5:
                    System.out.println("5. Imprimir todas las letras del alfabeto de la 'a' a la 'z'.");
                    for (char d = 'a'; d <= 'z'; d++) {
                        System.out.print(d + " ");
                    }
                    break;
                case 6:
                    System.out.println("6. Imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.");
                    for (char e = 'Z'; e >= 'A'; e--) {
                        System.out.print(e + " ");
                    }
                    break;
                case 7:
                    System.out.println("7. Imprimir todos los números pares entre 1 y 100.");
                    for (int i = 2; i <= 100; i += 2) {
                        System.out.print(i + " ");
                    }
                    break;
                case 8:
                    System.out.println("8. Imprimir todos los números impares entre 1 y 100.");
                    for (int i = 1; i <= 100; i += 2) {
                        System.out.print(i + " ");
                    }
                    break;
                case 9:
                    System.out.println("9. Encontrar la suma de todos los números naturales entre 1 y n.");
                    System.out.print("Ingrese un número n: ");
                    int f = scanner.nextInt();
                    int suma = 0;
                    for (int i = 1; i <= f; i++) {
                        suma += i;
                    }
                    System.out.println("Suma: " + suma);
                    break;
                case 10:
                    System.out.println("10. Encontrar la suma de todos los números pares entre 1 y n.");
                    System.out.print("Ingrese un número n: ");
                    int h = scanner.nextInt();
                    int suma1 = 0;
                    for (int i = 2; i <= h; i += 2) {
                        suma1 += i;
                    }
                    System.out.println("Suma: " + suma1);
                    break;
                case 11:
                    System.out.println("11. Encontrar la suma de todos los números impares entre 1 y n.");
                    System.out.print("Ingrese un número n: ");
                    int j = scanner.nextInt();
                    int suma2 = 0;
                    for (int i = 1; i <= j; i += 2) {
                        suma2 += i;
                    }
                    System.out.println("Suma: " + suma2);
                    break;
                case 12:
                    System.out.println("12. Imprimir los valores ASCII");
                    for (int i = 0; i <= 255; i++) {
                        System.out.println(i + " -> " + (char) i);
                    }
                    break;
                case 13:
                    System.out.println("13. Encontral el factorial de cualquier número.");
                    System.out.print("Ingrese un número: ");
                    int l = scanner.nextInt();
                    long factorial = 1;
                    for (int i = 1; i <= l; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial: " + factorial);
                    break;
                case 14:
                    System.out.println("14. Calcular el valor de un número elevado a la potencia de otro.");
                    System.out.print("Ingrese la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    int exp = scanner.nextInt();
                    long resultado = (long) Math.pow(base, exp);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 15:
                    System.out.println("15. Invertir los dígitos de un número dado. ");
                    System.out.print("Ingrese un número: ");
                    int num = scanner.nextInt();
                    int invertido = 0;
                    while (num > 0) {
                        invertido = invertido * 10 + num % 10;
                        num /= 10;
                    }
                    System.out.println("Número invertido: " + invertido);
                    break;
                case 16:
                    System.out.println("16. Calcular la suma de los dígitos de un número.");
                    System.out.print("Ingrese un número: ");
                    int num2 = scanner.nextInt();
                    int suma3 = 0;
                    while (num2 > 0) {
                        suma3 += num2 % 10;
                        num2 /= 10;
                    }
                    System.out.println("Suma de los dígitos: " + suma3);
                    break;
                case 17:
                    System.out.println("17. Verificar si un número dado es primo o no.");
                    System.out.print("Ingrese un número: ");
                    int num3 = scanner.nextInt();
                    boolean esPrimo = num3 > 1;
                    for (int i = 2; i * i <= num3; i++) {
                        if (num3 % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    System.out.println(num3 + (esPrimo ? " es primo." : " no es primo."));
                    break;
                case 18:
                    System.out.println("18. Calcular el MCD (Máximo Común Divisor) de dos números dados.");
                    System.out.print("Ingrese un número: ");
                    int a1 = scanner.nextInt();
                    System.out.print("Ingrese un número: ");
                    int b1 = scanner.nextInt();
                    System.out.println("MCD: " + mcd(a1, b1));
                    break;
                case 19:
                    System.out.println("19. Ingresar números hasta que el usuario lo desee y, al final, muestre la\n" + "cantidad de números positivos, negativos y ceros ingresados.");
                    int positivos = 0, negativos = 0, ceros = 0;
                    System.out.println("Ingrese números (cierra con -999):");
                    while (true) {
                        int num4 = scanner.nextInt();
                        if (num4 == -999) break;
                        if (num4 > 0) positivos++;
                        else if (num4 < 0) negativos++;
                        else ceros++;
                    }
                    System.out.println("Positivos: " + positivos + ", Negativos: " + negativos + ", Ceros: " + ceros);
                    break;
                case 20:
                    System.out.println("20. Ingresar números hasta que el usuario lo desee y, al final, muestre el\n" + " número más grande y el más pequeño ingresados.");
                    int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
                    System.out.println("Ingrese números (cierra con -999):");
                    while (true) {
                        int num5 = scanner.nextInt();
                        if (num5 == -999) break;
                        if (num5 > mayor) mayor = num5;
                        if (num5 < menor) menor = num5;
                    }
                    System.out.println("Mayor: " + mayor + ", Menor: " + menor);
                    break;
                case 21:
                    System.out.println("21. Encontrar los números y la suma de todos los enteros entre 100 y 200 que sean\n" + "divisibles por 9.");
                    int suma4 = 0;
                    System.out.println("Números divisibles por 9 entre 100 y 200:");
                    for (int i = 100; i <= 200; i++) {
                        if (i % 9 == 0) {
                            System.out.println(i);
                            suma4 += i;
                        }
                    }
                    System.out.println("Suma total: " + suma4);
                    break;
                case 22:
                    System.out.println("22. Convertir un número binario a decimal sin usar arreglos, funciones ni bucles\n" + "while.");
                    System.out.print("Ingrese un número binario: ");
                    int binario = scanner.nextInt();
                    int decimal = 0, potencia = 1;
                    for (; binario > 0; binario /= 10) {
                        decimal += (binario % 10) * potencia;
                        potencia *= 2;
                    }
                    System.out.println("Número decimal: " + decimal);
                    break;
                case 23:
                    System.out.println("23. Verificar si un número es un Número Fuerte o no.");
                    System.out.print("Ingrese un número: ");
                    System.out.print("Ingrese un número: ");
                    int num6 = scanner.nextInt(), suma6 = 0, temp = num6;
                    while (temp > 0) {
                        suma6 += factorial(temp % 10);
                        temp /= 10;
                    }
                    System.out.println(num6 + (suma6 == num6 ? " es" : " no es") + " un Número Fuerte.");
                    break;
                case 24:
                    System.out.println("24. Convertir un número hexadecimal a decimal");   
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}


