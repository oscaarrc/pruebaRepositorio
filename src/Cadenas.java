import java.util.*;
import java.lang.*;
public class Cadenas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Ejercicio 1: Escribir por pantalla cada carácter de una cadena introducida por teclado.
        //nuevo comentario
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
        String nombreApellidos = read.nextLine();
        String[] chainSplit = nombreApellidos.split(" ");
        for (int i = 0; i < chainSplit.length; i++){
            System.out.print(chainSplit[i].substring(0,1).toUpperCase() + chainSplit[i].substring(1) + " ");
        }*/









        //Ejercicio 6: Realizar un programa que dada una cadena de caracteres por caracteres, genere otra cadena resultado de invertir la primera.

        /*System.out.print("Inserta una cadena: ");
        String cadena = read.nextLine();
        String lastChar = String.valueOf(cadena.charAt(0)); // Coge el primer carácter
        for (int i = cadena.length()-1; i>0; i--){ // cadena.lenght-1 porque si no se sale fuera de los límites
            System.out.print(cadena.charAt(i)); // Muestra la cadena empezando por el final
        }
        System.out.print(lastChar); // Concatena el primer carácter con el resto de la cadena*/








        //Ejercicio 7: Pide una cadena y dos caracteres por teclado (valida que sea un carácter), sustituye la aparición del primer carácter en la cadena por el segundo carácter.

        /*System.out.print("Inserta una cadena: ");
        String cadena = read.nextLine();
        System.out.print("Inserta el carácter a sustituir: ");
        String caracter = read.nextLine();

        while (caracter.charAt(0) >= 33 && caracter.charAt(0) <= 47  || caracter.charAt(0) >= 58 && caracter.charAt(0) <= 64 ||
                caracter.charAt(0) >= 91 && caracter.charAt(0) <= 96  || caracter.charAt(0) >= 123 && caracter.charAt(0) <= 255){
            System.out.print("El carácter no es válido.\n Introduce un carácter: ");
            caracter = read.nextLine();
        }

        System.out.print("Inserta el carácter nuevo: ");
        String caracterTwo = read.nextLine();

        while (caracterTwo.charAt(0) >= 33 && caracterTwo.charAt(0) <= 47  || caracterTwo.charAt(0) >= 58 && caracterTwo.charAt(0) <= 64 ||
            caracterTwo.charAt(0) >= 91 && caracterTwo.charAt(0) <= 96  || caracterTwo.charAt(0) >= 123 && caracterTwo.charAt(0) <= 255){
            System.out.print("El carácter no es válido.\n Introduce un carácter: ");
            caracterTwo = read.nextLine();
        }

        cadena = cadena.replaceFirst(caracter, caracterTwo);
        System.out.println("La cadena nueva es: " + cadena);*/







        //Ejercicio 8: Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a minúsculas y viceversa.

        /*System.out.println("Inserta una cadena: ");
        String cadena = read.nextLine();
        String val = "";
        for (int i = 0; i<cadena.length();i++){
            String value = String.valueOf(cadena.charAt(i));
            if (value.equals(value.toUpperCase())){
                value = value.toLowerCase();
            }
            else {
                value = value.toUpperCase();
            }
            val+=value;
        }
        System.out.println(val);*/







        // Ejercicio 9: Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos cadenas se introducen por teclado.

        /*System.out.println("Inserta una cadena: ");
        String cadena = read.nextLine();
        System.out.println("Inserta una subcadena: ");
        String subcadena = read.nextLine();
        if (cadena.contains(subcadena)){
            System.out.println("La cadena contiene la subcadena");
        }
        else{
            System.out.println("La cadena NO contiene la subcadena");
        }*/






        // Ejercicio 10: Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra palíndroma es aquella que se lee igual adelante que atrás. Ej: Roma, amor

        /*System.out.print("Inserta una cadena: ");
        String cadena = read.nextLine();
        StringBuilder newChain = new StringBuilder(cadena);
        if (cadena.equals(newChain.reverse().toString())){
            System.out.println("La palabra es políndroma");
        }
        else {
            System.out.println("La palabra no es políndroma");
        }*/


    /*----------------------------------------------------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------------------------------*/

        //TANDA DE EJERCICIOS


        /*2) Dada una cadena de caracteres, reemplazar las vocales de la misma por un guión*/

        /*System.out.print("Introduce una cadena: ");
        String value = read.nextLine();
        for (int i = 0; i<value.length();i++) {
            String character = String.valueOf(value.charAt(i));
            //Si el carácter es una vocal
            if (character.equalsIgnoreCase("a") || character.equalsIgnoreCase("e") || character.equalsIgnoreCase("i") ||
                    character.equalsIgnoreCase("o") || character.equalsIgnoreCase("u")) {
                value = value.replace(value.charAt(i), '-'); // Reemplaza el valor por un guión
            }
        }
        System.out.println(value);*/




        /*6) Dado un DNI, verificar si la letra es correcta o no. Para calcular la letra del documento
        necesitarás un vector de letras que estarán colocadas en las siguientes posiciones y se aplica la
        siguiente fórmula: dividimos el número completo del DNI entre 23, sin sacar decimales. Utilizamos
        el resto de la división para calcular la letra. Dicho resto estará siempre entre 0 y 22.*/

        /*System.out.print("Inserta un DNI: ");
        String dni = read.nextLine();
        String[] v = new String[23];
        v[0] = "T";
        v[1] = "R";
        v[2] = "W";
        v[3] = "A";
        v[4] = "G";
        v[5] = "M";
        v[6] = "Y";
        v[7] = "F";
        v[8] = "D";
        v[9] = "P";
        v[10] = "X";
        v[11] = "B";
        v[12] = "N";
        v[13] = "J";
        v[14] = "Z";
        v[15] = "S";
        v[16] = "Q";
        v[17] = "V";
        v[18] = "H";
        v[19] = "L";
        v[20] = "C";
        v[21] = "K";
        v[22] = "E";


        int numerico = Integer.parseInt(dni.substring(0,8));
        int resultado = numerico%23;
        String character = String.valueOf(dni.charAt(8));
        if (v[resultado].equals(character)){
            System.out.println("El dni es correcto");
            System.out.println("La letra es " + v[resultado]);
        }
        else {
            System.out.println("El dni no es correcto");
            System.out.println("La letra correcta es " + v[resultado]);
        }
*/





    }
}
