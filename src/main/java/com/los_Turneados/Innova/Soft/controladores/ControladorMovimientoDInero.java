package com.los_Turneados.Innova.Soft.controladores;

import com.los_Turneados.Innova.Soft.modelos.MovimientoDinero;
import com.los_Turneados.Innova.Soft.servicios.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/MovimientoDinero")
@RestController
public class ControladorMovimientoDInero {

    @Autowired
    private MovimientoDineroService transaccion;

    @GetMapping
    public List<MovimientoDinero> listar(){
        return transaccion.listar();
    }

    @PostMapping
    public MovimientoDinero guardar (@RequestBody MovimientoDinero movimientoDinero){
        return transaccion.guardarMovimiento(movimientoDinero);
    }

    @PutMapping
    public MovimientoDinero actualizar (@RequestBody MovimientoDinero movimientoDinero){
        return transaccion.actualizarMovimientos(movimientoDinero);
    }

    @DeleteMapping
    public void eliminar (@RequestBody MovimientoDinero movimientoDinero){
        transaccion.eliminarMovimiento(movimientoDinero.getId_transaccion());
    }
}

