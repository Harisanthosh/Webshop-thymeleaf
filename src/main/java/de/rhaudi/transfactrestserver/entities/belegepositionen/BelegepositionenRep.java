package de.rhaudi.transfactrestserver.entities.belegepositionen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BelegepositionenRep extends JpaRepository<BelegepositionenEntity, Long>, JpaSpecificationExecutor<BelegepositionenEntity> {

}