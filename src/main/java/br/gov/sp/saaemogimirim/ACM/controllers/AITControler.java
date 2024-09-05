package br.gov.sp.saaemogimirim.ACM.controllers;


import br.gov.sp.saaemogimirim.ACM.dto.AIT_DTO;
import br.gov.sp.saaemogimirim.ACM.entities.AIT;
import br.gov.sp.saaemogimirim.ACM.services.AITService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ait")
public class AITControler {

    @Autowired
    private AITService service;

    @GetMapping
    public List<AIT_DTO> findAll(){
        return service.findAll();
    }
}
