public class Postres {

    private String NombreP;
    private String Ingredientes;

    public Postres(){
        NombreP="";
        Ingredientes="";

    }
    public Postres(String z , String x){
        NombreP=z;
        Ingredientes=x;


    }
    public String getNombreP(){
        return NombreP;
    }
    public void setNombreP(String NombreP){
        this.NombreP=NombreP;
    }

    public String getIngredientes(){
        return Ingredientes;
    }
    public void setIngredientes(String Ingredientes){
        this.Ingredientes=Ingredientes;
    }
}
