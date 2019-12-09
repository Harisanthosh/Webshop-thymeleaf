package de.rhaudi.transfactrestserver.entities.properties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertiesRep extends JpaRepository<PropertiesEntity, Long>, JpaSpecificationExecutor<PropertiesEntity> {

        }