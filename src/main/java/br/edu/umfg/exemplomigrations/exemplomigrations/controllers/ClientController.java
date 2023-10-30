package br.edu.umfg.exemplomigrations.exemplomigrations.controllers;

import br.edu.umfg.exemplomigrations.exemplomigrations.model.Client;
import br.edu.umfg.exemplomigrations.exemplomigrations.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> postClient (@RequestBody Client client){
        clientRepository.save(client);

        return ResponseEntity.ok(client);
    }

    @GetMapping
    public ResponseEntity<Iterable<Client>> getClient(){
        return ResponseEntity.ok(clientRepository.findAll());
    }
}
