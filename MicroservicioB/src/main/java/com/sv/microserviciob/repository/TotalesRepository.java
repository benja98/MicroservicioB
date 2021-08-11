package com.sv.microserviciob.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sv.microserviciob.modelo.Facturas;
import com.sv.microserviciob.modelo.Totales;

@Repository
public interface TotalesRepository extends JpaRepository<Totales, Integer> {

	//buscar por forma de pago
//	@Query("SELECT v.fecha, v.empresa, v.factura, v.fechaVenta,t.fechaPago, t.impaga, f.impresa, t.formaPago, f.tipoFactura, t.subTotal, t.subtoTaliva, t.subTotalcesc, t.subTotaldescuentos, t.totalaPagar FROM Ventas v INNER JOIN Facturas f ON v.factura = f.numeroFactura INNER JOIN Totales t ON f.totalesId = t.id where t.formaPago = ?1")
////	@Query("select t from Totales t where t.formaPago = ?1")
//	List<Totales> findByFormaP(String forma);
}
