package com.sv.microserviciob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.sv.microserviciob.modelo.Ventas;

public interface VentasRepository extends JpaRepository <Ventas, Integer> {

	//1. buscar por forma de pago
	@Query(value = "SELECT v FROM Ventas v "
            + "JOIN FETCH v.empresa e "
            + "JOIN FETCH v.factura f "
            + "JOIN FETCH f.totalesId t "
            + "where t.formaPago = ?1 ")
 public List<Ventas> findFormaPago(@Param("formaPago") String forma);
	
	
	//2. buscar por nomina
	@Query(value = "SELECT v FROM Ventas v "
            + "JOIN FETCH v.empresa e "
            + "JOIN FETCH v.factura f "
            + "JOIN FETCH f.totalesId t "
            + "where e.id = ?1 ")
 public List<Ventas> findNomina( Integer id);
	
	
	//3. buscar por fecha de nomina 
	@Query(value = "SELECT v FROM Ventas v "
            + "JOIN FETCH v.empresa e "
            + "JOIN FETCH v.factura f "
            + "JOIN FETCH f.totalesId t "
            + "where v.fecha = ?1 ")
 public List<Ventas> findFecha( String fecha);
}
