package com.sv.microserviciob.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sv.microserviciob.modelo.Empresas;
import com.sv.microserviciob.modelo.Facturas;
import com.sv.microserviciob.modelo.Totales;
import com.sv.microserviciob.repository.EmpresasRepository;
import com.sv.microserviciob.repository.FacturasRepository;
import com.sv.microserviciob.repository.TotalesRepository;
import com.sv.microserviciob.repository.VentasRepository;
import com.sv.microserviciob.util.RestResponse;

@RestController
@RequestMapping("/buscar")
public class BuscarRest {
	
	@Autowired
	EmpresasRepository ER;
	@Autowired 
	TotalesRepository totalR; 
	@Autowired 
	VentasRepository ventasR;
	@Autowired 
	FacturasRepository FR;
	@Autowired
	private RestResponse restResponse;
	
	@GetMapping("/tipopago/{forma}")
	 public ResponseEntity<?> buscarFormaP(@PathVariable("forma") String forma){
		ResponseEntity<?> respuesta = null;
		 
		try {
			
			 respuesta = restResponse.createCustomizedResponse(null, 200,"0", "Success" ); 
	    
    } catch(Exception exc) {
			respuesta = restResponse.createCustomizedResponse(null, 404,"404", "Error en el servicio" ); 
		}
		return ResponseEntity.ok(ventasR.findFormaPago(forma));	 	 
	}  
	
	
//	@GetMapping("/nominas/{id}")
//	 public ResponseEntity<?> buscarFormaP(@PathVariable("id") Empresas empresa){
//		  
//		ResponseEntity<?> respuesta = null;
//		 
//		try {
//			 respuesta = restResponse.createCustomizedResponse(null, 200,"0", "Success" ); 
//	    
//   } catch(Exception exc) {
//			respuesta = restResponse.createCustomizedResponse(null, 404,"404", "Error en el servicio" ); 
//		}
//		return ResponseEntity.ok(VR.findByNominas(empresa));	
//	}  
	
	
//	@GetMapping("/fechas")
//	 public ResponseEntity<?> buscarFechas(@RequestParam String fecha){
//		  
//		ResponseEntity<?> respuesta = null;
//		 
//		try {
//			 respuesta = restResponse.createCustomizedResponse(null, 200,"0", "Success" ); 
//	    
//  } catch(Exception exc) {
//			respuesta = restResponse.createCustomizedResponse(null, 404,"404", "Error en el servicio" ); 
//		}
//		return ResponseEntity.ok(VR.findByFechas(fecha));	
//	}  
}
