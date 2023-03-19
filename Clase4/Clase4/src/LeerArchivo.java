/*
Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
contener números. El programa debe escribir por consola la suma de esos números
a. Al programa anterior agreguele un parámetro para que la operación pueda ser
suma o multiplicación.
 */

import java.io.File;
import java.util.Scanner;
/*NOTAS
 1.  Java te obliga a manejar las exepciones.
 2 . Para ponerle nombre a la exepción si o si el siguiente import.
 */
import java.io.FileNotFoundException;

public class LeerArchivo {

    public static void leerArchivo(String operativa){
                
        String archivo = "Clase4\\src\\numeros.txt";
        File file = new File(archivo);
        int suma = 0;
        int multiplicando = 1;

        //IMPORTANTE sin try except no se puede usar el scanner
        try{
            Scanner scanner = new Scanner(file);

            if (operativa.equals("s")){

                while (scanner.hasNextLine()) {
                    // Es necesario elinimar los caracteres que no son numeros para
                    // usar parseInt
                    String linea = scanner.nextLine();
                    String[] numeros = linea.split(" ");

                    for(String numero: numeros){
                        suma += Integer.parseInt(numero);
                    }
                }
                    scanner.close();

            } if (operativa.equals("m")) {

                int multiplicador;

                while (scanner.hasNextLine()) {
                    
                    String linea = scanner.nextLine();
                    String[] numeros = linea.split(" ");

                    for(int i=0; i<numeros.length; i++ ){

                        multiplicador = Integer.parseInt(numeros[i]);
                        multiplicando = multiplicando*multiplicador;
                    }
                }
                
                scanner.close();
            }else{
            }
            
            // Imprimir la suma
            if (operativa.equals("s")) {
                System.out.println("La suma de los numeros del archivo es: " +suma);
            } if (operativa.equals("m")) {
                System.out.println("La multiplicacion de los numeros del archivo es: " + multiplicando);
            }
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            //System.out.println("Problema con los numeros");
            e.printStackTrace();
        }
    }

    public static String operacionInput(){
        // Declarar la variable antes del do porque sino no se puede acceder luego
        String operacion;

        do{
            // Preguntar el orden y guardar la variable
            System.out.println("Ingrese 's' si quiere sumar o 'm' para multiplicar.");
            operacion = System.console().readLine();
            }while(!operacion.equals("s") && !operacion.equals("m"));

        return operacion;
    }

    public static void main(String[] args){
        String operativa = operacionInput();
        leerArchivo(operativa);
    }
}
