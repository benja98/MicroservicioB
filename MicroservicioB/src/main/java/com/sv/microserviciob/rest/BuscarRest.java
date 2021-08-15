package com.sv.microserviciob.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sv.microserviciob.repository.VentasRepository;
import com.sv.microserviciob.util.RestResponse;

@RestController
@RequestMapping("/buscar")
public class BuscarRest {
	
	@Autowired 
	VentasRepository ventasrepository;
	@Autowired
	private RestResponse restResponse;
	
//////////////////////////-------------------------BUSCAR POR TIPO PAGO---------------///////////////////////////////////////////////////////////////////////////////////////	 
	
	@GetMapping("/tipopago/{forma}")
	 public ResponseEntity<?> buscarFormaP(@PathVariable("forma") String forma){
		ResponseEntity<?> respuesta = null;
		try {
			if(forma == null || forma.isEmpty()){
				respuesta = restResponse.createCustomizedResponse(null, 400,"400", "Campos vacios" ); 
			}else{
			 respuesta = restResponse.createCustomizedResponse(null, 200,"0", "Success" ); 
			}
    } catch(Exception exc) {
			respuesta = restResponse.createCustomizedResponse(null, 404,"404", "Error en el servicio" ); 
		}
		return ResponseEntity.ok(ventasrepository.findFormaPago(forma));
	}  
	
//////////////////////////-------------------------BUSCAR POR NOMINAS---------------///////////////////////////////////////////////////////////////////////////////////////	 

	@GetMapping("/nomina/{id}")
	 public ResponseEntity<?> buscarNomina(@PathVariable("id") Integer nomina){
		ResponseEntity<?> respuesta = null;
		 
		try {
			
			 respuesta = restResponse.createCustomizedResponse(null, 200,"0", "Success" ); 
	    
   } catch(Exception exc) {
			respuesta = restResponse.createCustomizedResponse(null, 404,"404", "Error en el servicio" ); 
		}
		return ResponseEntity.ok(ventasrepository.findNomina(nomina));
	} 
	
//////////////////////////-------------------------BUSCAR POR FECHAS---------------///////////////////////////////////////////////////////////////////////////////////////	 

	@GetMapping("/fecha")
	 public ResponseEntity<?> buscarFecha(@RequestParam(name = "fecha") String fecha){
		ResponseEntity<?> respuesta = null;
		 
		try {
			
			 respuesta = restResponse.createCustomizedResponse(null, 200,"0", "Success" ); 
	    
  } catch(Exception exc) {
			respuesta = restResponse.createCustomizedResponse(null, 404,"404", "Error en el servicio" ); 
		}
		return ResponseEntity.ok(ventasrepository.findFecha(fecha));
	} 
}
