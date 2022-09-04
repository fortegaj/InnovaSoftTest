package com.los_Turneados.Innova.Soft.servicios;

import com.los_Turneados.Innova.Soft.modelos.Empleado;
import com.los_Turneados.Innova.Soft.repositorios.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository Empleado;

    public List<Empleado> listar(){
        return Empleado.findAll();
    }

    public Empleado guardarEmpleado(Empleado empleado){
        return Empleado.save(empleado);
    }

    public Empleado consultarEmpleadoPorID(Integer id_empleado){
        return Empleado.findById(id_empleado).get();
    }

    public Empleado actualizarEmpleado(Empleado empleado){
        return Empleado.save(empleado);
    }

    public void eliminarEmpleado(Integer id_empleado){
        Empleado.deleteById(id_empleado);

    }
}
