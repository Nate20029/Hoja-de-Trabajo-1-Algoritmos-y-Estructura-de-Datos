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
    
    //Aumenta el número de radio (Verificar si está en am o fm)
    public void incrementar();
    
    //Método encargado de asignar a un espacio de una lista el número de Emisora selccionado
    public boolean asignar(int num);
    
    //Mostrar la lista de Emisoras guardadas en la radio
    public boolean emisoras(int num)
        
    //Cambiar entre am y fm
    public void frecuencia();

}
