package com.jdev.ORM.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String lastName;

    @Column
    private String phone;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    Set<Compra> Compra = new HashSet<Compra>();

    public Cliente(){}

    public Cliente(String name, String lastName, String phone){
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    /*public Set<com.jdev.ORM.Model.Compra> getCompra() {
        return Compra;
    }*/
}
