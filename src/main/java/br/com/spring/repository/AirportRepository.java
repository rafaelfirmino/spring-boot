package br.com.spring.repository;

import br.com.spring.repository.model.AirportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rafaelfirmino on 24/11/15.
 */
@Repository
public interface AirportRepository extends JpaRepository<AirportEntity, Long> {

    List<AirportEntity> findByCityIgnoreCase(String city);
}
