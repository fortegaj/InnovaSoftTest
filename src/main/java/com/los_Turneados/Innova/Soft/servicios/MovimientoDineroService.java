package com.los_Turneados.Innova.Soft.servicios;

import com.los_Turneados.Innova.Soft.modelos.MovimientoDinero;
import com.los_Turneados.Innova.Soft.repositorios.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MovimientoDineroService {

    @Autowired
    private MovimientoDineroRepository movimientoDinero;

    public List<MovimientoDinero> listar(){
        return movimientoDinero.findAll();
    }

    public MovimientoDinero guardarMovimiento(MovimientoDinero movimiento){
        return movimientoDinero.save(movimiento);
    }

    public MovimientoDinero consultarMovimientoPorID(Integer id_transaccion){
        return movimientoDinero.findById(id_transaccion).get();
    }

    public MovimientoDinero actualizarMovimientos(MovimientoDinero movimiento){
        return movimientoDinero.save(movimiento);
    }

    public void eliminarMovimiento(Integer id_transaccion){
        movimientoDinero.deleteById(id_transaccion);

    }

}
