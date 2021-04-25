package com.jdev.Rest;


import com.jdev.ORM.Model.Compra;
import com.jdev.ORM.Repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    CompraRepository compraRepository;

    @GetMapping("")
    public Iterable <Compra> getCompra(){
        return compraRepository.findAll();
    }

    @PostMapping("")
    public void postCompra(@RequestBody Compra compra){
        compraRepository.save(compra);
    }

}
