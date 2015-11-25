package br.com.spring.service;

import br.com.spring.repository.AirportRepository;
import br.com.spring.repository.model.AirportEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by rafaelfirmino on 24/11/15.
 */
@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private AirportRepository airportRepository;

    @Override
    public List<AirportEntity> retrieveAirportByCity(final String city){
        return airportRepository.findByCityIgnoreCase(city);
    }
}
