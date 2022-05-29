import java.util.Scanner;

public class main {
   static Participantes arregloParticipantes[]=new Participantes[2];
    static Postres arregloPostres[]=new Postres[2];





    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        byte opcion;
        do {

            System.out.println("CONCURSO GASTRONOMICO");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Agregar participantes");
            System.out.println("2. Mostrar participantes");
            System.out.println("3. Mostrar personas con postres");
            System.out.println("4. Agregar postres");
            System.out.println("5. Buscar personas");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción:");
            opcion = leer.nextByte();
            leer.nextLine();

            switch (opcion) {
                case 1: agregarParticipantes();

                    break;
                case 2: imprimir();

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
            System.out.print("Presione una tecla para continuar...");
            leer.nextLine();
        }while (opcion <6);



    }

    public static void agregarParticipantes(){
        Scanner teclado = new Scanner(System.in);


        String nombre="";
        String origen="";

        for(int i=0; i< arregloParticipantes.length;i++){
            System.out.println(i+"-Ingrese su nombre");
            nombre=teclado.nextLine();
            System.out.println(i+"-Ingrese su lugar de origen");
            origen=teclado.nextLine();
            arregloParticipantes[i]=new Participantes(nombre,origen);
        }

        String postre="";
        String ingredientes="";
        for(int i=0; i< arregloPostres.length;i++){
            System.out.println(i+"-Ingrese su postre");
            postre=teclado.nextLine();
            System.out.println(i+"-Ingrese sus ingredientes");
            ingredientes=teclado.nextLine();
            arregloPostres[i]=new Postres(postre,ingredientes);
        }
        //limite

    }

    public static void imprimir(){
        for(int i=0; i<arregloParticipantes.length; i++){
            System.out.println("Nombre: "+ arregloParticipantes[i].getNombre());
            System.out.println("Lugar: "+ arregloParticipantes[i].getOrigen());
            System.out.println("Postre: "+ arregloPostres[i].getNombreP());
            System.out.println("Ingredientes: "+ arregloPostres[i].getIngredientes());
        }


    }


}
