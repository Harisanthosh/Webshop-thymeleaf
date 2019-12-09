package de.rhaudi.transfactrestserver.entities.clwerte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClwerteRep extends JpaRepository<ClwerteEntity, Long>, JpaSpecificationExecutor<ClwerteEntity> {

        }