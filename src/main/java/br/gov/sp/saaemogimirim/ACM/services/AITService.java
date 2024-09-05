package br.gov.sp.saaemogimirim.ACM.services;

import br.gov.sp.saaemogimirim.ACM.dto.AIT_DTO;
import br.gov.sp.saaemogimirim.ACM.entities.AIT;
import br.gov.sp.saaemogimirim.ACM.repositories.AITRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AITService {
    @Autowired
    private AITRepository repository;
    @Transactional(readOnly = true)
    public List<AIT_DTO> findAll(){
        List<AIT> result = repository.findAll();
        List<AIT_DTO> dto = result.stream().map(x->new AIT_DTO(x)).toList();
        return dto;
    }
    @Transactional(readOnly = true)
    public AIT_DTO findById(LocalDateTime id){
        AIT result = repository.findById(id).get();
        return new AIT_DTO(result);
    }
}
