//--------------------------------------------------------------
//Hoja de Trabajo #1
//Creada por Esteban Aldana Guerra 20591 y Natanael Girón 20029
//Algoritmos y Estructura de Datos
//Ultima modificación: 22/01/2021
//-----------------------------------------------------------------
import java.util.Scanner;

public class RadioM implements RadioGeneral {
    private boolean estado = false;
    private boolean emisor = true;
    private double contador = 89.7;
    double[] numeros = new double[13];
    int op2 = 0;
    Scanner scan = new Scanner(System.in);

    @Override
    public boolean isON() {
        return estado;
    }

    @Override
    // Metodo para que el metodo isOn se convierta en true
    public void encender() {
        System.out.println("Usted se encuentra en la emisora: 89.7\n");
        estado = true;

    }

    @Override
    // Metodo que hace que el metodo isOn, se convierta en false
    public void apagar() {
        estado = false;
    }

    @Override
    // Pasa a la siguiente radio
    public void incrementar() {
        if (emisor == true) {
            if (contador < 107.9) {
                contador = contador + 0.2;
                System.out.println("Usted se encuentra en la emisora: " + contador + "FM" + "\n");
            } else if (contador > 107.9) {
                contador = 89.5;
                contador = contador + 0.2;
                System.out.println("Usted se encuentra en la emisora: " + contador + "FM" + "\n");
            }
        } else if (emisor == false) {

            if (contador < 107.9) {
                contador = contador + 0.2;
                System.out.println("Usted se encuentra en la emisora: " + contador + "AM" + "\n");
            } else if (contador > 107.9) {
                contador = 89.5;
                contador = contador + 0.2;
                System.out.println("Usted se encuentra en la emisora: " + contador + "AM" + "\n");
            }
        }

    }
