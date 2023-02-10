import java.util.*;
import java.lang.*;
public class Cadenas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Ejercicio 1: Escribir por pantalla cada carácter de una cadena introducida por teclado.

        /*String cadena = "Cadena en carácteres";
        String[] cadenaCompleta = cadena.split("");
        System.out.println(Arrays.toString(cadenaCompleta));*/





        // Ejercicio 2: Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena introducida por teclado

        /*System.out.println("Introduce una cadena: ");
        String cadena = read.nextLine();
        System.out.println("Introduce la subcadena: ");
        String subcadena = read.nextLine();

        if (cadena.startsWith(subcadena)){ // En vez de hacerlo con substring, startsWith comprueba directamente si la subcadena que da comienzo a la cadena
            System.out.println("La cadena empieza por la subcadena indicada.");
        }
        else {
            System.out.println("La cadena NO empieza por la subcadena indicada.");
        }*/





       // Ejercicio 3 Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuantas veces aparece el carácter en la cadena.

        /*System.out.print("Introduce una cadena: ");
        String cadena = read.nextLine();
        System.out.print("Introduce el carácter: ");
        String caracter = read.nextLine();

        int apariciones = 0;

        while (caracter.charAt(0) >= 33 && caracter.charAt(0) <= 47  || caracter.charAt(0) >= 58 && caracter.charAt(0) <= 64 ||
            caracter.charAt(0) >= 91 && caracter.charAt(0) <= 96  || caracter.charAt(0) >= 123 && caracter.charAt(0) <= 255){
            System.out.print("El carácter no es válido.\n Introduce un carácter: ");
            caracter = read.nextLine();
        }
        int contador = 0;
        int posicion = cadena.indexOf(caracter);

        while (posicion != -1){
            contador++;
            posicion = cadena.indexOf(caracter, posicion+1);
        }

        System.out.println("El carácter " + caracter + " se repite " + contador + " veces.");*/





        //Ejercicio 4: Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), realiza un programa que cuente cuantas palabras tiene.

        /*System.out.print("Introduce una cadena con espacios: ");
        String[] cadena = read.nextLine().split(" ");
        System.out.println("La frase tiene: " + cadena.length + " palabras.");*/








        //Ejercicio 5: Si tenemos una cadena con un nombre y apellidos, realizar un programa que muestre las iniciales en mayúsculas.

        /*System.out.println("Escribe tu nombre y apellidos:");
        String nombreApellidos = read.nextLine();*/




        //Ejercicio 6: Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena resultado de invertir la primera.



        //Ejercicio 7: Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.

        //Ejercicio 8: Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.


        // Ejercicio 9: Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.
        // Ejercicio 10: Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás. Ej: Roma, amor



    }
}
