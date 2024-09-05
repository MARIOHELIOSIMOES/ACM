package br.gov.sp.saaemogimirim.ACM.services;

import br.gov.sp.saaemogimirim.ACM.dto.AIT_DTO;
import br.gov.sp.saaemogimirim.ACM.entities.AIT;
import br.gov.sp.saaemogimirim.ACM.repositories.AITRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AITService {
    @Autowired
    private AITRepository repository;
    public List<AIT_DTO> findAll(){
        List<AIT> result = repository.findAll();
        List<AIT_DTO> dto = result.stream().map(x->new AIT_DTO(x)).toList();
        return dto;
    }
}
