package org.debicom.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tipo_pago")
@Getter
@Setter

public class tipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idTipoPago")
    private int idTipoPago;

    @Column(name = "nombre_pago")
    private String nombrePago;
    }
