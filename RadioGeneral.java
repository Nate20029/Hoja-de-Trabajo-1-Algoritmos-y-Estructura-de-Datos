//RadioGeneral
//--------------------------------------------------------------
//Hoja de Trabajo #1
//Creada por Esteban Aldana Guerra 20591 y Natanael Girón 20029
//Algoritmos y Estructura de Datos
//Ultima modificación: 18/01/2021
//-----------------------------------------------------------------

public interface RadioGeneral {

    // Comprueba si la radio esta encendida, si no lo está no deja realizar otra
    // acción hasta que se encienda la Radio
    public boolean isON();

    // Método encargado de encender la radio
    public void encender();

    // Método encargado de apagar la Radio
    public void apagar();
