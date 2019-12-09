package de.rhaudi.transfactrestserver.entities.chargen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargenRep extends JpaRepository<ChargenEntity, Long>, JpaSpecificationExecutor<ChargenEntity> {

}