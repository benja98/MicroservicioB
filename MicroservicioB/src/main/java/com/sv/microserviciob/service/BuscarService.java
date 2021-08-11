package com.sv.microserviciob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sv.microserviciob.dto.VentasDto;
import com.sv.microserviciob.modelo.Empresas;
import com.sv.microserviciob.modelo.Facturas;
import com.sv.microserviciob.modelo.Totales;
import com.sv.microserviciob.modelo.Ventas;
import com.sv.microserviciob.repository.FacturasRepository;
import com.sv.microserviciob.repository.TotalesRepository;
import com.sv.microserviciob.repository.VentasRepository;

public class BuscarService {

	@Autowired 
	TotalesRepository TR;
	@Autowired 
	VentasRepository VR;
	@Autowired
	FacturasRepository FR;
	
	
	
	public List<VentasDto> findByFormaP(String forma) {
		
		List<VentasDto> f = null; 
		try {
			
			f = VR.findByFormaP(forma);
			 
			 
			if(f == null) {
				System.out.println("Estos datos no existen");
			} 
		}catch(Exception e) {
			e.printStackTrace();
		} 
		return f;
	}
	
	
//	
//	
//	public List<Ventas> findByfindByNominas(Empresas empresa) {
//		
//		List<Ventas> f = null; 
//		try {
//			
//			f = VR.findByNominas(empresa);
//			 
//			 
//			if(f == null) {
//				System.out.println("Estos datos no existen");
//			} 
//		}catch(Exception e) {
//			e.printStackTrace();
//		} 
//		return f;
//	}
//	
//	public List<Ventas> findByFecha(String fecha) {
//		
//		List<Ventas> f = null; 
//		try {
//			
//			f = VR.findByFechas(fecha);
//			 
//			 
//			if(f == null) {
//				System.out.println("Estos datos no existen");
//			} 
//		}catch(Exception e) {
//			e.printStackTrace();
//		} 
//		return f;
//	}
}
