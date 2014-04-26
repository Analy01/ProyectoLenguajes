package proyectofinal;


public class Estudiante {
    private long cedula;
     private String nombres;
     private String email;
     
public Estudiante()
    {
        this.cedula = 0;
        this.nombres="";
        this.email="";
    }
    public Estudiante(long cedula, String nombres, String email)
    {   this.cedula = cedula;
        this.nombres = nombres;
        this.email = email;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
