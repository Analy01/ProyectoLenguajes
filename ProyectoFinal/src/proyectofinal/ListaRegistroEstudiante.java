package proyectofinal;


import java.util.*;

public class ListaRegistroEstudiante {
    private ArrayList<Estudiante> ListadoEstudiantes = new ArrayList<Estudiante>();
   public ListaRegistroEstudiante(ArrayList<Estudiante> ListadoEstudiantes) {
        this.ListadoEstudiantes = ListadoEstudiantes;
    }
    public ListaRegistroEstudiante() {
    }
   public ArrayList<Estudiante> getListadoEstudiantes() {
        return ListadoEstudiantes;
    }
   public void setListadoEstudiantes(ArrayList<Estudiante> ListadoEstudiantes) {
        this.ListadoEstudiantes = ListadoEstudiantes;
    }
   public void IncluirEstudiante(Estudiante E) {
        this.ListadoEstudiantes.add(E);
    }
   public void imprimir (){
          if (ListadoEstudiantes != null) {
            for (Estudiante opc : ListadoEstudiantes) {
                System.out.println("---------------");
                System.out.println(opc.getCedula());
                System.out.println(opc.getNombres());
                System.out.println(opc.getEmail());
                }
            }
        else {
            System.out.println("No hay Estudiantes para mostrar");
        }
    }
}
    