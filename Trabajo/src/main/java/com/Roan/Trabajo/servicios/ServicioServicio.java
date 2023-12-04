
package com.Roan.Trabajo.servicios;

import com.Roan.Trabajo.entidades.Categoria;
import com.Roan.Trabajo.entidades.Servicio;
import com.Roan.Trabajo.repositorios.ServicioRepositorio;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioServicio {
    
     private final ServicioRepositorio servicioRepositorio;

    @Autowired
    public ServicioServicio(ServicioRepositorio servicioRepositorio) {
        this.servicioRepositorio = servicioRepositorio;
    }

    public List<Servicio> getAllServicios() {
        return servicioRepositorio.findAll();
    }

    public Optional<Servicio> getServicioById(Long id) {
        return servicioRepositorio.findById(id);
    }

    public Servicio saveServicio(Servicio servicio) {
        return servicioRepositorio.save(servicio);
    }

    public void deleteServicioById(Long id) {
        servicioRepositorio.deleteById(id);
    }
 
     public List<Servicio> buscarPorPalabraClave(String palabraClave) {
        return servicioRepositorio.findByDetalleContainingIgnoreCase(palabraClave);
    }

    public List<Servicio> buscarPorProveedor(String proveedor) {
        return servicioRepositorio.findByProveedor(proveedor);
    }

    public List<Servicio> buscarPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return servicioRepositorio.findByFechaUltimoPaseBetween(fechaInicio, fechaFin);
    }

    public List<Servicio> buscarPorExpediente(String expediente) {
        return servicioRepositorio.findByExpediente(expediente);
    }

    public List<Servicio> buscarPorCategoria(Categoria categoria) {
        return servicioRepositorio.findByCategoria(categoria);
    }

    public List<Servicio> buscarPorFactura(String factura) {
        return servicioRepositorio.findByFactura(factura);
    }

    public List<Servicio> buscarPorMonto(Double monto) {
        return servicioRepositorio.findByMonto(monto);
    }

    public List<Servicio> buscarPorMontoTotal(Double montoTotal) {
        return servicioRepositorio.findByMontoTotal(montoTotal);
    }

    public List<Servicio> buscarPorDetalle(String detalle) {
        return servicioRepositorio.findByDetalleContainingIgnoreCase(detalle);
    }

    public List<Servicio> buscarPorTipoTramite(String tipoTramite) {
        return servicioRepositorio.findByTipoTramite(tipoTramite);
    }

    public List<Servicio> buscarPorEstado(String estado) {
        return servicioRepositorio.findByEstado(estado);
    }

    public List<Servicio> buscarPorFechaUltimoPase(LocalDate fechaUltimoPase) {
        return servicioRepositorio.findByFechaUltimoPase(fechaUltimoPase);
    }

    public List<Servicio> buscarPorUsuario(String usuario) {
        return servicioRepositorio.findByUsuario(usuario);
    }

   public List<Servicio> obtenerTodosLosServicios() {
        return servicioRepositorio.findAll();
    }
    
     public Servicio guardarServicio(Servicio servicio) {
        return servicioRepositorio.save(servicio);
    }
}