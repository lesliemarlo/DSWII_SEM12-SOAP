//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.model.persona;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.dswii.u02.t05.model.persona package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.dswii.u02.t05.model.persona
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonaRequest }
     * 
     * @return
     *     the new instance of {@link GetPersonaRequest }
     */
    public GetPersonaRequest createGetPersonaRequest() {
        return new GetPersonaRequest();
    }

    /**
     * Create an instance of {@link GetPersonaResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonaResponse }
     */
    public GetPersonaResponse createGetPersonaResponse() {
        return new GetPersonaResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     * @return
     *     the new instance of {@link Persona }
     */
    public Persona createPersona() {
        return new Persona();
    }

}
