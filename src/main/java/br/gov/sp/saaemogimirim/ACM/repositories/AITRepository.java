package br.gov.sp.saaemogimirim.ACM.repositories;

import br.gov.sp.saaemogimirim.ACM.entities.AIT;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AITRepository extends JpaRepository <AIT, LocalDateTime> {
}
