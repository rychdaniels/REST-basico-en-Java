package mx.ejemplo.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import mx.ejemplo.dominio.Articulo;
import mx.ejemplo.persistencia.GestorDatos;

@Path("articulo") //La clase sera llamada en la URL como articulo
public class ServicioRest {
	
	GestorDatos gd = new GestorDatos();
	
	@GET //El metodo getArticuloXId será llamado mediante @GET
	@Produces(MediaType.TEXT_PLAIN + "; charset=ISO-8859-1")//Lo que produce es un texto plano
	//QueryParam sirve para decir con que nombre se recibira el parametro
	public String getArticuloXId(@QueryParam("clave") String clave) {
		Articulo artI = gd.leerArticulo(clave);
		if(artI != null) {
			return artI.toString();
		} else {
			return "No existe";
		}
	}
	
	@GET //El metodo getArticuloXId será llamado mediante @GET
	@Produces(MediaType.APPLICATION_JSON + "; charset=ISO-8859-1")//Lo que produce es un JSON
	//QueryParam sirve para decir con que nombre se recibira el parametro
	public Articulo getArticuloXId_Json(@QueryParam("clave") String clave) {
		return gd.leerArticulo(clave);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioRest sr = new ServicioRest();
		System.out.println(sr.getArticuloXId("C-200P"));
	}

}
