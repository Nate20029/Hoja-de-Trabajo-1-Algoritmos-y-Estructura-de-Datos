//----------------------------------------------------------
//Hoja de Trabajo #1
//Creada por Esteban Aldana Guerra 20591 y Natanael Girón 20029
//Algoritmos y Estructura de Datos
//Ultima modificación: 22/01/2021
//----------------------------------------------------------

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        RadioM radio = new RadioM();

        Scanner scan = new Scanner(System.in);
        int op, op3 = 0;

        System.out.println("Bienvenido a Radio Tech");

        while (!radio.isON()) {

            try {

                System.out.println("Desea Encender la Radio??? ");
                System.out.println("1. SI");
                System.out.println("2. No");
                op = scan.nextInt();

                if (op == 1) {
                    System.out.println("Se ha encendido la radio\n");
                    radio.encender();
                    break;
                } else if (op == 2) {
                    System.out.println("Que tenga un buen dia\n");
                    System.exit(0);
                    break;
                } else {
                    System.out.println("El numero ingresado no es valido\n");
                }

            } catch (Exception e) {

                System.out.println("Ingrese solo numeros...\n");
                scan.next();
            }
        }

        while (radio.isON() == true) {
            int op1 = 0;

            try {

                System.out.println(
                        "A continuación encontrará diferentes opciones en las cuales podrá controlar de manera eficiente nuestra Radio Virtual\n");
                System.out.println("1. Siguiente Emisora ");
                System.out.println("2. Guardar Emisora ");
                System.out.println("3. Elegir Modo (AM-FM)");
                System.out.println("4. Seleccionar Emisora");
                System.out.println("5. Apagar la Radio ");
                op1 = scan.nextInt();

                if (op1 == 1) {
                    // Si el usuario elige la opcion 1
                    radio.incrementar();

                } else if (op1 == 2) {
                    // Si el usuario elige la opcion 2
                    System.out.println("¿En que espacio del 1 al 12 quisiera guardar la Emisora?\n");
                    op3 = scan.nextInt();
                    radio.asignar(op3);

                } else if (op1 == 3) {
                    // Si el usuario elige la opcion 3
                    radio.frecuencia();

                } else if (op1 == 4) {
                    // Si elige opcion 5
                    System.out.println("Seleccione la Emisora que quiere reproducir(1-12) ");
                    op3 = scan.nextInt();
                    radio.emisoras(op3);
                    // mostrar lista de emisoras guardadas

                } else if (op1 == 5) {
                    // Si el usuario elige la opcion 5
                    System.out.println("Apagando Radio...\n");
                    radio.apagar();
                    break;
                } else {
                    // Si el usuario no elige ninguna de las opciones anteriores
                    System.out.println("Ingrese solamente una de las opciones mencionadas anteriormente\n");
                }

            } catch (Exception e) {

                System.out.println("El número ingresado no es válido\n");
                scan.next();
            }
        }
    }
}
