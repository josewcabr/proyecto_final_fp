package com.jdev.ORM.Dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompraDAO {

    public int id_cliente;
    public int id_producto;
    public int ammount;
    @JsonIgnore
    public LocalDate buy_date;
}


