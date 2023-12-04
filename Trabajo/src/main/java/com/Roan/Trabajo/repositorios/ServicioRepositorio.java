
package com.Roan.Trabajo.repositorios;

import com.Roan.Trabajo.entidades.Categoria;
import com.Roan.Trabajo.entidades.Servicio;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServicioRepositorio extends JpaRepository<Servicio,Long> {
    
   List<Servicio> findByDetalleContainingIgnoreCase(String detalle);

    List<Servicio> findByProveedor(String proveedor);

    List<Servicio> findByFechaUltimoPaseBetween(LocalDate fechaInicio, LocalDate fechaFin);

    List<Servicio> findByExpediente(String expediente);

    List<Servicio> findByCategoria(Categoria categoria);

    List<Servicio> findByFactura(String factura);

    List<Servicio> findByMonto(Double monto);

    List<Servicio> findByMontoTotal(Double montoTotal);

    List<Servicio> findByTipoTramite(String tipoTramite);

    List<Servicio> findByEstado(String estado);

    List<Servicio> findByFechaUltimoPase(LocalDate fechaUltimoPase);

    List<Servicio> findByUsuario(String usuario);  
    
    
    
}