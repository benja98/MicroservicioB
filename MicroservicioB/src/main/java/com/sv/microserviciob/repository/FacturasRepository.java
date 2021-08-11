package com.sv.microserviciob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sv.microserviciob.modelo.Facturas;
import com.sv.microserviciob.modelo.Totales;
public interface FacturasRepository extends JpaRepository<Facturas,Integer>{

	//	@Query("select t from Totales t inner join Facturas f on f.totalesId = t.id where t.impaga = 'FALSE' ")
//	List<Facturas> findByFormaPago(Totales formapago);
}
