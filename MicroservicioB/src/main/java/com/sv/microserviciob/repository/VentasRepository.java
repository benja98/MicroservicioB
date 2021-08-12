package com.sv.microserviciob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sv.microserviciob.dto.VentasDto;
import com.sv.microserviciob.modelo.Empresas;
import com.sv.microserviciob.modelo.Totales;
import com.sv.microserviciob.modelo.Ventas;

public interface VentasRepository extends JpaRepository <Ventas, Integer> {

	@Query(value = "SELECT v FROM Ventas v "
            + "JOIN FETCH v.empresa e "
            + "JOIN FETCH v.factura f "
            + "JOIN FETCH f.totalesId t "
            + "where t.formaPago = ? ")
 public List<Ventas> findFormaPago(@Param("formaPago") String forma);
 
}
