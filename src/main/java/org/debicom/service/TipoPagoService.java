package org.debicom.service;

import org.debicom.entity.tipoPago;
import org.debicom.repository.TipoPagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoService {
    private final TipoPagoRepository repository;
    public TipoPagoService(TipoPagoRepository repository){
        this.repository = repository;
    }
    public List<tipoPago> Listar(){
        return repository.findAll();
    }
}
