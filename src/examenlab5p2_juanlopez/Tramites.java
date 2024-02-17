
package examenlab5p2_juanlopez;

import java.util.Date;

public class Tramites {
    private String nombre, descripcion, id;
    private Date fecha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Tramites() {
    }

    public Tramites(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Tramites(String nombre, String descripcion, String id, Date fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "  Descripcion: " + descripcion + "  Fecha de solicitud: " + fecha + "  Identidad del solicitante: "+id;
    }
    
}
