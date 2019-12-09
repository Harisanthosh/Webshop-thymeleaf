package de.rhaudi.transfactrestserver.entities.artikel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtikelRep extends JpaRepository<ArtikelEntity, Long>, JpaSpecificationExecutor<ArtikelEntity> {

}