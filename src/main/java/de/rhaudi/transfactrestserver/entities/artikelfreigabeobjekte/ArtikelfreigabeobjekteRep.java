package de.rhaudi.transfactrestserver.entities.artikelfreigabeobjekte;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtikelfreigabeobjekteRep extends JpaRepository<ArtikelfreigabeobjekteEntity, Long>, JpaSpecificationExecutor<ArtikelfreigabeobjekteEntity> {

        }