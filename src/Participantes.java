import java.util.Scanner;

public class Participantes {

    private String Nombre;

    private String Origen;
    public Participantes(){
        Nombre="";
        Origen="";
    }
    public Participantes(String n , String o){
        Nombre=n;

        Origen=o;

    }
   public String getNombre(){
        return Nombre;
   }
   public void setNombre(String Nombre){
        this.Nombre=Nombre;
   }

    public String getOrigen(){
        return Origen;
    }
    public void setOrigen(String Origen){
        this.Origen=Origen;
    }
}






