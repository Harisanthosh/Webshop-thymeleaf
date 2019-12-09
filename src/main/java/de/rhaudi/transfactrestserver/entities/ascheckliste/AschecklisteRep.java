package de.rhaudi.transfactrestserver.entities.ascheckliste;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AschecklisteRep extends JpaRepository<AschecklisteEntity, Long>, JpaSpecificationExecutor<AschecklisteEntity> {

}