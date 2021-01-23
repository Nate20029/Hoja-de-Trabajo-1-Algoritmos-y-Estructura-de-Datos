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
