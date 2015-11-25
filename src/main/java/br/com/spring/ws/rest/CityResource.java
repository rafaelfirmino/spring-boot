package br.com.spring.ws.rest;


import br.com.spring.repository.model.AirportEntity;
import br.com.spring.service.FlightService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by rafaelfirmino on 24/11/15.
 */
@RestController
@RequestMapping(value = "/city")
public class CityResource {

    private static final Logger logger = LoggerFactory.getLogger(CityResource.class);

    @Autowired
    private FlightService flightService;

    @RequestMapping(value="/search/{cityName}", method= RequestMethod.GET)
    public List<AirportEntity> search(@PathVariable String cityName){

        logger.info("City method started.");

        return flightService.retrieveAirportByCity(cityName);
    }
}
