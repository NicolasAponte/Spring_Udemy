
package co.com.gm;

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
        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        return "index";//Se refiere a un archivo.html con mismo nombre
    }
}
