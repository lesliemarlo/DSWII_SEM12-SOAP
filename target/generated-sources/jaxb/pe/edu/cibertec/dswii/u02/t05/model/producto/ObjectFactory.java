//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.cibertec.dswii.u02.t05.model.producto;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.dswii.u02.t05.model.producto package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.dswii.u02.t05.model.producto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductoRequest }
     * 
     * @return
     *     the new instance of {@link GetProductoRequest }
     */
    public GetProductoRequest createGetProductoRequest() {
        return new GetProductoRequest();
    }

    /**
     * Create an instance of {@link GetProductoResponse }
     * 
     * @return
     *     the new instance of {@link GetProductoResponse }
     */
    public GetProductoResponse createGetProductoResponse() {
        return new GetProductoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     * @return
     *     the new instance of {@link Producto }
     */
    public Producto createProducto() {
        return new Producto();
    }

}
