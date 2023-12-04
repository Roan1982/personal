package com.Roan.Trabajo.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @ManyToOne
    private Categoria categoria;
    
    @Column
    private String periodo;

    @Column
    private String expediente;

    @Column
    private String factura;

    @Column
    private Double monto;

    @Column
    private Double montoTotal;

    @Column
    private String detalle;

    @Column
    private String tipoTramite;

    @Column
    private String estado;

    @Column
    private String proveedor;

    @Column
    private LocalDate fechaUltimoPase;

    @Column
    private String usuario;
    
    
}
