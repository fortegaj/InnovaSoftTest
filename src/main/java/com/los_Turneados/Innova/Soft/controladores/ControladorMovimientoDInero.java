package com.los_Turneados.Innova.Soft.controladores;

import com.los_Turneados.Innova.Soft.modelos.MovimientoDinero;
import com.los_Turneados.Innova.Soft.servicios.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequestMapping ("/MovimientoDinero")
@RestController
public class ControladorMovimientoDInero {

    @Autowired
    private MovimientoDineroService transaccion;

    @GetMapping
    public List<MovimientoDinero> listar(){
        return transaccion.listar();
    }

    @GetMapping("/{id}")
    public MovimientoDinero consultarPorId(@PathVariable("id") Integer id){
        return transaccion.consultarMovimientoPorId(id);
    }

    @PostMapping
    public MovimientoDinero guardar (@RequestBody MovimientoDinero movimientoDinero){
        return transaccion.guardarMovimiento(movimientoDinero);
    }

    @PutMapping
    public MovimientoDinero actualizar (@RequestBody MovimientoDinero movimientoDinero){
        return transaccion.actualizarMovimientos(movimientoDinero);
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId (@PathVariable("id") Integer id){
        transaccion.eliminarMovimientoporId(id);
    }

    @PatchMapping("/{id}")
    public MovimientoDinero actualizarPorId(@PathVariable ("id") Integer id, @RequestBody Map<Object,Object> objectMap){
        return transaccion.actualizarPorId(id,objectMap);
    }
}
