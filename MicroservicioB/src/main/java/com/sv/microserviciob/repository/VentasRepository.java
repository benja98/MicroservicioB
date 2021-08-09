package com.sv.microserviciob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sv.microserviciob.modelo.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Integer> {

	//buscar por forma de pago
	@Query("select v from Ventas v where v.formaPago = ?1")
	List<Ventas> findByFormaP(String forma);
	
	//buscar por nomina
	@Query("select v from Ventas v inner join Empresas e on v.empresasId = e.id where e.id = ?1")
	List<Ventas> findByNominas(Integer empresa);
		
	//buscar por nomina
	@Query("select v from Ventas v where v.fechaVenta = ?1")
	List<Ventas> findByFechas(String fecha);
}
