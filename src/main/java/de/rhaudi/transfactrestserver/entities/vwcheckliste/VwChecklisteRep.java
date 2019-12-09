package de.rhaudi.transfactrestserver.entities.vwcheckliste;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface VwChecklisteRep extends JpaRepository<VwChecklisteEntity, Long>, JpaSpecificationExecutor<VwChecklisteEntity> {

        }