package examenlab5p2_juanlopez;

import java.util.Date;

public class Empleados extends Usuarios{
    protected String carrera, puesto, años;

    public Empleados() {
    }

    public Empleados(String carrera, String puesto, String años, String nombre, String apellido, String contraseña, String sexo, String departamento, Date naci) {
        super(nombre, apellido, contraseña, sexo, departamento, naci);
        this.carrera = carrera;
        this.puesto = puesto;
        this.años = años;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    @Override
    public String toString() {
        return super.toString()+"Carrera: " + carrera + "  Puesto laboral: " + puesto + "  Años de trabajo: " + años;
    }
    
}
