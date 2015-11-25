package br.com.spring.service;

import br.com.spring.repository.model.AirportEntity;

import java.util.List;

/**
 * Created by rafaelfirmino on 24/11/15.
 */
public interface FlightService {
    List<AirportEntity> retrieveAirportByCity(String city);
}
