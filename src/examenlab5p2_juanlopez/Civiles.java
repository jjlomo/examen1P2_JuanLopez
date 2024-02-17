
package examenlab5p2_juanlopez;

import java.util.ArrayList;
import java.util.Date;

public class Civiles extends Usuarios{
    ArrayList<Tramites>tramite= new ArrayList<>();

    public Civiles() {
    }

    public Civiles(String nombre, String apellido, String contraseña, String sexo, String departamento, Date naci) {
        super(nombre, apellido, contraseña, sexo, departamento, naci);
    }
    

    public ArrayList<Tramites> getTramite() {
        return tramite;
    }

    public void setTramite(ArrayList<Tramites> tramite) {
        this.tramite = tramite;
    }

    @Override
    public String toString() {
        return super.toString()+"Tramite: " + tramite;
    }
    
}
