package de.rhaudi.transfactrestserver.entities.arbeitsschritte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbeitsschritteRep extends JpaRepository<ArbeitsschritteEntity, Long>, JpaSpecificationExecutor<ArbeitsschritteEntity> {

}