package com.sv.microserviciob.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sv.microserviciob.dto.VentasDto;
import com.sv.microserviciob.modelo.Empresas;
import com.sv.microserviciob.modelo.Totales;
import com.sv.microserviciob.modelo.Ventas;
import com.sv.microserviciob.repository.EmpresasRepository;
import com.sv.microserviciob.repository.FacturasRepository;
import com.sv.microserviciob.repository.TotalesRepository;
import com.sv.microserviciob.repository.VentasRepository;

public class BuscarService {

	@Autowired 
	TotalesRepository totalesR;
	@Autowired 
	VentasRepository ventasR;
	@Autowired
	FacturasRepository FR;
	@Autowired
	EmpresasRepository ER;
	
	
	
	public List<VentasDto> findByFormaP(String forma) {
		try {
			 //declaramos lista a retornar
			List<VentasDto> response = new ArrayList<>();
		      //recuperamos los ventas
			List<Ventas> respuesta = ventasR.findFormaPago(forma);
		      //iteramos resultado
		          for (Ventas venta : respuesta) {
		        	  String fecha = venta.getFecha(); 
				       int empresa = venta.getEmpresa().getId(); 
				       int factura = venta.getFactura().getNumeroFactura(); 
				       String fechaVenta = venta.getFechaVenta();  
				       String fechaPago = venta.getFactura().getTotalesId().getFechaPago(); 
				       String impaga = venta.getFactura().getTotalesId().getImpaga(); 
				       String impresa = venta.getFactura().getTotalesId().getImpaga(); 
				       String formaPago = venta.getFactura().getTotalesId().getFormaPago();
				       String tipoFactura = venta.getFactura().getTipoFactura();
				       Double subTotal = venta.getFactura().getTotalesId().getSubTotal(); 
				       Double subTotaliva = venta.getFactura().getTotalesId().getSubtoTaliva(); 
				       Double subTotalcesc = venta.getFactura().getTotalesId().getSubTotalcesc(); 
				       Double subTotaldescuentos = venta.getFactura().getTotalesId().getSubTotaldescuentos(); 
				       Double totalaPagar = venta.getFactura().getTotalesId().getTotalaPagar();
		          
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
		            //una vez lleno
		          catch (DatosNoEncontradosException exc ) {
		  			throw exc;
		  		}catch (Exception e) {
		  			e.printStackTrace();
		  			throw new DatosNoEncontradosException("409", "Error en el servicio buscar por ID");
		  		}
		
		return response; 
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
