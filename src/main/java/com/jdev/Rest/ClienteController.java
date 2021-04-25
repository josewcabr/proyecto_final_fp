package com.jdev.Rest;
import com.jdev.ORM.Model.Cliente;
import com.jdev.ORM.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("")
    public Iterable<Cliente> getCliente(){
        return clienteRepository.findAll();
    }

    @PostMapping("")
    public void postCliente(@RequestBody Cliente clinete){
        clienteRepository.save(clinete);
    }
}
