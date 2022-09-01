package com.los_Turneados.Innova.Soft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "MovimientoDeDinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_transaccion;
    private double monto;
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado usuario;

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public MovimientoDinero() {
    }

    public MovimientoDinero(double monto, String concepto, Empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = empleado;
    }

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
