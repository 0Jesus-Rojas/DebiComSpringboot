package org.debicom.controller;

import org.debicom.entity.tipoPago;
import org.debicom.service.TipoPagoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/TipoPago")
public class TipoPagoController {
    private final TipoPagoService service;
    public TipoPagoController(TipoPagoService service) {
        this.service = service;
    }
    @GetMapping
    public List<tipoPago> Listar(){
        return service.Listar();
    }
}