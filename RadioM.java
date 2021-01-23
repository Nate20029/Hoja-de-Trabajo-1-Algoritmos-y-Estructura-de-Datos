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
    
    
    @Override
    //Metodo para guardar las emisoras en los 12 botones
    public boolean asignar(int num) {
      numeros [num] = contador;
      System.out.println("\n" + "Emisora guardada con éxito" + "\n");
        
        return false;
    }

    @Override
    //Selecciona
    public boolean emisoras(int num) {
        for (int i = 1; i<13; i++){
          System.out.println("\n" + numeros[i]);
        }
        contador = numeros[num];
        System.out.println(" ");
        System.out.println("Usted se encuentra en la emisora: " + contador + "\n");
        
        return false;
    }

    @Override
    public void frecuencia() {
       System.out.println("¿Que Modo Prefiere?");
          System.out.println("1. AM");
          System.out.println("2. FM");
          op2 = scan.nextInt();
          if (op2 == 1) {
            // Si el Usuario elige la opcion de AM
            System.out.println("Ahora esta en modo AM\n");
            emisor = false;
          
          } else if (op2 == 2) {
            // Si el usuario elige la opcion de FM
            System.out.println("Ahora esta en modo FM\n");
            emisor = true;
          } 
    }   
}
