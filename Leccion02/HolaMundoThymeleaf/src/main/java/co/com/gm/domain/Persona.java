package co.com.gm.domain;

import lombok.Data;

/**
 *
 * @author nicolas
 */

@Data //Genera metodos get y set para las variables declaradas
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
