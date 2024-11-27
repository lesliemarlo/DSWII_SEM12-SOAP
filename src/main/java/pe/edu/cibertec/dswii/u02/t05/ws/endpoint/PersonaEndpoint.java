/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u02.t05.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.u02.t05.model.persona.GetPersonaRequest;
import pe.edu.cibertec.dswii.u02.t05.model.persona.GetPersonaResponse;
import pe.edu.cibertec.dswii.u02.t05.model.persona.Persona;


/**
 *
 * @author Timothy
 */
@Endpoint
public class PersonaEndpoint {

    private static final String NAMESPACE_URI = "http://t05.u02.dswii.cibertec.edu.pe/persona-service";

    // Método para manejar la solicitud GetPersonRequest
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPersonaRequest")
    @ResponsePayload
    public GetPersonaResponse getPerson(@RequestPayload GetPersonaRequest request) {
        GetPersonaResponse response = new GetPersonaResponse();
        Persona persona = new Persona();
        
        // Ejemplo de datos; aquí se podría hacer una consulta a la base de datos
        persona.setId(request.getId());
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEdad(30);

        response.setPersona(persona);
        return response;
    }
}