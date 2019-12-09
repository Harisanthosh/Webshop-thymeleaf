package de.rhaudi.transfactrestserver.entities.fabaum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface FabaumRep extends JpaRepository<FabaumEntity, Long>, JpaSpecificationExecutor<FabaumEntity> {

        }