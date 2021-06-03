package com.jdev.ORM.Model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import javax.persistence.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "productos")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private float price;



    @Column(nullable = false, name = "wear_type")
    private String wearType;


    //Relacion uno a muchos, un producto puede estar en muchas compras.
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    Set<Compra> Compra = new HashSet<Compra>();

    public Producto(){}

    public Producto(String nombre, float price){
        this.name = nombre;
        this.price = price;
    }

    public void setWearType(String wearType) {
        this.wearType = wearType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCompra(Set<com.jdev.ORM.Model.Compra> compra) {
        Compra = compra;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getWearType() {
        return wearType;
    }

    /*public Set<com.jdev.ORM.Model.Compra> getCompra() {
        return Compra;
    }*/



}

