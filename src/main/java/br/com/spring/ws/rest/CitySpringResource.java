package br.com.spring.ws.rest;


import br.com.spring.repository.model.AirportEntity;
import br.com.spring.service.FlightService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rafaelfirmino on 24/11/15.
 */
@RestController
@RequestMapping(value = "/city")
public class CitySpringResource {

    private static final Logger logger = LoggerFactory.getLogger(CitySpringResource.class);

    @Autowired
    private FlightService flightService;

    @RequestMapping(value="/search", method= RequestMethod.GET)
    public List<AirportEntity> search(@RequestParam(value = "city") String city){

        logger.info("City method started.");

        return flightService.retrieveAirportByCity(city);
    }
}
