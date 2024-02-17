
package examenlab5p2_juanlopez;

import java.util.Date;
import java.util.Random;

public class Usuarios {
    protected String nombre, apellido, contraseña, sexo, departamento, id;
    protected Date naci;
    Random ran=new Random();

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String contraseña, String sexo, String departamento, Date naci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.departamento = departamento;
        this.naci = naci;
        id=getId();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String getID(){
        return id;
    }

    public String getId() {
        String idd="";
        int n;
        if (departamento.equals("Francisco Morazan")){
            idd+="01";
            n=ran.nextInt(28)+1;
            if (n<10){
                idd+="0"+n+"-";
            }else{
                idd+=n+"-";
            }
        }else if (departamento.equals("Cortes")) {
            idd+="02";
            n=ran.nextInt(12)+1;
            if (n<10){
                idd+="0"+n+"-";
            }else{
                idd+=n+"-";
            }
        }else if (departamento.equals("Comayagua")) {
            idd+="03";
            n=ran.nextInt(12)+1;
            if (n<10){
                idd+="0"+n+"-";
            }else{
                idd+=n+"-";
            }
        }
        n=naci.getYear()+1900;
        idd+=n+"-";
        n=ran.nextInt(90000)+10000;
        idd+=n;
        id=idd;
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }
    

    public Date getNaci() {
        return naci;
    }

    public void setNaci(Date naci) {
        this.naci = naci;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "  Apellido: " + apellido + "  Contraseña: " + contraseña + "  Sexo: " + sexo + "  Departamento: " + departamento + "  Número de identidad: " + id + "  Nacimiento: " + naci ;
    }
    
}
