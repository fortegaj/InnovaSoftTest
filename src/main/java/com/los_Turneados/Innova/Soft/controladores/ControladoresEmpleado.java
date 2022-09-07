package com.los_Turneados.Innova.Soft.controladores;

import com.los_Turneados.Innova.Soft.modelos.Empleado;
import com.los_Turneados.Innova.Soft.servicios.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping ("/empleado")
@RestController
public class ControladoresEmpleado {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> listar(){
        return empleadoService.listar();
    }

    @PostMapping
    public Empleado guardar(@RequestBody Empleado empleado){
        return empleadoService.guardarEmpleado(empleado);
    }

    @PutMapping
    public Empleado actualizar(@RequestBody Empleado empleado){
        return empleadoService.actualizarEmpleado(empleado);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Empleado empleado){
        empleadoService.eliminarEmpleado(empleado.getId_empleado());
    }
}
