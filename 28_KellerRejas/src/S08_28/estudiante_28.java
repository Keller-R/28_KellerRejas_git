/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S08_28;

/**
 *
 * @author Usuario
 */
public class estudiante_28 {
    
    //atributos
    public String nombre;
    public String apellidos;
    public int edad;
    
    
    //metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " " + apellidos + " y tengo " + edad + " años.");
    }
}
