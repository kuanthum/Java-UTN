/*
Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
resultados deben estar en el archivo de salida
*/
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Codificador {

    public static void coder(String choice, int desplazamiento, String texto){

        // Esta clase permite agregar caracteres
        StringBuilder nuevo_texto = new StringBuilder();

        int x;

        if(choice.equals("code")){
            x = desplazamiento;
        }else{
            x = desplazamiento*(-1);
        }

        String alfabeto = "abcdefghijklmnopqrstuvwxyz ";

        for(int i=0;i < texto.length(); i++){
            char letra = texto.charAt(i);
            int indice = alfabeto.indexOf(letra);
            char nueva_letra;

            if(indice+x< 0){
                nueva_letra = alfabeto.charAt(alfabeto.length()+(indice+x));
                //diff con python, no hay indices negativos
            }else{
                nueva_letra = alfabeto.charAt((indice+x)%alfabeto.length());
            }
            //System.out.println(letra + " " + indice + " " + nueva_letra);
            nuevo_texto.append(nueva_letra);
        }
        System.out.println(nuevo_texto);

        try{
            FileWriter writer = new FileWriter("decode_test.txt");
            writer.write(nuevo_texto.toString());
            writer.close();

            System.out.println("El texto ha sido procesado y guardado con éxito");

        } catch (IOException e){
            System.out.println("Error al crear el archivo" + e.getMessage());
        }
    }

    public static String elegirOperativa(){

        String operacion;

        do{
            System.out.println("Tipear 'code' para codificar o 'decode' para decodificar: ");
            operacion = System.console().readLine();
        }while(!operacion.equals("code") && !operacion.equals("decode"));

        return operacion;
    }

    public static int elegirDesplazamiento(){
        // Pedir al uduario la cantidad de desplazamientos al codificar y decodificar.
        String input;
        int desplazamiento = 0;
        boolean esNumero = false;

        do{
            try{
                System.out.println("Ingrese la cantidad de desplazamientos para codificar o decodificar:");
                input = System.console().readLine();
                desplazamiento = Integer.parseInt(input);
                System.out.println(desplazamiento);
                esNumero = true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }while(!esNumero);

        return desplazamiento;
    }

    public static StringBuilder leerArchivo(){

        String input = "";

        System.out.println("Ingrese el nombre del archivo (debe estar en la carpeta src del proyecto)");
        input = System.console().readLine();

        String ruta = "Clase4\\src\\" + input;
        File file = new File(ruta);
        StringBuilder texto = new StringBuilder("");

        try{
            // Consultar esto, el parametro dentro de escaner no puede tener otro nombre que file?
            // Pof ejemplo con 'archivo' no funciona
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String linea = scanner.nextLine();
                texto.append(linea);
        
                }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            System.out.println("Asegurese de que el nombre ingresado es correcto (inluir extension del archivo)");
            System.out.println("Asegurese de que el arhivo está en la carpeta src del proyecto");
        }
        return texto;
    }

    public static void main(String[] args){
        
        String operacion = elegirOperativa();
        int desplazamiento = elegirDesplazamiento();
        StringBuilder archivo = leerArchivo();
        String texto = archivo.toString();
        
        //String texto = "hola mundo";
        //String texto = "krodcpxqgr";

        coder(operacion, desplazamiento, texto);
    }
}
