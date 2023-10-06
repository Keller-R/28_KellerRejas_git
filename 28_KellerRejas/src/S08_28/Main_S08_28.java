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
public class Main_S08_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        estudiante_28 est1 = new estudiante_28();
        
        est1.setNombre("Keller");
        est1.setApellidos("Rejas Carrasco");
        est1.setEdad(18);
        est1.presentarse();
        
        animal_28 anml = new animal_28();
        anml.setNombre("gata");
        anml.setEspecie("bandida");
        anml.setEdad(18);
        anml.emitirSonido();
        anml.accion();
        anml.para_el_profe();
         
        
    }
    
}
