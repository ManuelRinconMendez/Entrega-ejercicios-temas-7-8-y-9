import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {


        //Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
        // ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara
        // la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier
        // caso: "Demo de código".
        int numerador = 10;
        int denominador = 0;
        float division;

        try {
            division = numerador / denominador;
        } catch (ArithmeticException e) {
            division = 0;
            System.out.println("Esto no puede hacerse error: " + e.getMessage());
        } finally {
            System.out.println("Demo de codigo");
        }

        //Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado
        // en "fileOut".

        class CopiarArchivo {
            public CopiarArchivo(String fileIn, String fileOut) {
                System.out.println("Desde: " + fileIn);
                System.out.println("Hacia: " + fileOut);

                try {
                    File inFile = new File(fileIn);
                    File outFile = new File(fileOut);

                    FileInputStream in = new FileInputStream(inFile);
                    FileOutputStream out = new FileOutputStream(outFile);

                    int c;
                    while ((c = in.read()) != -1)
                        out.write(c);

                    in.close();
                    out.close();
                } catch (IOException e) {
                    System.err.println("Hubo un error de entrada/salida!!!");
                }
            }

        }


        //Escribe el código que devuelva una cadena al revés.
        // Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        String cadena = "Hola Mundo";
        System.out.print("La cadena \"" + cadena + "\" invertida es: " + reverse(cadena));
        System.out.println("");

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String array[] = {"Uno", "dos", "tres"};
        for (String i : array) {
            System.out.println(i);
        }


        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición
        // y el valor de cada elemento en ambas dimensiones.
        int[][] arrayBidimensional = new int[2][2];
        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;
        arrayBidimensional[1][0] = 3;
        arrayBidimensional[1][1] = 4;

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("Valor: " + arrayBidimensional[i][j]);
                System.out.println("Posicion: [" + i + "," + j + "]");
            }
        }

        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        // Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector vector = new Vector();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);

        System.out.println("Este es el vector completo; " + vector);
        vector.removeElement(3);
        vector.removeElement(4);

        System.out.println("Este es el vector con los elementos borrados: " + vector);

        //Indica cuál es el problema de utilizar un Vector con la capacidad por
        // defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

        //El problema principal es que tendría que copiar todos los 1000 valores en otro vector
        //esto genera una carga importante de recursos para el hardware.


        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        ArrayList<String> elementos = new ArrayList();
        elementos.add("Primero");
        elementos.add("Segundo");
        elementos.add("Tercero");
        elementos.add("Cuarto");

        LinkedList<String> lista = new LinkedList();
        lista.addAll(elementos);

        for (String a : elementos) {
            System.out.println(a);
        }

        System.out.println("_______________");
        for (String b : lista) {
            System.out.println(b);
        }

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación,
        // con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra
        // el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas
        // el primer "for" de relleno.

        ArrayList<Integer> elemento = new ArrayList();

        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0 && i != 0) {
                elemento.add(i);
            }
        }
        System.out.println(elemento);
        }

        public static String reverse (String texto){
            String textoInvertido = "";
            for (int x = texto.length() - 1; x >= 0; x--)
                textoInvertido = textoInvertido + texto.charAt(x);
            return textoInvertido;
        }
    }
    