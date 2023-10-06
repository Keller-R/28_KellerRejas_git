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
public class animal_28 {
    
    public String nombre;
    public int edad;
    public String especie;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void emitirSonido() {
        System.out.println("El animal emite un sonido.");
    }

    public void accion() {
        System.out.println("la " + nombre + " de la especie " + especie + " de edad " + edad + " esta perreando hasta abajo jajajaja xd " );
    }
    public void para_el_profe(){
        System.out.println("CON TODO CARIÑO PARA USTED PROFE....... JAJAJA XD");
    }
}


