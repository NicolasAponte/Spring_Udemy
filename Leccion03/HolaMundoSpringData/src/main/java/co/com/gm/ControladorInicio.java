
package co.com.gm;

import co.com.gm.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 *
 * @author nicolas
 */

//Todo debe estar dnetro del mismo paquete que el main con el fin de que Spring 
//pueda mapear el proyecto 

@Controller
@Slf4j //Acceso al log
public class ControladorInicio {
    
    @Value("${index.saludo}")//Etiqueta para poder usar data desde application.properties
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        //Srping genera una instancia automaticamente, no tenemos necesidad de 
        //instanciar Model debido a la etiquita Controller
        var mensaje = "Adiós Mundo con Thymeleaf";
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@gmail.com");
        persona.setTelefono("55443322");
        
        
        var persona2 = new Persona();
        persona2.setNombre("Carla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgomez@gmail.com");
        persona2.setTelefono("13229900");
        
//        var personas = new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
        
        var personas = Arrays.asList(persona,persona2);

        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";//Se refiere a un archivo.html con mismo nombre
    }
}
