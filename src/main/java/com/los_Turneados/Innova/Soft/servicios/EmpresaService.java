package com.los_Turneados.Innova.Soft.servicios;

import com.los_Turneados.Innova.Soft.modelos.Empresa;
import com.los_Turneados.Innova.Soft.repositorios.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;// Objeto tipo empresa

    //Metodo para listar las empresas.
    public List<Empresa> getAllEmpresas(){
        List<Empresa> listadoEmpresas = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> listadoEmpresas.add(empresa));
        return listadoEmpresas;
    }

    // Metodo para traer la informacion a partir del Id.
    public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).get();
    }


    // Metodo para guardar o actualizar objetos de tipo Empresa.
    public boolean updateEmpresa(Empresa empresa){
        Empresa emp = empresaRepository.save(empresa);
        if (empresaRepository.findById(emp.getId())!=null){
            return true;
        }
        return false;
    }

    //Metodo para eliminar empresas registradas.
    public boolean deleteEmpresa (Integer id){
        empresaRepository.deleteById(id);
        if (getEmpresaById(id)!=null){
            return false;
        }
        return true;
    }
}
