/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;
import java.util.ArrayList;
/**
 *
 * @author ESFOT
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String cedula;
    
    private ArrayList<Producto> listaCompras;

    public Cliente(String nombre, String apellido, String cedula, ArrayList<Producto> listaCompras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.listaCompras = listaCompras;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Producto> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Producto> listaCompras) {
        this.listaCompras = listaCompras;
    }
    
    
}
