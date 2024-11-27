/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */

package pe.edu.cibertec.dswii.u02.t05.ws;



import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.boot.web.servlet.ServletRegistrationBean;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.core.io.ClassPathResource;

import org.springframework.ws.config.annotation.EnableWs;

import org.springframework.ws.transport.http.MessageDispatcherServlet;

import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

import org.springframework.xml.xsd.SimpleXsdSchema;

import org.springframework.xml.xsd.XsdSchema;



/**

 *

 * @author Timothy

 */

@EnableWs

@Configuration

public class WebServiceConfig {



   private static final String NAMESPACE_URI_PERSONA = "t05.u02.dswii.cibertec.edu.pe/persona-service";

   private static final String NAMESPACE_URI_PRODUCTO = "t05.u02.dswii.cibertec.edu.pe/producto-service";



   @Bean

   public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {

       MessageDispatcherServlet servlet = new MessageDispatcherServlet();

       servlet.setApplicationContext(applicationContext);

       servlet.setTransformWsdlLocations(true);

       return new ServletRegistrationBean<>(servlet, "/ws/*");

   }



   /*

    * Representa al endpoint localhost:8080/ws/personas.wsdl

    */

   @Bean(name = "personas")

   public DefaultWsdl11Definition defaultWsdl11DefinitionPersonas(@Qualifier("personaSchema") XsdSchema personaSchema) {

       DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();

       wsdl11Definition.setPortTypeName("PersonaPort");

       wsdl11Definition.setLocationUri("/ws");

       wsdl11Definition.setTargetNamespace(NAMESPACE_URI_PERSONA);

       wsdl11Definition.setSchema(personaSchema);

       return wsdl11Definition;

   }



   /*

    * Representa al endpoint localhost:8080/ws/productos.wsdl

    */

   @Bean(name = "productos")



   public DefaultWsdl11Definition defaultWsdl11DefinitionProductos(@Qualifier("productoSchema") XsdSchema productoSchema) {

       DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();

       wsdl11Definition.setPortTypeName("ProductoPort");

       wsdl11Definition.setLocationUri("/ws");

       wsdl11Definition.setTargetNamespace(NAMESPACE_URI_PRODUCTO);

       wsdl11Definition.setSchema(productoSchema);

       return wsdl11Definition;

   }



   @Bean(name = "personaSchema")

   public XsdSchema personasSchema() {

       return new SimpleXsdSchema(new ClassPathResource("/xsd/persona-schema.xsd"));

   }



   @Bean(name = "productoSchema")

   public XsdSchema productosSchema() {

       return new SimpleXsdSchema(new ClassPathResource("/xsd/producto-schema.xsd"));
    }

}