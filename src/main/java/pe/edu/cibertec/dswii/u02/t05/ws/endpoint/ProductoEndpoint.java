/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u02.t05.ws.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.dswii.u02.t05.model.producto.GetProductoRequest;
import pe.edu.cibertec.dswii.u02.t05.model.producto.GetProductoResponse;
import pe.edu.cibertec.dswii.u02.t05.model.producto.Producto;


/**
 *
 * @author Timothy
 */
@Endpoint
public class ProductoEndpoint {

    private static final String NAMESPACE_URI = "http://t05.u02.dswii.cibertec.edu.pe/producto-service";

    // Método para manejar la solicitud GetPersonRequest
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetProductoRequest")
    @ResponsePayload
    public GetProductoResponse getPerson(@RequestPayload GetProductoRequest request) {
        GetProductoResponse response = new GetProductoResponse();
        Producto producto = new Producto();
        
        // Ejemplo de datos; aquí se podría hacer una consulta a la base de datos
        producto.setId(request.getId());
        producto.setNombre("Juan");
        producto.setPrecio("34.0");
        producto.setCantidad(30);

        response.setProducto(producto);
        return response;
    }
}