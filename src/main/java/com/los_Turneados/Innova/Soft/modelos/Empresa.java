package com.los_Turneados.Innova.Soft.modelos;

import javax.persistence.*;

@Entity
@Table(name="Empresa")
public class Empresa {
    //Generacion autoincrementable del Id Empresa
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //Atributos de la clase
    private String nombre;
    private String direccion;
    private String telefono;
    private String NIT;

    //Constructor Vacio
    public Empresa() {
    }

    //Constructor lleno
    public Empresa(String nombre, String direccion, String telefono, String NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    //Getters And Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
