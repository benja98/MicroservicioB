package com.sv.microserviciob.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sv.microserviciob.dto.VentasDto;
import com.sv.microserviciob.modelo.Ventas;
import com.sv.microserviciob.repository.VentasRepository;
import com.sv.microserviciob.util.DatosNoEncontradosException;

public class BuscarService {

	@Autowired 
	VentasRepository ventasr;
	
	
//////////////////////////-------------------------TIPO PAGO---------------///////////////////////////////////////////////////////////////////////////////////////	 

	public List<VentasDto> findByFormaP(String forma) {
		List<VentasDto> response = new ArrayList<>();
		try {
			 //declaramos lista a retornar
//			List<VentasDto> response = new ArrayList<>();
		      //recuperamos los ventas
			List<Ventas> respuesta = ventasr.findFormaPago(forma);
		      //iteramos resultado
		          for (Ventas venta : respuesta) {	          
		            //creamos objeto DTo a agregar en lista a response
		        	  VentasDto dto = new VentasDto();
		        	  dto.setFecha(venta.getFecha());
		        	  dto.setEmpresa(venta.getEmpresa().getId());
		        	  dto.setFactura(venta.getFactura().getNumeroFactura());
		        	  dto.setFechaVenta(venta.getFechaVenta());
		        	  dto.setFechaPago(venta.getFactura().getTotalesId().getFechaPago());
		        	  dto.setImpaga(venta.getFactura().getTotalesId().getImpaga());
		        	  dto.setImpaga(venta.getFactura().getTotalesId().getImpaga());
		        	  dto.setFormaPago(venta.getFactura().getTotalesId().getFormaPago());
		        	  dto.setTipoFactura(venta.getFactura().getTipoFactura());
		        	  dto.setSubTotal(venta.getFactura().getTotalesId().getSubTotal());
		        	  dto.setSubTotaliva(venta.getFactura().getTotalesId().getSubtoTaliva());
		        	  dto.setSubTotalcesc(venta.getFactura().getTotalesId().getSubTotalcesc());
		        	  dto.setSubTotaldescuentos(venta.getFactura().getTotalesId().getSubTotaldescuentos());
		        	  dto.setTotalaPagar(venta.getFactura().getTotalesId().getTotalaPagar());
		        	  
		        	  
		        	  response.add(dto);
		          }
		}
		            //una vez lleno
		          catch (DatosNoEncontradosException exc ) {
		  			throw exc;
		  		}catch (Exception e) {
		  			e.printStackTrace();
		  			throw new DatosNoEncontradosException("409", "Error en el servicio buscar por forma de pago");
		  		}
		
		return response; 
	}

//////////////////////////-------------------------NOMINAS EMPRESA---------------///////////////////////////////////////////////////////////////////////////////////////	 
	
	public List<VentasDto> findNomina(Integer id) {
		List<VentasDto> response = new ArrayList<>();
		try {
			 //declaramos lista a retornar
//			List<VentasDto> response = new ArrayList<>();
		      //recuperamos los ventas
			List<Ventas> respuesta = ventasr.findNomina(id);
		      //iteramos resultado
		          for (Ventas venta : respuesta) {	          
		            //creamos objeto DTo a agregar en lista a response
		        	  VentasDto dto = new VentasDto();
		        	  dto.setFecha(venta.getFecha());
		        	  dto.setEmpresa(venta.getEmpresa().getId());
		        	  dto.setFactura(venta.getFactura().getNumeroFactura());
		        	  dto.setFechaVenta(venta.getFechaVenta());
		        	  dto.setFechaPago(venta.getFactura().getTotalesId().getFechaPago());
		        	  dto.setImpaga(venta.getFactura().getTotalesId().getImpaga());
		        	  dto.setImpaga(venta.getFactura().getTotalesId().getImpaga());
		        	  dto.setFormaPago(venta.getFactura().getTotalesId().getFormaPago());
		        	  dto.setTipoFactura(venta.getFactura().getTipoFactura());
		        	  dto.setSubTotal(venta.getFactura().getTotalesId().getSubTotal());
		        	  dto.setSubTotaliva(venta.getFactura().getTotalesId().getSubtoTaliva());
		        	  dto.setSubTotalcesc(venta.getFactura().getTotalesId().getSubTotalcesc());
		        	  dto.setSubTotaldescuentos(venta.getFactura().getTotalesId().getSubTotaldescuentos());
		        	  dto.setTotalaPagar(venta.getFactura().getTotalesId().getTotalaPagar());
		        	  
		        	  
		        	  response.add(dto);
		          }
		}
		            //una vez lleno
		          catch (DatosNoEncontradosException exc ) {
		  			throw exc;
		  		}catch (Exception e) {
		  			e.printStackTrace();
		  			throw new DatosNoEncontradosException("409", "Error en el servicio buscar por forma de pago");
		  		}
		
		return response; 
	}
	
//////////////////////////-------------------------NOMINAS EMPRESA---------------///////////////////////////////////////////////////////////////////////////////////////	 
	
	

	public List<VentasDto> findByFecha(String fecha) {
		List<VentasDto> response = new ArrayList<>();
		try {
			 //declaramos lista a retornar
//			List<VentasDto> response = new ArrayList<>();
		      //recuperamos los ventas
			List<Ventas> respuesta = ventasr.findFecha(fecha);
		      //iteramos resultado
		          for (Ventas venta : respuesta) {	          
		            //creamos objeto DTo a agregar en lista a response
		        	  VentasDto dto = new VentasDto();
		        	  dto.setFecha(venta.getFecha());
		        	  dto.setEmpresa(venta.getEmpresa().getId());
		        	  dto.setFactura(venta.getFactura().getNumeroFactura());
		        	  dto.setFechaVenta(venta.getFechaVenta());
		        	  dto.setFechaPago(venta.getFactura().getTotalesId().getFechaPago());
		        	  dto.setImpaga(venta.getFactura().getTotalesId().getImpaga());
		        	  dto.setImpaga(venta.getFactura().getTotalesId().getImpaga());
		        	  dto.setFormaPago(venta.getFactura().getTotalesId().getFormaPago());
		        	  dto.setTipoFactura(venta.getFactura().getTipoFactura());
		        	  dto.setSubTotal(venta.getFactura().getTotalesId().getSubTotal());
		        	  dto.setSubTotaliva(venta.getFactura().getTotalesId().getSubtoTaliva());
		        	  dto.setSubTotalcesc(venta.getFactura().getTotalesId().getSubTotalcesc());
		        	  dto.setSubTotaldescuentos(venta.getFactura().getTotalesId().getSubTotaldescuentos());
		        	  dto.setTotalaPagar(venta.getFactura().getTotalesId().getTotalaPagar());
		        	  
		        	  
		        	  response.add(dto);
		          }
		}
		            //una vez lleno
		          catch (DatosNoEncontradosException exc ) {
		  			throw exc;
		  		}catch (Exception e) {
		  			e.printStackTrace();
		  			throw new DatosNoEncontradosException("409", "Error en el servicio buscar por forma de pago");
		  		}
		
		return response; 
	}


}
