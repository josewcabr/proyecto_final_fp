package com.jdev.ORM.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define la generación de claves basandose en el número de tuplas
    private int id;


    //Relación muchos a uno, una Compra solo puede tener un Cliente
    @ManyToOne
    @JoinColumn(name = "FK_idCliente", nullable = false)
    private Cliente cliente;

    //Relación muchos a uno, una Compra solo puede tener un Producto (con su cantidad)
    @ManyToOne
    @JoinColumn(name = "FK_idProducto", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private int amount;
    @Column(nullable = false)
    private LocalDate date;

    public Compra(){}

    public Compra(Cliente cliente, Producto producto, int amount, LocalDate date){
        this.cliente = cliente;
        this.producto = producto;
        this.amount = amount;
        this.date = date;

    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
