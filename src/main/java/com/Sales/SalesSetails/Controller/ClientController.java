package com.Sales.SalesSetails.Controller;

import com.Sales.SalesSetails.Model.Client;
import com.Sales.SalesSetails.Repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @PostMapping("Client")
    public Client addClent(@RequestBody Client client){
        return clientRepository.save(client);
    }

}
