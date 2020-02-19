package mx.ejemplo.persistencia;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

import mx.ejemplo.dominio.*;

public class GestorDatos {
	
	private Map<String,Articulo> respositorioArticulos = cargarArticulos();
	
	private static Map<String,Articulo> cargarArticulos() {
		Map<String,Articulo> articuloTest = new TreeMap<>();
		articuloTest.put("C-100P", new Articulo("C-100P","Cuaderno Profesional", "100 hojas, carta",
				new BigDecimal("35.20"), new BigDecimal("18.90"),20));
		articuloTest.put("C-200P", new Articulo("C-200P","Cuaderno Profesional", "200 hojas, carta",
				new BigDecimal("69.10"), new BigDecimal("38.90"),16));
		articuloTest.put("L-HB", new Articulo("L-HB","Lápiz", "Mediano calidad estándar",
				new BigDecimal("8.95"), new BigDecimal("4.90"),130));
		articuloTest.put("G-BI", new Articulo("G-BI","Goma de borrar", "Bicolor para lapiz y tinta",
				new BigDecimal("7.75"), new BigDecimal("3.50"),57));
		
		return articuloTest;
	}
	
	public Articulo leerArticulo(String clave) {
		return this.respositorioArticulos.get(clave);
	}
	
}
