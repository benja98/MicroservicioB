package com.sv.microserviciob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sv.microserviciob.dto.VentasDto;
import com.sv.microserviciob.modelo.Empresas;
import com.sv.microserviciob.modelo.Totales;
import com.sv.microserviciob.modelo.Ventas;

public interface VentasRepository extends JpaRepository <Ventas, Integer> {

	@Query("SELECT v.fecha, v.empresa, v.factura, v.fechaVenta,t.fechaPago, t.impaga, f.impresa, t.formaPago, f.tipoFactura, t.subTotal, t.subtoTaliva, t.subTotalcesc, t.subTotaldescuentos, t.totalaPagar FROM Ventas v INNER JOIN Facturas f ON v.factura = f.numeroFactura INNER JOIN Totales t ON f.totalesId = t.id where t.formaPago = ?1")
//	@Query("select t from Totales t where t.formaPago = ?1")
	List<VentasDto> findByFormaP(String forma);

//	//buscar por nomina
//	@Query("select v from Ventas v inner join Empresas e on v.empresasId = e.id where e.id = ?1")
//	List<Ventas> findByNominas(Empresas empresa);
//	
//	//buscar por nomina
//	@Query("select v from Ventas v where v.fechaVenta = ?1")
//	List<Ventas> findByFechas(String fecha);
}
