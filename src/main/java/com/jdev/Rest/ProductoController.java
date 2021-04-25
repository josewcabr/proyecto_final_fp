package com.jdev.Rest;
import com.jdev.ORM.Model.Producto;
import com.jdev.ORM.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping("")
    public Iterable <Producto> getProducto(){
        return productoRepository.findAll();
    }

    @PostMapping("")
    public void postProducto(@RequestBody Producto producto){

        productoRepository.save(producto);
    }
}
