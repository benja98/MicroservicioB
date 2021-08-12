package com.sv.microserviciob.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sv.microserviciob.modelo.Empresas;

public interface EmpresasRepository extends JpaRepository<Empresas, Integer> {

@Query(value = "SELECT v.fecha, e.id , v.factura, v.fechaVenta,t.fechaPago, t.impaga, f.impresa, t.formaPago, f.tipoFactura, t.subTotal, t.subtoTaliva, t.subtoTalcesc, t.subtoTaldescuentos, t.totalaPagar from Empresas e INNER JOIN Ventas v on v.empresa = e.id INNER JOIN Facturas f ON v.factura = f.numeroFactura INNER JOIN Totales t ON f.totalesId = t.id where t.formapago = ?1", nativeQuery = true)
////	@Query("select t from Totales t where t.formaPago = ?1")
List<Empresas> findByFormaPNative(String forma);

}
