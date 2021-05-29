package com.jdev.Rest;


import com.jdev.ORM.Dao.CompraDAO;
import com.jdev.ORM.Model.Cliente;
import com.jdev.ORM.Model.Compra;
import com.jdev.ORM.Model.Producto;
import com.jdev.ORM.Repository.ClienteRepository;
import com.jdev.ORM.Repository.CompraRepository;
import com.jdev.ORM.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    CompraRepository compraRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ProductoRepository productoRepository;

    @GetMapping("")
    public Iterable <Compra> getCompra(){
        return compraRepository.findAll();
    }

    /* @PostMapping("")
    public void postCompra(@RequestBody Compra compra){

        compraRepository.save(compra);
    }*/

    @PostMapping("")
    public void postCompra(@RequestBody CompraDAO compraDAO){
        Compra compra = new Compra();
        Optional<Cliente> cliente = clienteRepository.findById(compraDAO.getId_cliente());
        Optional<Producto> producto = productoRepository.findById(compraDAO.getId_producto());

        if (cliente.isPresent() && producto.isPresent()){
            compra.setCliente(cliente.get());
            compra.setProducto(producto.get());
            compra.setAmount(compraDAO.getAmmount());
            compra.setDate(LocalDate.now());
            compraRepository.save(compra);
        }
        else{
            System.out.println("faltan datos");
        }

    }

}
