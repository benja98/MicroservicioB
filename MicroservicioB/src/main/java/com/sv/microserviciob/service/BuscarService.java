package com.sv.microserviciob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sv.microserviciob.modelo.Ventas;
import com.sv.microserviciob.repository.VentasRepository;

public class BuscarService {

	@Autowired VentasRepository VR;
	
	
	public List<Ventas> findByFormaP(String forma) {
		
		List<Ventas> f = null; 
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
	
	public List<Ventas> findByfindByNominas(Integer empresa) {
		
		List<Ventas> f = null; 
		try {
			
			f = VR.findByNominas(empresa);
			 
			 
			if(f == null) {
				System.out.println("Estos datos no existen");
			} 
		}catch(Exception e) {
			e.printStackTrace();
		} 
		return f;
	}
	
	public List<Ventas> findByFecha(String fecha) {
		
		List<Ventas> f = null; 
		try {
			
			f = VR.findByFechas(fecha);
			 
			 
			if(f == null) {
				System.out.println("Estos datos no existen");
			} 
		}catch(Exception e) {
			e.printStackTrace();
		} 
		return f;
	}
}
