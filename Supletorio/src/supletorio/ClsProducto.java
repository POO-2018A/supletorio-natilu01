package supletorio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ESFOT
 */
public class ClsProducto implements Serializable{
    private String nombre;
    private double precio;
    private String marca;
    private String categoria;
    private ArrayList<String> detalles;

    public ClsProducto() {
    }

    public ClsProducto(String nombre, double precio, String marca, String categoria, ArrayList<String> detalles) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
        this.detalles = detalles;
    }

   

    @Override
    public String toString() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getDetalles() {
        return detalles;
    }

    public void setDetalles(ArrayList<String> detalles) {
        this.detalles = detalles;
    }
    
    
    
}
