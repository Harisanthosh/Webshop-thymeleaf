package de.rhaudi.transfactrestserver.entities.benutzerzeiten;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BenutzerzeitenRep extends JpaRepository<BenutzerzeitenEntity, Long>, JpaSpecificationExecutor<BenutzerzeitenEntity> {

}